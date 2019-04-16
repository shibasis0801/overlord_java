package com.company.SingleList;

import com.company.base.LinkedListContract;
import com.company.base.NodeContract;

public class SingleLinkedList<Value> implements LinkedListContract<Value> {

    SingleNode<Value> head, tail;

    public SingleLinkedList() {
        head = tail = null;
    }

    @Override
    public SingleNode<Value> getHead() {
        return head;
    }

    @Override
    public SingleNode<Value> getTail() {
        return tail;
    }

    @Override
    public void pushBack(Value value) {
        SingleNode<Value> newNode = new SingleNode<>(value);

        if (head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeTail() {
        if (head == tail) {
            // Will also work for list with no elements
            head = tail = null;
        }
        else {
            SingleNode<Value> iter = head;
            while (iter.next != tail) {
                iter = iter.next;
            }
            tail = iter;
        }
    }

    @Override
    public Value popBack() {
        Value value = null;

        if (tail != null)
            value = tail.value;

        removeTail();

        return value;
    }

    @Override
    public void pushFront(Value value) {
        SingleNode<Value> newNode = new SingleNode<>(value);

        if (head == null) {
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void removeHead() {
        if (head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
        }
    }

    @Override
    public Value popFront() {
        Value value = null;

        if (head != null)
            value = head.value;

        removeHead();

        return value;
    }

    @Override
    public boolean isEmpty() {
        return (head == tail) && (head == null);
    }
}
