package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@GetMapping("/list")
    // => @RequestMapping(value="list", method=RequestMethod.GET)
    public void boardListGET() {
        
        log.info("게시판 목록 페이지 진입");
        
    }
    
    @GetMapping("/enroll")
    // => @RequestMapping(value="enroll", method=RequestMethod.GET)
    public void boardEnrollGET() {
        
        log.info("게시판 등록 페이지 진입");
        
    }

    @GetMapping("/custom")
    public void boardCustomGET() {
    	log.info("custom 페이지 진입");
    }
    
    /* 게시판 등록처리 */
    @PostMapping("/enroll")
    public void boardEnrollPOST(BoardVO board) {
        
        log.info("BoardVO : " + board);
        
    }
}