package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDAO;
import com.example.dto.MemInfoVO;
import com.example.dto.MemberVO;
import com.example.mapper.memberMapper;


@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO dao;
	
	@Autowired(required=false)
	//@Autowired
	private memberMapper mMapper;

	@Override
	public List<MemberVO> selectMember() throws Exception {
		return dao.selectMember();
	}

	@Override
	public void regist(MemberVO memberVo) {
		// TODO Auto-generated method stub
		 dao.regist(memberVo);
	}

	@Override
	public MemberVO selectOne(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectOne(id);
	}

	@Override
	public void update(MemberVO memberVo) {
		// TODO Auto-generated method stub
		dao.update(memberVo);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public List<MemberVO> getList() throws Exception {
		// TODO Auto-generated method stub
		return mMapper.getList();
	}

	@Override
	public List<MemberVO> search(String searchText) {
		// TODO Auto-generated method stub
		return mMapper.search(searchText);
	}

	@Override
	public List<MemInfoVO> selectMemCode(MemInfoVO meminfoVO) {
		// TODO Auto-generated method stub
		return mMapper.selectMemCode(meminfoVO);
	}
}
