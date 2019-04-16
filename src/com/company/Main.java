package com.company;

import com.company.SingleList.SingleLinkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        for (int i = 1; i < 10; ++i) {
            list.pushBack(i);
        }

        ArrayList<Integer> array = list.asArrayList();
//        array.forEach(System.out::println);


        int sumSquaresEven = list
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .reduce((i, j) -> i + j);

        System.out.print("Sum of squares of even numbers (4 + 16 + 36 + 64) is ");
        System.out.println(sumSquaresEven);


        list.filter(i -> i % 2 == 0).map(i -> i * i).forEach(System.out::println);
    }
}
