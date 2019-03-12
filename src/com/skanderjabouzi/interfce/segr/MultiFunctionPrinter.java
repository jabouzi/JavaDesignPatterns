package com.skanderjabouzi.interfce.segr;

public class MultiFunctionPrinter implements BadMachine {
    @Override
    public void print(Document d) {
        System.out.println("Print");
    }

    @Override
    public void fax(Document d) {
        System.out.println("Send Fax");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Scan");
    }
}
