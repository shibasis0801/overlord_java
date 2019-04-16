package com.company.base;

public interface NodeContract<Value> {
    Value getValue();
    NodeContract<Value> getNext();
}
