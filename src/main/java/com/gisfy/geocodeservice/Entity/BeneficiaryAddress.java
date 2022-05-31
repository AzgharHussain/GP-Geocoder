package com.gisfy.geocodeservice.Entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "beneficiary_address")
public class BeneficiaryAddress {
    @Id
    @NonNull
    @Getter @Setter
    @Column(name = "id")
    private String uid;
    @Getter @Setter
    @Column(name = "active")
    private Boolean active;
    @Getter @Setter
    @Column(name = "created_at",columnDefinition = "BIGINT")
    private BigInteger createdAt;
    @Getter @Setter
    @Column(name = "created_by")
    private String createdBy;
    @Getter @Setter
    @Column(name = "deleted")
    private Boolean deleted;
    @Getter @Setter
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Getter @Setter
    @Column(name = "modified_at",columnDefinition = "BIGINT")
    private BigInteger modifiedAt;
    @Getter @Setter
    @Column(name = "synced_at")
    private Timestamp syncedAt;
    @Getter @Setter
    @Column(name = "address")
    private String address;
    @Getter @Setter
    @Column(name = "address_type")
    private String addressType;
    @Getter @Setter
    @Column(name = "block")
    private String block;
    @Getter @Setter
    @Column(name = "building_no_or_name")
    private String buildingNoOrName;
    @Getter @Setter
    @Column(name = "city")
    private String city;
    @Getter @Setter
    @Column(name = "country")
    private String country;
    @Getter @Setter
    @Column(name = "district")
    private String district;
    @Getter @Setter
    @Column(name = "latitude")
    private Double latitude;
    @Getter @Setter
    @Column(name = "longitude")
    private Double longitude;
    @Getter @Setter
    @Column(name = "panchayat")
    private String panchayat;
    @Getter @Setter
    @Column(name = "post_office")
    private String postOffice;
    @Getter @Setter
    @Column(name = "postal_code")
    private String postalCode;
    @Getter @Setter
    @Column(name = "state")
    private String state;
    @Getter @Setter
    @Column(name = "street")
    private String street;
    @Getter @Setter
    @Column(name = "taluk")
    private String taluk;
    @Getter @Setter
    @Column(name = "village")
    private String village;
    @Getter @Setter
    @Column(name = "beneficiary_id")
    private String beneficiary_id;
    @Getter @Setter
    @Column(name = "is_current")
    private Boolean isCurrent;
}
