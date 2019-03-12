package com.skanderjabouzi.interfce.segr;

public class MutlifunctionDevice implements Photocopier {

    private Printer printer;
    private Scanner scanner;

    public MutlifunctionDevice(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void print(Document d) {
        printer.print(d);
    }

    @Override
    public void scan(Document d) {
        scanner.scan(d);
    }
}
