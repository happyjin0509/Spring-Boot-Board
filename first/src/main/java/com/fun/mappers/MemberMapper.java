package com.fun.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.fun.vo.Member;

@Mapper
public interface MemberMapper {

	Member getMemberById(String id);
	
}
