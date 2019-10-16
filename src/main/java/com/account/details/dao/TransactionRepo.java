package com.account.details.dao;

import com.account.details.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TransactionRepo extends JpaRepository<TransactionEntity,Integer> {

    @Transactional
    @Query("SELECT A FROM TransactionEntity A WHERE A.accountNumber = ?1")
    List<TransactionEntity> getTrnDtlsForAccountNbr(int accountNbr);

}
