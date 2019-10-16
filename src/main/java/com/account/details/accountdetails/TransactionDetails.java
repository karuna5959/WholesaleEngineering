package com.account.details.accountdetails;

import com.account.details.dao.TransactionDetailsImpl;
import com.account.details.entity.TransactionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionDetails {

    @Autowired
    private TransactionDetailsImpl impl;

    @RequestMapping("/transactionDetails")
    public List<TransactionEntity> getTransactionDetails(@RequestParam("accountNumber") int accountID)
    {
        return  impl.getAcctTrnDetailsForAccNbr(accountID);

    }
}
