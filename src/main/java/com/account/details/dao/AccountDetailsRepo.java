package com.account.details.dao;

import com.account.details.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDetailsRepo  extends JpaRepository <AccountEntity, String>
{
    @Query("SELECT A FROM AccountEntity A WHERE A.userID = ?1")
    List<AccountEntity> findAccountDetails(String userId);
}
