package com.skanderjabouzi.interfce.segr;

public class JustPrinter implements Printer {

    @Override
    public void print(Document d) {
        System.out.println("Print From JustPrinter");
    }
}
