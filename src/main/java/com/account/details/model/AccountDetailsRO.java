package com.account.details.model;


import javax.validation.constraints.NotNull;
import java.util.Date;

public class AccountDetailsRO {

    @NotNull
    private int accountNumber;

    @NotNull
    private String accountName;

    @NotNull
    private String accountType;

    private Date balanceDate;

    @NotNull
    private String currency;

    @NotNull
    private double opngAvlbBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getOpngAvlbBalance() {
        return opngAvlbBalance;
    }

    public void setOpngAvlbBalance(double opngAvlbBalance) {
        this.opngAvlbBalance = opngAvlbBalance;
    }
}
