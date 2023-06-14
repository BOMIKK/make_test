package com.example.service;

import java.util.List;

import com.example.dto.MemInfoVO;
import com.example.dto.MemberVO;


public interface MemberService {
	public List<MemberVO> selectMember() throws Exception;

	public void regist(MemberVO memberVo);
	
	public MemberVO selectOne(String id) throws Exception;

	public void update(MemberVO memberVo);

	public void delete(String id);
	
	
	public List<MemberVO> getList() throws Exception;
	
	public List<MemberVO> search(String searchText);

	public List<MemInfoVO> selectMemCode(MemInfoVO meminfoVO);
}
