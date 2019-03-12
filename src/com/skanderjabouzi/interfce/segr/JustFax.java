package com.skanderjabouzi.interfce.segr;

public class JustFax implements Fax {

    @Override
    public void fax(Document d) {
        System.out.println("Fax from JustFax");
    }
}
