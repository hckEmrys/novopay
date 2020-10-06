package com.scaler.novopay.restcontroller;

import com.scaler.novopay.exceptions.WalletNotFoundException;
import com.scaler.novopay.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WalletController {


    @Autowired
    private WalletService walletService;

    @RequestMapping("/wallet/add/{walletId}/amount/{amountId}")
    public String addValue(@PathVariable String walletId,@PathVariable Double amountId) throws Exception {
        try
        {
            walletService.addAmountToWallet(walletId,amountId);
        }
        catch (WalletNotFoundException w)
        {
            return "NOK";
        }
        return "OK";
    }

}
