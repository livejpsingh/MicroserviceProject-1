package com.programmerpoints.user.repos;

import com.programmerpoints.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}