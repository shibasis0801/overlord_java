package com.company.base;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface LinkedListContract<Value> {

    boolean isEmpty();

    NodeContract<Value> getHead();
    NodeContract<Value> getTail();

    void pushBack(Value value);
    Value popBack();

    void pushFront(Value value);
    Value popFront();

    void forEach(Consumer<Value> action, NodeContract<Value> start, NodeContract<Value> stop);
    default void forEach(Consumer<Value> action, NodeContract<Value> start) {
        forEach(action, start, null);
    }
    default void forEach(Consumer<Value> action) {
        forEach(action, getHead(), null);
    }

    <Result> LinkedListContract<Result> map(Function<Value, Result> transform);
    LinkedListContract<Value> filter(Predicate<Value> condition);
    Value reduce(BiFunction<Value, Value, Value> accumulate);


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
