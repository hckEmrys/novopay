package com.scaler.novopay.repository;

import com.scaler.novopay.models.Wallet;
import org.springframework.data.repository.CrudRepository;

public interface WalletRepository extends CrudRepository<Wallet,String> {
}
