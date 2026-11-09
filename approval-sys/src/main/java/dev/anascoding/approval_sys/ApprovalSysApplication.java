package dev.anascoding.approval_sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;
import org.springframework.boot.security.autoconfigure.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(
  exclude = {
    SecurityAutoConfiguration.class,
    UserDetailsServiceAutoConfiguration.class
  }
)
public class ApprovalSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprovalSysApplication.class, args);
	}

}
