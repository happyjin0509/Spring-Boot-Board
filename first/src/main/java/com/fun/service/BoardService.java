package com.fun.service;

import java.util.List;

import com.fun.vo.Board;

public interface BoardService {

	public List<Board> getBoardList();

	public void insertBoard(Board board);

	public Board getBoardContent(int article_no); 
	

}
