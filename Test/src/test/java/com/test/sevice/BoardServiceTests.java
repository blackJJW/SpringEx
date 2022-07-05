package com.test.sevice;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.model.BoardVO;
import com.test.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);
	
	@Autowired
    private BoardService service;
    
    @Test
    public void testEnroll() {
        
        BoardVO vo = new BoardVO();
        
        vo.setTitle("service test");
        vo.setContent("service test");
        vo.setWriter("service test");
        
        service.enroll(vo);
        // BoardService 인터페이스의 enroll함수를 호출하면
        // 매핑되어 이쓴 BoardMapper.xml의 id가 enroll인 쿼리가 실행
        
    }
    
    /* 게시판 목록 테스트 */
    @Test
    public void testGetList() {
        
        service.getList().forEach(board -> log.info("" + board));        
        
    }
}
