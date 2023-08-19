package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private ArrayList<BookDTO> bookList;
    public BookManager() {

        bookList = new ArrayList<BookDTO>();
    }

    public void addBook(BookDTO book)  {
        bookList.add(book);
    }
    public void deleteBook(int key) {
        if(key != 0 ){
            key--;
        }
        bookList.remove(key);

    }
    public void searchBook(String btitle) {

        int result = -1;

        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getTitle().equals(btitle)){
                result = i;
                break;
            }
        }

        if(result > -1){
            System.out.println(bookList.get(result));
        }else {
            System.out.println("조회된 도서가 목록에 없습니다.");
        }

    }
    public void displayAll() {
        //도서목록 전체 출력

        if (bookList.size() > 0) {
            for (BookDTO bookDTO : bookList) {
                System.out.println(bookDTO);
            }
        } else {
            System.out.println("출력결과가 없습니다.");
        }
    }
    public List<BookDTO> sortedBookList(int type) {

        switch (type){
            case 1 : bookList.sort(new AscBookNo());
                break;
            case 2 : bookList.sort(new DescBookNo());
                break;
            case 3 : bookList.sort(new AscBookTitle());
                break;
            case 4 : bookList.sort(new DescBookTitle());
                break;
        }

        return bookList;

    }
    public void printBookList(List<BookDTO> printList) {
        for(BookDTO bd : printList) {
            System.out.println(bd);
        }
    }
}
