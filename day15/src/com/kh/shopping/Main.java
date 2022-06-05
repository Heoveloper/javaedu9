package com.kh.shopping;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //1 상품 생성(5개)
        Product p1 = new Product("아메리카노", 4_000);
        Product p2 = new Product("카페라떼", 4_500);
        Product p3 = new Product("마끼아또", 5_000);
        Product p4 = new Product("프라페", 5_500);
        Product p5 = new Product("생과일주스", 6_000);

        //2 장바구니 생성
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        //3 장바구니에 상품 담기
        shoppingBasket.put(p1);
        shoppingBasket.put(p2);
        shoppingBasket.put(p3);
        shoppingBasket.put(p4);
        shoppingBasket.put(p5);

        System.out.println(shoppingBasket);

//        Integer x = 1;  //auto boxing
//        int z = x;      //auto unboxing
//        Integer y = new Integer(1);
//        int z = y.intValue();


        //4 가격내림차순으로 정렬하기
        Comparator<Product> comp1 = new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                //case1)
//                int result = 0;
//                if (p1.getPrice() > p2.getPrice()) {
//                    result = 1;
//                } else if (p1.getPrice() < p2.getPrice()) {
//                    result = -1;
//                }
//                return result * -1;

                //case2)
                Integer priceOfp1 = p1.getPrice();
                Integer priceOfp2 = p2.getPrice();
                return priceOfp1.compareTo(priceOfp2);
            }
        };

        //5 장바구니2 생성
        ShoppingBasket shoppingBasket2 = new ShoppingBasket(comp1);

        //5-1 장바구니에 상품 담기
        shoppingBasket2.put(p1);
        shoppingBasket2.put(p2);
        shoppingBasket2.put(p3);
        shoppingBasket2.put(p4);
        shoppingBasket2.put(p5);

        System.out.println(shoppingBasket2);


        //6 가격오름차순으로 정렬하기
        Comparator<Product> comp2 = new Comparator<>() {
            @Override
            public int compare(Product p1, Product p2) {
                int result = 0;
                if (p1.getPrice() > p2.getPrice()) {
                    result = 1;
                } else if (p1.getPrice() < p1.getPrice()) {
                    result = -1;
                }
                return result;
            }
        };

        //7 장바구니 생성
        ShoppingBasket shoppingBasket3 = new ShoppingBasket(comp2);

        //7-1 장바구니에 상품 담기
        shoppingBasket3.put(p1);
        shoppingBasket3.put(p2);
        shoppingBasket3.put(p3);
        shoppingBasket3.put(p4);
        shoppingBasket3.put(p5);

        System.out.println(shoppingBasket3);


        //8 상품명으로 오름차순 정렬하기
        Comparator<Product> comp3 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {

                return o1.getProductName().compareTo(o2.getProductName());
            }
        };

        //9 장바구니 생성
        ShoppingBasket shoppingBasket4 = new ShoppingBasket(comp3);

        //9-1 장바구니에 상품 담기
        shoppingBasket4.put(p1);
        shoppingBasket4.put(p2);
        shoppingBasket4.put(p3);
        shoppingBasket4.put(p4);
        shoppingBasket4.put(p5);
        System.out.println(shoppingBasket4);


        //10 상품명으로 내림차순 정렬하기

        Comparator<Product> comp4 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {

                return o1.getProductName().compareTo(o2.getProductName()) * -1;
            }
        };

        //11 장바구니 생성
        ShoppingBasket shoppingBasket5 = new ShoppingBasket(comp4);

        //11-1 장바구니에 상품 담기
        shoppingBasket5.put(p1);
        shoppingBasket5.put(p2);
        shoppingBasket5.put(p3);
        shoppingBasket5.put(p4);
        shoppingBasket5.put(p5);
        System.out.println(shoppingBasket5);
    }
}
