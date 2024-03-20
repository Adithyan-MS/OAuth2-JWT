package com.example.OAuth2JWT;

import com.example.OAuth2JWT.Config.RSAKeyRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RSAKeyRecord.class)
@SpringBootApplication
public class OAuth2JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2JwtApplication.class, args);
	}

}
