package com.skanderjabouzi.open.close;

public class NameSpecification implements Specification<Product> {

    private String name;

    public NameSpecification(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.name.equals(name);
    }
}
