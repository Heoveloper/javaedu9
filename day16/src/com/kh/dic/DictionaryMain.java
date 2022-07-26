package com.kh.dic;

import java.util.*;

public class DictionaryMain {

    public static void main(String[] args) throws DictionaryException {
        TreeMap<String, String> dictionary = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        String vocabulary = null;
        String meaning = null;

        boolean stop = false;

        do {
            System.out.println();
            System.out.println("[영어단어장]");
            System.out.println("1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료");
            System.out.print(">> ");

            String menuNum = scanner.nextLine();
            switch (menuNum) {
                case "1":   //저장
                    System.out.println();
                    System.out.println("[단어 등록]");
                    System.out.print("새로 등록할 단어를 입력하세요 >> ");
                    String storeVocabulary = scanner.nextLine();
                    if (dictionary.containsKey(storeVocabulary.toLowerCase())) {
                        System.out.println("이미 등록되었습니다.");
                        continue;
                    } else if (dictionary.size() >= 5) {
                        System.out.println("최대 5개 단어만 저장할 수 있습니다.");
                    } else {
                        System.out.print("새로 등록할 단어의 뜻을 입력하세요 >> ");
                        String storeMeaning = scanner.nextLine();
                        dictionary.put(storeVocabulary.toLowerCase(), storeMeaning);
                        System.out.println("입력하신 단어가 등록되었습니다.");
                        System.out.println("단어: " + storeVocabulary.toLowerCase() + ", 뜻: " + storeMeaning);
                        System.out.println(dictionary);
                    }
                    break;

                case "2":   //검색
                    System.out.println();
                    System.out.println("[단어 검색]");
                    System.out.print("검색하실 단어를 입력하세요 >> ");
                    String searchVocabulary = scanner.nextLine();
//                    System.out.println("단어: " + searchVocabulary.substring(0));
                    if (dictionary.containsKey(searchVocabulary.toLowerCase()) == false) {
                        System.out.println("단어를 검색할 수 없습니다.");
                    } else {
                        System.out.print("단어: " + searchVocabulary.toLowerCase());
                        System.out.println(", 뜻: " + dictionary.get(searchVocabulary.toLowerCase()));
                    }
                    break;

                case "3":   //수정
                    System.out.println();
                    System.out.println("[단어 수정]");
                    System.out.print("수정하실 단어를 입력하세요 >> ");
                    String modifyVocabulary = scanner.nextLine();
                    if (dictionary.containsKey(modifyVocabulary.toLowerCase()) == false) {
                        System.out.println("단어를 검색할 수 없습니다.");
                    } else {
                        System.out.println("현재 '" + modifyVocabulary.toLowerCase() + "'의 뜻: " + dictionary.get(modifyVocabulary.toLowerCase()));
                        System.out.println();
                        System.out.print("수정을 원하는 뜻으로 재입력하세요 >> ");
                        String modifyMeaning = scanner.nextLine();
                        dictionary.replace(modifyVocabulary.toLowerCase(), modifyMeaning);
                        System.out.println("단어의 뜻을 수정하였습니다.");
                        System.out.println("'" + modifyVocabulary.toLowerCase() + "'의 뜻이 '" + modifyMeaning + "'로 수정되었습니다.");
                    }
                    break;

                case "4":   //삭제
                    System.out.println();
                    System.out.println("[단어 삭제]");
                    System.out.print("삭제하실 단어를 입력하세요 >> ");
                    String deleteVocabulary = scanner.nextLine();
                    if (dictionary.containsKey(deleteVocabulary.toLowerCase()) == false) {
                        System.out.println("단어를 검색할 수 없습니다.");
                    } else {
                        dictionary.remove(deleteVocabulary.toLowerCase());
                        System.out.println("단어를 삭제하였습니다.");
                    }
                    break;

                case "5":   //목록
                    outer:
                    System.out.println();
                    System.out.println("[목록 조회]");
                    System.out.println("1.사전순 오름차순 2.사전순 내림차순");
                    System.out.print("정렬 방법을 선택하세요 >> ");
                    String arrayNum = scanner.nextLine();
                    switch (arrayNum) {
                        case "1":   //오름차순
                            System.out.println(dictionary);
                            break;
                        case "2":   //내림차순
                            System.out.println(dictionary.descendingMap());
                            break;
                        default:
                            System.out.println("1~2번 오름차순, 내림차순 중 선택하세요.");
                    }
                    break;

                case "6":   //색인
                    System.out.println();
                    System.out.println("[단어 색인]");
                    System.out.println("알파벳을 입력하면 해당 알파벳으로 시작하는 단어를 오름차순으로 색인합니다.");
                    System.out.print("알파벳(1자) >> ");
                    String searchAlphabet = scanner.nextLine();
                    SortedMap<String, String> subMap = dictionary.subMap(searchAlphabet, "u");
                    System.out.println(subMap);
                    break;

                case "7":   //통계
                    System.out.println();
                    System.out.println("[단어장 부가정보]");
                    System.out.println("저장된 단어 개수: " + dictionary.size());
                    System.out.println("글자 수가 가장 많은 단어: ");
                    System.out.println("단어 글자 수 내림차순 출력: ");
                    TreeSet<Dictionary> dictionaryTreeSet = new TreeSet<>(new Comparator<Dictionary>() {
                        @Override
                        public int compare(Dictionary o1, Dictionary o2) {
                            int result = 0;
                            if (o1.getVocabulary().length() > o2.getVocabulary().length()) {
                                result = -1;
                            } else if (o1.getVocabulary().length() < o2.getVocabulary().length()) {
                                result = 1;
                            }
                            return result;
                        }
                    });
                    System.out.println(dictionaryTreeSet);
                    break;

                case "8":   //종료
                    System.out.println("단어장을 닫습니다.");
                    stop = true;
                    break;

                default:
                    System.out.println("1~8번의 메뉴 번호를 입력해주세요.");
            }
        } while (!stop);
    }
}
