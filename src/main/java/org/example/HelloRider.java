package org.example;

public class HelloRider extends Bike implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hello Jurrasic, i -> " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
            }}

        }
}
