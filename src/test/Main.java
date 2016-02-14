package test;

/**
 * Created by Богдан on 27.01.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        inputIndex a;


        a = new inputIndex();
        int b = a.scanUntil();
        System.out.println("________________");

        a = new inputIndex(1, 4);
        int c = a.scanUntil();
        System.out.println("________________");

    }
}
