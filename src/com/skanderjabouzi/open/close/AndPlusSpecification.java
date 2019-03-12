package com.skanderjabouzi.open.close;

public class AndPlusSpecification<T> implements Specification<T> {
    private Specification<T> first, second, third;

    public AndPlusSpecification(Specification<T> first, Specification<T> second, Specification<T> third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item) && third.isSatisfied(item);
    }
}