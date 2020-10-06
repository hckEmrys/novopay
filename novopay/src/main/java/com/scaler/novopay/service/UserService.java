package com.scaler.novopay.service;

import com.scaler.novopay.models.User;
import com.scaler.novopay.models.Wallet;
import com.scaler.novopay.repository.UserRepository;
import com.scaler.novopay.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WalletRepository walletRepository;

    /*Wallet wallet = new Wallet("9482482208",1000.0);
    Wallet wallet1 = new Wallet("1482482208",2000.0);

    public ArrayList<Wallet> wallets = new ArrayList<Wallet>(Arrays.asList(wallet,wallet1));

    private List<User> users = new ArrayList<>(Arrays.asList(new User("1","Arun",wallet),
            new User("1","Akshya",wallet1)));*/



    public List<User> getUsers()
    {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }


    public void registerUser(User user)
    {
        /*Wallet newWallet = user.getWallet();
        wallets.add(newWallet);
        //users.add(users.get(0));
        users.add(new User(user.getId(),user.getUserName(),newWallet));
        return;*/
        walletRepository.save(user.getWallet());
        userRepository.save(user);
    }






}
