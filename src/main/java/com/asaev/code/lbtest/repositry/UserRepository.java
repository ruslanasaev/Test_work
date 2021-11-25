package com.asaev.code.lbtest.repositry;

import com.asaev.code.lbtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
