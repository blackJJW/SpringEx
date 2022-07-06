package com.test.mapper;

import java.util.List;

import com.test.model.BoardVO;
import com.test.model.Criteria;

public interface BoardMapper {
	/* 글 등록 */
    public void enroll(BoardVO board);
    
    /* 게시판 목록 */
    public List<BoardVO> getList();
    
    /* 게시판 목록(페이징 적용) */
    public List<BoardVO> getListPaging(Criteria cri);
    // 함수 이름 : getListPaging
    // 이 함수가 실행될 때 필요한 데이터가 하나 있는 데 그놈의 데이터 타입이 Criteria야 한다.
    // 그 전달괸 참조형 변수를 이 함수 안에서는 cri 이름을  사용
    
    /* 게시글 조회 */
    public BoardVO getPage(int bno);
    
    /* 게시판 수정 */
    public int modify(BoardVO board);
    
    /* 게시판 삭제 */
    public int delete(int bno);
    
    /* 게시판 총 갯수 */
    public int getTotal();
}
