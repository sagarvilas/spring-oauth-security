package com.boot.security.oauth.securityoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug=true)
public class SecurityOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityOauthApplication.class, args);
	}
}
