package com.zafe.marketplace.Marketplace.Models;

import javax.persistence.*;


@Entity
@Table(name = "Advertisements")
public class Ad {
    @Id
    @GeneratedValue
    private int adId;
    @Column
    private String adName;
    @Column
    private String adDescription;
    @Column
    private double price;
    @Column
    private String adType;
    @Column
    private String adOrganisation;

    //Constructor
    public Ad(int adId, String adName, String adDescription, double price, String adType, String adOrganisation) {
        this.adId = adId;
        this.adName = adName;
        this.adDescription = adDescription;
        this.price = price;
        this.adType = adType;
        this.adOrganisation = adOrganisation;
    }

    public Ad() {

    }


    //Getters and setters
    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdDescription() {
        return adDescription;
    }

    public void setAdDescription(String adDescription) {
        this.adDescription = adDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public String getAdOrganisation() {
        return adOrganisation;
    }

    public void setAdOrganisation(String adOrganisation) {
        this.adOrganisation = adOrganisation;
    }

    //toString
    @Override
    public String toString() {
        return "Ads{" +
                "adId=" + adId +
                ", adName='" + adName + '\'' +
                ", adDescription='" + adDescription + '\'' +
                ", price=" + price +
                ", adType='" + adType + '\'' +
                ", adOrganisation='" + adOrganisation + '\'' +
                '}';
    }
}
