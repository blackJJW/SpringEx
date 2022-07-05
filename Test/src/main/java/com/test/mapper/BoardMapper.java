package com.test.mapper;

import java.util.List;

import com.test.model.BoardVO;

public interface BoardMapper {
	/* 글 등록 */
    public void enroll(BoardVO board);
    
    /* 게시판 목록 */
    public List<BoardVO> getList();
}
