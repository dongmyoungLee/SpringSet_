package com.example.spring.controller;

import com.example.spring.service.BoardService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    private static final Logger logger = LogManager.getLogger(BoardController.class);
    private BoardService boardService;

    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }


}
