package com.example.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.dto.MemInfoVO;
import com.example.dto.MemberVO;

@Repository
public interface memberMapper {
    
    List<MemberVO> getList();
    
    List<MemberVO> search(String searchText);

	List<MemInfoVO> selectMemCode(MemInfoVO meminfoVO);
    
}