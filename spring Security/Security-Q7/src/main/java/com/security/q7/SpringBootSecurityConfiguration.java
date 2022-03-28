package com.security.q7;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringBootSecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("{noop}user").roles("USER").and().withUser("admin")
				.password("{noop}admin").roles("ADMIN");
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/").hasAnyRole("USER", "ADMIN").antMatchers("/admin")
				.hasAnyRole("ADMIN").antMatchers("/user").hasAnyRole("USER", "ADMIN").and().rememberMe()
				.userDetailsService(userDetailsService()).and().formLogin().loginPage("/login").permitAll()
				.failureUrl("/errort");

	}
}