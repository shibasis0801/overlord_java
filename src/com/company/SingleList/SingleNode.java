package com.company.SingleList;

import com.company.base.NodeContract;

public class SingleNode<Value> implements NodeContract<Value> {
    Value value;
    SingleNode<Value> next;

    public SingleNode(Value value) {
        this.value = value;
        this.next = null;
    }

    public SingleNode(Value value, SingleNode<Value> next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public Value getValue() {
        return value;
    }

    @Override
    public SingleNode<Value> getNext() {
        return next;
    }
}
