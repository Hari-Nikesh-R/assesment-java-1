package org.example;

public class Bike implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bike is running");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {

            }
        }
    }
}
