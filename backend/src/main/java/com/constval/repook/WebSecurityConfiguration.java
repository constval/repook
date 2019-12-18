package com.constval.repook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebSecurity
@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

        @Bean
        public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//            http.authorizeExchange().anyExchange().permitAll(); //does not work
//            http.csrf().disable(); //does not work
            return http.build();
        }
    }