package com.security.q8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SpringBootSecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user")
				.password("$2a$12$gYFB9D/PeqAJTHNAre7uqeqq3FmMVzRiabcNeFIQTMURWJiqHcC1i").roles("USER").and()
				.withUser("admin").password("$2a$12$Ra/IjZfhqbKatR8zRFLVreUs7vbtSgRpfH8SRRPHQGvrtYVBqlHlC")
				.roles("ADMIN");
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/").hasAnyRole("USER", "ADMIN").antMatchers("/admin")
				.hasAnyRole("ADMIN").antMatchers("/user").hasAnyRole("USER", "ADMIN").and().rememberMe()
				.userDetailsService(userDetailsService()).and().formLogin().loginPage("/login").permitAll()
				.failureUrl("/errort");

	}

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
}