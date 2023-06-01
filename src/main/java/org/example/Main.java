package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Iterator iterator = new Randoms().getIterator();
            if (iterator.hasNext()) {
                System.out.println("Случайное число: " + iterator.next());
            } else {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}