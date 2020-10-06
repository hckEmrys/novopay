package com.scaler.novopay.service;

import com.scaler.novopay.exceptions.WalletNotFoundException;
import com.scaler.novopay.models.Wallet;
import com.scaler.novopay.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    public void addAmountToWallet(String mobileNumber,Double additionalAmount) throws Exception {
        Optional<Wallet> wallet = walletRepository.findById(mobileNumber);
        wallet.orElseThrow(WalletNotFoundException::new);
        Wallet w = wallet.get();
        w.setAvailableAmount(w.getAvailableAmount()+additionalAmount);
        walletRepository.save(w);
        return;
    }

}
