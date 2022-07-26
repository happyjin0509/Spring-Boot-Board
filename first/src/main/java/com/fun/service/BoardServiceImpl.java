package com.fun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fun.mappers.BoardMapper;
import com.fun.vo.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<Board> getBoardList() {
		
		return boardMapper.selectBoardList();
	}

	@Override
	public void insertBoard(Board board) {
		boardMapper.insertBoard(board);
		
	}

	@Override
	public Board getBoardContent(int article_no) {
		Board board = boardMapper.getBoardContent(article_no);
		boardMapper.updateViewCnt(article_no);
		return board;
		
	}

}
