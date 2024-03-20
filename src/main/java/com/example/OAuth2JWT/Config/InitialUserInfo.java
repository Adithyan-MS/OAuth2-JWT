package com.example.OAuth2JWT.Config;

import com.example.OAuth2JWT.Entity.UserModel;
import com.example.OAuth2JWT.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
@Slf4j
public class InitialUserInfo implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        UserModel manager = new UserModel();
        manager.setUsername("Manager");
        manager.setPassword(passwordEncoder.encode("password"));
        manager.setRoles("ROLE_MANAGER");
        manager.setEmailId("manager@manager.com");

        UserModel admin = new UserModel();
        admin.setUsername("Admin");
        admin.setPassword(passwordEncoder.encode("password"));
        admin.setRoles("ROLE_ADMIN");
        admin.setEmailId("admin@admin.com");

        UserModel user = new UserModel();
        user.setUsername("User");
        user.setPassword(passwordEncoder.encode("password"));
        user.setRoles("ROLE_USER");
        user.setEmailId("user@user.com");

        userRepository.saveAll(List.of(manager,admin,user));
    }
}
