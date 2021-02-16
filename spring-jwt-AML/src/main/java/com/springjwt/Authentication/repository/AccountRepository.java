package com.springjwt.Authentication.repository;

import com.springjwt.Authentication.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository <Account,Long>{
public List<Account> findByUserId(Long UserId);

}
