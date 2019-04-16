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
        array.forEach(System.out::println);
    }
}
