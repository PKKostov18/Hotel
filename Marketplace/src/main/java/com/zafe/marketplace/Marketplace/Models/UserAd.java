package com.zafe.marketplace.Marketplace.Models;

import javax.persistence.*;

@Entity
@Table
public class UserAd {
    @Id
    @GeneratedValue
    private int userAdId;
    @ManyToOne
    @JoinColumn(name= "userId")
    private User user;
    @ManyToOne
    @JoinColumn(name= "adId")
    private Ad ad;


    //Constructor
    public UserAd(int userAdId, User user, Ad ad) {
        this.userAdId = userAdId;
        this.user = user;
        this.ad = ad;
    }

    public UserAd() {

    }

    //Getters and setters
    public int getUserAdId() {
        return userAdId;
    }

    public void setUserAdId(int userAdId) {
        this.userAdId = userAdId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }

    //toString
    @Override
    public String toString() {
        return "UserAd{" +
                "userAdId=" + userAdId +
                ", user=" + user +
                ", ad=" + ad +
                '}';
    }
}
