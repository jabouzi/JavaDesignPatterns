package com.skanderjabouzi.interfce.segr;

public class OldFunctionPrinter implements BadMachine {
    @Override
    public void print(Document d) {
        System.out.println("Print");
    }

    @Override
    public void fax(Document d) {
        // Not needed
    }

    @Override
    public void scan(Document d) {
        // Not needed
    }
}
