package com.board.users.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.users.domain.UserDTO;

@Mapper
public interface UserMapper {

	void insertUser(UserDTO userDTO);

	List<UserDTO> getUserList();

	void deleteUser(UserDTO userDTO);

	UserDTO getUser(UserDTO userDTO);

	void update(UserDTO userDTO);

}
