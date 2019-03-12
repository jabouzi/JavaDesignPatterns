package com.skanderjabouzi;

import com.skanderjabouzi.generics.GenericType;
import com.skanderjabouzi.interfce.segr.*;
import com.skanderjabouzi.liskov.sub.Rectangle;
import com.skanderjabouzi.liskov.sub.Square;
import com.skanderjabouzi.open.close.*;
import com.skanderjabouzi.single.resp.Journal;
import com.skanderjabouzi.single.resp.Persistence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        //Generics
        GenericType<String> stringGenericType = new GenericType<>();
        stringGenericType.set("Skander");

        GenericType<Integer> integerGenericType = new GenericType<>();
        integerGenericType.set(100);

        Product ball = new Product("Ball", Color.RED, Size.SMALL);
        GenericType<Product> productGenericType = new GenericType<>();
        productGenericType.set(ball);


        List<GenericType> arr = new ArrayList<>();
        arr.add(stringGenericType);
        arr.add(integerGenericType);
        arr.add(productGenericType);

        for(GenericType genericType: arr) {
            System.out.println(genericType.get());
        }

        GenericType<String> stringGenericType2 = new GenericType<>();
        stringGenericType.set("Skander");

        System.out.println(GenericType.isEqual(stringGenericType, stringGenericType2));

        System.out.println();

        // SRP
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        String filename = "/tmp/journal.txt";
        persistence.saveToFile(journal, filename, true);

        //Runtime.getRuntime().exec("open " + filename);
        System.out.println();

        //OPC
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        Product door = new Product("Door", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple, tree, house, door);
        System.out.println("Green products (old):");
        ProductFilter productFilter = new ProductFilter();
        productFilter.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p.name + " is green"));

        System.out.println();

        BetterFilter betterFilter = new BetterFilter();
        System.out.println("Green products (new):");
        betterFilter.filter(products, new ColorSpecification(Color.GREEN)).forEach(p -> System.out.println(p.name + " is green"));

        System.out.println();
        System.out.println("Large and blue products:");
        betterFilter.filter(products, new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE))).forEach(p -> System.out.println(p.name + " is large and blue"));

        System.out.println();
        System.out.println("Door product:");
        betterFilter.filter(products, new NameSpecification("Door")).forEach(p -> System.out.println(p.name + " Equals Door"));

        System.out.println();
        System.out.println("Large and blue and Door products:");
        betterFilter.filter(products, new AndPlusSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE), new NameSpecification("Door"))).forEach(p -> System.out.println(p.name + " is large and blue and door"));

        System.out.println();

        //LKS
        Rectangle rectangle = new Rectangle(2, 3);
        useIt(rectangle);

        Rectangle square = new Square();
        square.setWidth(5);
        useIt(square);
        square.setHeight(20);
        useIt(square);

        System.out.println();

        // ISP

        Document document = new Document();
        MutlifunctionDevice mutlifunctionDevice = new MutlifunctionDevice(new JustPrinter(), new JustScanner());
        mutlifunctionDevice.print(document);
        mutlifunctionDevice.scan(document);
    }

    public static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }
}
