package com.skanderjabouzi.open.close;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
