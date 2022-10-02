package com.example.spring.common;

public enum ResultCode {

    //1000 성공
    SUCCESS(1000,"성공"),

    //2000 유저 관련
    NOT_EXISTS_USER(2000, "해당 유저가 존재하지 않습니다."),
    FAIL_TO_SAVE_USER(2001, "유저 정보 저장을 실패했습니다."),


    //3000 게시글 관련
    NOT_EXISTS_BOARD(3000, "존재하지 않는 게시물입니다."),
    FAIL_TO_SAVE_BOARD(3001, "게시글 저장을 실패했습니다."),


    //4000 댓글 관련
    NOT_EXISTS_COMMENT(4000, "존재하지 않는 댓글입니다."),
    FAIL_TO_SAVE_COMMENT(4001, "댓글 저장을 실패했습니다."),


    //9000 번대
    DB_ERROR(9998, "DB오류 입니다."),
    ETC_ERROR(9999, "알 수 없는 이유로 실패했습니다.");

    private int code;
    private String msg;
    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
