package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import lombok.RequiredArgsConstructor;

@EnableWebSecurity // WebSecurity関連の設定であること示すアノテーション
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// /loginは認証不要であること,それ以外は認証を求めること
		http.authorizeRequests()
				.antMatchers("/login/**").permitAll()
				.anyRequest().authenticated()

		// 認証方式はフォーム認証であること
			.and()
			.formLogin()
			.usernameParameter("name")
			.passwordParameter("password")
				.loginPage("/login")
			
		// ログアウト処理
			.and()
			.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login");
				
	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(NoOpPasswordEncoder.getInstance());
	}


}
