package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Ship ship1 = new Ship ("Ship1", 10);
        Ship ship2 = new Ship ("Ship2", 10);
        Ship ship3 = new Ship ("Ship3", 10);

        ExecutorService dock = Executors.newFixedThreadPool(2);

        dock.execute(ship1);
        dock.execute(ship2);
        dock.execute(ship3);
        dock.shutdown();

    }
}
