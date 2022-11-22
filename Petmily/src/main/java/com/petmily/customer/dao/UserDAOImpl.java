package com.petmily.customer.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petmily.customer.dto.PostingDTO;
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
	
	@Override
	public void insert(String uid, String upw, String uname, String uphone, String uemail, String unickname,
			String uaddress_basic, String uaddress_detail, String utype, String uimage) throws Exception {
		
		sqlSession.insert(nameSpace + ".insert");
	}
	
	@Override
	public int registerCheck(String uid) throws Exception {
		
		return sqlSession.selectOne(nameSpace + ".registerCheck");
	}
	
	@Override
	public UserDTO userInfo(String uid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(nameSpace + ".userInfo");
	}
	
	@Override
	public String selectUimage(String uid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(nameSpace + ".selectUimage");
	}

	@Override
	public String selectImage(String postingUid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(nameSpace + ".selectImage");
	}

	@Override
	public List<String> selectImageList(List<PostingDTO> commentList) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace + ".selectImageList");
	}
}
