package com.account.details.accountdetails;

import com.account.details.dao.AccountDetailsImpl;
import com.account.details.dao.AccountDetailsRepo;
import com.account.details.exceptions.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AccountDetails {

    @Autowired
    AccountDetailsImpl accountDetailsService;

    @RequestMapping("/accountDetails")
    public  String getAccountDetails(@RequestParam("userName") String userName ) throws InvalidInputException {
        if(!StringUtils.isEmpty(userName))
        {
            accountDetailsService.findAccountDetails(userName);
        }
        else
        {
            throw new InvalidInputException("Input is not valid");

        }
        return "hello";

    }
}
