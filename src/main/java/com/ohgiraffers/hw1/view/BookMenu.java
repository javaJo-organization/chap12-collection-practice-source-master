package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);

    BookManager bm = new BookManager();

    public BookMenu(){}

    public void mainMenu() {


        do{
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.println("메뉴 번호 선택 : ");
            int selectNo = sc.nextInt();

            BookMenu bookMenu = new BookMenu();

            switch (selectNo) {
                case 1:
                    bm.addBook(bookMenu.inputBook());
                    break;
                case 2:
                    bm.printBookList(selectSortedBook());
                    break;
                case 3:
                    bm.deleteBook(bookMenu.inputBookNo());
                    break;
                case 4:
                    bm.searchBook(bookMenu.inputBookTitle());
                    break;
                case 5: bm.displayAll();
                    break;
                case 6: System.out.println("프로그램을 종료합니다."); return;
                default:
                    System.out.println("번호를 잘못입력하셨습니다. 다시 입력해주세요.");
            }
        }while (true);


    }
    public BookDTO inputBook() {

        System.out.println("내용을 입력하세요.");
        System.out.print("도서번호(ISBN) : ");
        int bNo = sc.nextInt();
        System.out.println("도서 장르 (1: 인문 / 2: 자연과학 / 3: 의료 / 4: 기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.println("책 제목 : ");
        String title = sc.nextLine();
        System.out.println("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);
    }
    public int inputBookNo(){
        System.out.println("삭제할 도서의 번호를 입력하세요.");
        System.out.println("도서 번호 : ");

        return sc.nextInt();
    }
    public String inputBookTitle(){

        System.out.println("확인할 도서명을 입력하세요.");
        System.out.println("도서 제목 : ");

        return sc.nextLine();
    }

    public List<BookDTO> selectSortedBook(){

        System.out.println("*** 도서 정보 정렬 ***");
        System.out.println("1. 도서번호(ISBN)으로 오름차순정렬");
        System.out.println("2. 도서번호(ISBN)으로 내림차순정렬");
        System.out.println("3. 책 제목으로 오름차순정렬");
        System.out.println("4. 책 제목으로 내림차순정렬");
        System.out.println("번호 선택 : ");

        int bookSort = sc.nextInt();
        List<BookDTO> bookList = bm.sortedBookList(bookSort);

        return bookList;
    }
}



