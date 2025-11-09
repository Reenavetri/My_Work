package Dailywork;

public class Replacechar {
    public static void main(String[] args) {
        String str = "Geeks Gor Geeks";
        int index = 6;
        char ch = 'F';
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index, ch);
        String result = sb.toString();
        System.out.println("Actual String : " + str);
        System.out.println("Expected String : " + result);
    }
}
