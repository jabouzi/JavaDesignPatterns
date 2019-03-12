package com.skanderjabouzi.open.close;

public class Product {
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
