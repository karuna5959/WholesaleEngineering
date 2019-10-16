package com.account.details.accountdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@ComponentScan({"com.account.details.dao"})
@EntityScan("com.account.details.entity")
@EnableJpaRepositories("com.account.details.dao")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})*/
public class AccountdetailsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountdetailsApplication.class, args);
    }

}
