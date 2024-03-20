package com.example.OAuth2JWT.Repository;

import com.example.OAuth2JWT.Entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {

}
