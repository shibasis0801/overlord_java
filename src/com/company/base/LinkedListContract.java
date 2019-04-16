package com.company.base;

import java.util.ArrayList;

public interface LinkedListContract<Value> {

    boolean isEmpty();

    NodeContract<Value> getHead();
    NodeContract<Value> getTail();

    void pushBack(Value value);
    Value popBack();

    void pushFront(Value value);
    Value popFront();

    default ArrayList<Value> asArrayList() {
        ArrayList<Value> elements = new ArrayList<>();

        NodeContract<Value> head = getHead();

        while (head != null) {
            elements.add(head.getValue());
            head = head.getNext();
        }

        return elements;
    }

}
