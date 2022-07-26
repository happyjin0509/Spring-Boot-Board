package com.fun.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fun.vo.Board;

@Mapper
public interface BoardMapper {

	List<Board> selectBoardList();

	void insertBoard(Board board);

	Board getBoardContent(int article_no);

	void updateViewCnt(int article_no);

	
}
