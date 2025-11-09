package Dailywork;

public class FindMax {
        public static void main(String[] args) {
            int x = 7;
            int y = 20;
            int z = 56;

            if (x > y && x > z) {
                System.out.println("Max num is : " + x);
            } else if (y > x && y > z) {
                System.out.println("Max num is : " + y);
            } else {
                System.out.println("Max num is : " + z);
            }
        }
    }


