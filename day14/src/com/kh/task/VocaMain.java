package com.kh.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VocaMain {
    public static void main(String[] args) {
        Map<String, String> vocaNote = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String voca;
        String meaning;

        boolean stop = false; //do-while 제어

        do {

            System.out.println();
            System.out.println("[영어단어장]");
            System.out.println("1.등록 2.검색 3.수정 4.삭제 5.목록 6.종료");
            System.out.print(">> ");

            String menuNum = scanner.nextLine(); //메뉴 번호

            switch (menuNum) {
                case "1": //등록
                    System.out.println();
                    System.out.println("[단어 등록]");
                    System.out.print("새로 등록할 단어를 입력하세요 >> ");
                    voca = scanner.nextLine();
                    if (dupCheck(vocaNote, voca)) {
                        System.out.println("단어장에 이미 존재하는 단어입니다.");
                        continue;
                    } else {
                        System.out.print("등록할 단어의 뜻을 입력하세요 >> ");
                        meaning = scanner.nextLine();
                        vocaNote.put(voca, meaning);
                        System.out.println("입력하신 단어가 등록되었습니다.");
                        System.out.println("단어: " + voca + ", 뜻: " + meaning);
                    }
                    break;

                case "2": //검색
                    System.out.println();
                    System.out.println("[단어 검색]");
                    System.out.print("검색하실 단어를 입력하세요 >> ");
                    voca = scanner.nextLine();
                    if (vocaNote.containsKey(voca) == false) {
                        System.out.println("검색하신 단어는 단어장에 없습니다.");
                    } else {
                        System.out.println("'" + voca + "'의 뜻: " + vocaNote.get(voca));
                    }
                    break;

                case "3": //수정
                    System.out.println();
                    System.out.println("[단어 수정]");
                    System.out.print("수정하실 단어를 입력하세요 >> ");
                    voca = scanner.nextLine();
                    if (vocaNote.containsKey(voca) == false) {
                        System.out.println("입력하신 단어는 단어장에 없습니다.");
                    } else {
                    System.out.println("현재 '" + voca + "'의 뜻: " + vocaNote.get(voca));
                    System.out.println();
                    System.out.print("수정을 원하는 뜻으로 재입력하세요 >> ");
                    String meaningModify = scanner.nextLine();
                    vocaNote.replace(voca, meaningModify);
                    System.out.println("'" + voca + "'의 뜻이 '" + meaningModify + "'로 수정되었습니다.");
                    }
                    break;

                case "4": //삭제
                    System.out.println();
                    System.out.println("[단어 삭제]");
                    System.out.print("삭제하실 단어를 입력하세요 >> ");
                    voca = scanner.nextLine();
                    if (vocaNote.containsKey(voca) == false) {
                        System.out.println("입력하신 단어는 단어장에 없습니다.");
                    } else {
                    vocaNote.remove(voca);
                    System.out.println("'" + voca + "' 단어가 삭제되었습니다.");
                    }
                    break;

                case "5": //목록
                    System.out.println("");
                    System.out.println(vocaNote.toString());
                    System.out.println("등록된 단어 수: " + vocaNote.size() + "단어");
                    break;

                case "6": //종료
                    stop = true;
                    break;

                default:    //잘못된 입력
                    System.out.println("1~6번 항목의 번호를 입력해주세요.");
            }
        } while (!stop);
        System.out.println("단어장을 닫습니다.");
    }

    //중복 단어 확인
    private static boolean dupCheck(Map<String, String> vocaNote, String voca) {
        boolean dupChk = false;
            if (vocaNote.isEmpty()) {
                dupChk = false;
            } else if (vocaNote.containsKey(voca)) {
                dupChk = true;
        }
        return dupChk;
    }
}
