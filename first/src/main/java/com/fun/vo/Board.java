package com.fun.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Board {
	
	private int article_no;
	private String member_id;
	private String title;
	private String content;
	private Date regdate;
	private int read_cnt;
}
