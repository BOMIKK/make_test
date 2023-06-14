package com.example.dao;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.dto.MemberVO;


@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sqlSession;
	private static final String Namespace = "com.example.mapper.memberMapper";

	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		return sqlSession.selectList(Namespace + ".selectMember");
	}


	@Override
	public void regist(MemberVO memberVo) {
		sqlSession.insert(Namespace + ".insertMember",memberVo);
		
	}


	@Override
	public MemberVO selectOne(String id) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Namespace + ".selectOne", id);
	}


	@Override
	public void update(MemberVO memberVo) {
		// TODO Auto-generated method stub
		
		sqlSession.update(Namespace + ".updateMember",memberVo);
		
	}


	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		sqlSession.delete(Namespace + ".deleteMember", id);
	}

}