package com.account.details.dao;

import com.account.details.entity.TransactionEntity;
import com.account.details.exceptions.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class TransactionDetailsImpl {
    @Autowired
    TransactionRepo transactionRepo;
    @Transactional
    public List<TransactionEntity> getAcctTrnDetailsForAccNbr(@NotNull int accountNumber)
    {
         List<TransactionEntity> transactionList = transactionRepo.getTrnDtlsForAccountNbr(accountNumber);
         if(!CollectionUtils.isEmpty(transactionList))
         {
             return  transactionList;
         }
         else
         {
             new NoDataFoundException("TransactionDetails Data not found for Account Number " + accountNumber);
         }
         return null;
    }
}
