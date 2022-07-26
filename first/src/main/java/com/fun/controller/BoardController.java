package com.fun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fun.service.BoardService;
import com.fun.vo.Board;

@Controller

public class BoardController {
	
	@Autowired
	BoardService boardService;

	@GetMapping("/boardList")
	public String boardList(Board board, Model model) {
		List<Board> boardList = boardService.getBoardList();
		model.addAttribute("boardList" , boardList);
		System.out.println("boardList >>>>>>>>>" + boardList);
		
		return "boardList";
		
	}
	
	@GetMapping("/boardForm")
	public String boardForm() {
		return "board";
	}
	
	@PostMapping("/saveBoard")
	public String saveBoard(@ModelAttribute("board") Board board, RedirectAttributes save) {
		System.out.println("board >>>>>>>>>" + board);
		boardService.insertBoard(board);
		return "redirect:/boardList ";
	}
	
	@GetMapping("/getBoardContent")
	public String getBoardContent(Model model, @RequestParam("article_no") int article_no ) {
		model.addAttribute("boardContent", boardService.getBoardContent(article_no));
		
		return "boardContent";
	}
	
}
