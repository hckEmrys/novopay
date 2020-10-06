package com.scaler.novopay.exceptions;


public class WalletNotFoundException extends Exception {
    public WalletNotFoundException() {
        super("Wallet not found exception");
    }

}
