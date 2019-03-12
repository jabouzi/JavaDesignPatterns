package com.skanderjabouzi.open.close;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(product -> product.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(product -> product.size == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products.stream().filter(product -> product.color == color && product.size == size);
    }
}
