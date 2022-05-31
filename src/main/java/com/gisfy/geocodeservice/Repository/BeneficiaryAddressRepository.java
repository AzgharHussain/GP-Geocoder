package com.gisfy.geocodeservice.Repository;

import com.gisfy.geocodeservice.Entity.BeneficiaryAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BeneficiaryAddressRepository extends JpaRepository<BeneficiaryAddress, String> {

    @Query("select address from BeneficiaryAddress address where address.postalCode is not null and address.latitude is null")
    List<BeneficiaryAddress> findAllByNonNullElements();
}
