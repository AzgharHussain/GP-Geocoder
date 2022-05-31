package com.gisfy.geocodeservice.Service;

import com.gisfy.geocodeservice.Entity.BeneficiaryAddress;
import com.gisfy.geocodeservice.Repository.BeneficiaryAddressRepository;
import com.gisfy.geocodeservice.Utils.Utils;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Component
public class GeoCodeService {

    @Autowired
    private BeneficiaryAddressRepository beneficiaryAddressRepository;


    @EventListener(ApplicationReadyEvent.class)
    @Scheduled(cron = "0 0 */2 * * ?")
    public void geoCodeTheAddress(){
        List<BeneficiaryAddress> addressList = beneficiaryAddressRepository.findAllByNonNullElements();
        for (BeneficiaryAddress address : addressList){
            try {
                String url = "https://www.mapquestapi.com/geocoding/v1/address?key=GwWAO46V97kkOsDFBlGX2dgjbiiOn1Dw&inFormat=kvp&outFormat=json&location="+address.getPostalCode()+"&thumbMaps=false";
                JSONObject json = new JSONObject(IOUtils.toString(new URL(url), StandardCharsets.UTF_8));
                JSONObject latLng = Utils.fetchLatLng(json);
                if (latLng != null){
                    address.setLatitude(latLng.getDouble("lat"));
                    address.setLongitude( latLng.getDouble("lng"));
                    beneficiaryAddressRepository.save(address);
                }
            } catch (JSONException | IOException e) {
                e.printStackTrace();
            }

        }
    }
}
