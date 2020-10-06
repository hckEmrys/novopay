package com.scaler.novopay.models;

import javax.persistence.*;

@Entity
public class User {

    @Id
    String id;

    String userName;

    @OneToOne
    Wallet wallet;



    public User()
    {

    }

    public User(String id, String userName, Wallet wallet) {
        this.id = id;
        this.userName = userName;
        this.wallet = wallet;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
