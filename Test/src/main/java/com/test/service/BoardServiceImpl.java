package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mapper.BoardMapper;
import com.test.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	// 스프링이 관리하는객체(빈)은 싱글톤패터능로 관리되어 1개의 인스턴스가 유지
	// Autowired를 통해서 new 생성자로 휴출헚이 그 객체를 사용가능
	
	// enroll 함수 안에서는 BoaedMapper의 인스턴스를 사용해야하는 데,
	// 그 인스턴스를 enroll 함수안에서 생성하는 것이 아니라 외부에서 생성된 것을 주입받아서 사용
	// 왜 enroll 함수 안에서 생성해서 사용하지 않고 외부에서 만등것을 주입받아서 사용?
	// 높은 응집도, 낮은 결합도를 위해서
	// 안에서 생성하게 되면, 어떤 생성자를 쑬지, 어떻게 생성할 지 등을 enroll을 만드는 개발자가 알아야된다.
	// 외부에서 주입받게 되면 어떻게 만들어졌는 지는 관심이 없다. 만들어져있는 것을 쓰기만 할거다.
	@Override
    public void enroll(BoardVO board) {
        
        mapper.enroll(board);
        
    }
	
	@Override
    public List<BoardVO> getList() {
        
        return mapper.getList();
    }
	
	/* 게시판 조회 */
    @Override
    public BoardVO getPage(int bno) {
         
        return mapper.getPage(bno);
    }
    
    /* 게시판 수정 */
    @Override
    public int modify(BoardVO board) {
        
        return mapper.modify(board);
    }
}
