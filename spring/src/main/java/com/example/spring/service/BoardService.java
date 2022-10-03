package com.example.spring.service;

import com.example.spring.common.Result;
import com.example.spring.common.ResultCode;
import com.example.spring.model.Board;
import com.example.spring.repository.BoardRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    private static final Logger logger = LogManager.getLogger(BoardService.class);

    private final BoardRepository boardRepository;


    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Result getBoards() {
        try {
            List<Board> boardList = boardRepository.findAll();
            return new Result(ResultCode.SUCCESS, boardList);
        } catch (Exception e) {
            return new Result(ResultCode.DB_ERROR);
        }
    }

    public Result getBoard(long id) {
        try {
            Optional<Board> optionalBoard = boardRepository.findById(id);
            if (optionalBoard.isEmpty()) {
                return new Result(ResultCode.NOT_EXISTS_BOARD);
            }
            Board board = optionalBoard.get();
            return new Result(ResultCode.SUCCESS, board);
        } catch (Exception e) {
            return new Result(ResultCode.DB_ERROR);
        }
    }
}
