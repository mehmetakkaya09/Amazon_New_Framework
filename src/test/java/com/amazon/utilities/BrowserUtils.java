package com.amazon.utilities;

public class BrowserUtils {

    public static  void wait(int time) {

        time *= 1000;

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
