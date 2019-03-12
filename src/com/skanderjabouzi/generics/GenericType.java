package com.skanderjabouzi.generics;

public class GenericType<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static <T> boolean isEqual(GenericType<T> t1, GenericType<T> t2) {
        return t1.get().equals(t2.get());
    }
}
