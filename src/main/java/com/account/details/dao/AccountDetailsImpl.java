package com.account.details.dao;

import com.account.details.entity.AccountEntity;
import com.account.details.exceptions.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

@Service
public class AccountDetailsImpl {

    @Autowired
    AccountDetailsRepo accountDetailsRepo;

    @Transactional
    public List<AccountEntity> findAccountDetails(@NotNull String userId) {
        List<AccountEntity> accountEntities = accountDetailsRepo.findAccountDetails(userId);
       if(!CollectionUtils.isEmpty(accountEntities))
        {
           return  accountEntities;

        }else {
           new NoDataFoundException("Account Data not found for User " + userId);

       }
       return  null;
    }
}
