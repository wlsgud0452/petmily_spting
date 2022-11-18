package com.petmily.customer.dao;

import org.apache.ibatis.session.SqlSession;

import com.petmily.customer.dto.UserDTO;

public class UserDAOImpl implements UserDAO {
	
	SqlSession sqlSession;
	
	public static String nameSpace = "com.petmily.customer.dao.UserDAO";

	@Override
	public int userPwCheck(String uid, String upw) {
		
		return sqlSession.selectOne(nameSpace + ".userPwCheck");
	}

	@Override
	public UserDTO login(String uid, String upw) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(nameSpace + ".login");
	}

}