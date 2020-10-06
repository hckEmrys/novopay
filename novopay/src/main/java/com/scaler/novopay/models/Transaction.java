package com.scaler.novopay.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String transactionId;

    @OneToOne
    Wallet fromWallet;
    @OneToOne
    Wallet toWallet;

    Double commission;

    Double charge;

    Double amount;

    public Transaction() {
    }

    public Transaction(String transactionId, Wallet fromWallet, Wallet toWallet, Double commission, Double charge, Double amount) {
        this.transactionId = transactionId;
        this.fromWallet = fromWallet;
        this.toWallet = toWallet;
        this.commission = commission;
        this.charge = charge;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Wallet getFromWallet() {
        return fromWallet;
    }

    public void setFromWallet(Wallet fromWallet) {
        this.fromWallet = fromWallet;
    }

    public Wallet getToWallet() {
        return toWallet;
    }

    public void setToWallet(Wallet toWallet) {
        this.toWallet = toWallet;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
