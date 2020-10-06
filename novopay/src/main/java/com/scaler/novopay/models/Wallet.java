package com.scaler.novopay.models;

import javax.persistence.*;

@Entity
public class Wallet {

    @Id
    String mobileNumber; // This is generally your phone number

    Double availableAmount;

    public Wallet(String mobileNumber, Double availableAmount) {
        this.mobileNumber = mobileNumber;
        this.availableAmount = availableAmount;
    }


    public Wallet() {
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }
}
