package com.example.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity // WebSecurity関連の設定であること示すアノテーション
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// /loginは認証不要であること,それ以外は認証を求めること
		http.authorizeRequests()
			.mvcMatchers("/login").permitAll()
			.anyRequest().authenticated()
		
		// 認証方式はフォーム認証であること
			.and()
			.formLogin()
			.loginPage("/login");
	}

}
