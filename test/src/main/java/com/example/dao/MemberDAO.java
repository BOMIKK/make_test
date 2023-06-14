package com.example.dao;

import java.util.List;

import com.example.dto.MemberVO;

public interface MemberDAO {
public List<MemberVO> selectMember() throws Exception;

public void regist(MemberVO memberVo);


public MemberVO selectOne(String id) throws Exception;

public void update(MemberVO memberVo);

public void delete(String id);



}