package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.domain.User;

@Mapper // mybatisのマッパーであることを示す
public interface UserRepository {

	@Select("select id, name, password, attribute_id from users where name = #{name}")
	Optional<User> findByName(String name);

	@Select("select id, name, password, attribute_id from users")
	List<User> findAll();

	@Insert("insert into users (name, password, attribute_id) values (#{name}, #{password}, #{attributeId})")
	void insert(@Param("name") String name, @Param("password") String password,
			@Param("attributeId") int attributeId);
}
