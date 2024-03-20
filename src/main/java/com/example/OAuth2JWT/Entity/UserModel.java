package com.example.OAuth2JWT.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String username;

    @Column(nullable = false,unique = true)
    private String emailid;

    @Column(nullable = false)
    private String password;

    @Column
    private String mobileNumber;

    @Column(nullable = false)
    private String roles;


}
