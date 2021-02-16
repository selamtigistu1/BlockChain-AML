package com.springjwt.Authentication.repository;

import com.springjwt.Authentication.model.Authority;
import com.springjwt.Authentication.model.UserRoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Long> {
    Authority findByName(UserRoleName name);

}
