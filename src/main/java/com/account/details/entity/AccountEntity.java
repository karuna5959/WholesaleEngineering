package com.account.details.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "AccountDetails")
public class AccountEntity {

    @Column(name="acc_nbr", nullable=false, length=50)
    private int accountNumber;

    @Column(name="acc_name`", nullable=false)
    private String accountName;

    @Column(name="acc_type`", nullable=false)
    private String accountType;

    @Column(name="bal_date``", nullable=false)
    private Date balanceDate;

    @Column(name="currency`", nullable=false)
    private String currency;

    @Column(name="curr_bal`", nullable=false)
    private double opngAvlbBalance;

    @Column(name="acc_user_name`", nullable=false)
    private String userID;

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

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
