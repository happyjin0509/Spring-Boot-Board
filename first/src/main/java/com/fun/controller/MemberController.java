package com.fun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fun.mappers.MemberMapper;
import com.fun.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	MemberMapper memberMapper;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/test")
	public void test() {}
	
	@GetMapping("/test2")
	public String test2(Model model, @RequestParam String id) {
		model.addAttribute("hi", "안녕하세요 타임리프 사용합니까? ㅋ");
		Member member = memberMapper.getMemberById(id);
		System.out.println("member ------------ "+  member);
		model.addAttribute("member", member);
		return "test";
	}
	
	
}
