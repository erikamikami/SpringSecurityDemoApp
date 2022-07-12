package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<User> USER_ROW_MAPPER = new BeanPropertyRowMapper<>(User.class);
	
	
	public User findByNameAndPassword(String name, String password) {
		String sql = "SELECT id, name, password, attribute_id FROM users WHERE id = :id AND password = :password";
		SqlParameterSource param = new MapSqlParameterSource().addValue("name", name).addValue("password", password);
		User user = template.queryForObject(sql, param, USER_ROW_MAPPER);
		return user;
	}
	
}
