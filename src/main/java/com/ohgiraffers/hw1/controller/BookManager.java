package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    public BookManager() {
        /*리스트 초기화 작업*/

        ArrayList<BookDTO> booklist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    }

    public void addBook(BookDTO book)  {
        // 해당 BookDTO 객체를 리스트에 담기
    }
    public void deleteBook(int key) {
        //전달받은 위치의 인덱스 값 제거

    }
    public void searchBook(String btitle) {
        //전달받은 제목으로 리스트에서 조회하여 일치하는 객체가 ㅇ있으면
        // 해당 도서정보를 출력하고, 없는경우 "조회된 도서가 목록에 없습니다" 를 출력

    }
    public void displayAll() {
        //도서목록 전체 출력
    }
    public List<BookDTO> sortedBookList(int type) {
        // 정렬 방식 별 오름차순/내림차순 정렬 (switch문 이용)

        return null;

    }
    public void printBookList(List<BookDTO> printList) {
        // 전달받은 리스트 객체의 내용 출력
    }
}
