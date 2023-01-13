package org.example;

public class Main {
    public static void main(String[] args) {
        Website website = new Website();

        website.visit("100.1.1.1");
        website.visit("1.1.1.3");
        website.visit("100.1.1.1");
        website.visit("100.1.1.1");
        website.visit("100.1.1.1");

        website.visit("1.1.1.1");
        website.visit("1.1.1.1");
        website.visit("1.1.1.1");
        website.visit("1.1.1.2");
        website.visit("100.1.1.1");
        website.visit("100.1.1.1");

        website.visit("1.1.1.2");
        website.visit("1.1.1.2");
        website.visit("1.1.1.2");
        website.visit("1.1.1.2");
        website.visit("100.1.1.1");
        website.visit("100.1.1.1");

        website.visit("100.1.1.1");

        website.visit("1.1.1.2");
        website.visit("100.1.1.1");
        website.visit("100.1.1.1");
        website.visit("100.1.1.1");

        // website.traverseSort();
        website.top(100);

    }
}