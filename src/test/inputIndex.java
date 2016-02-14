package test;

import java.util.Scanner;

public class inputIndex {
    int x, y;
    byte a = 0;
    inputIndex() {
        x = 1;
        y = 10;
    }
    inputIndex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void inputIndex() {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        a = Byte.parseByte(b);
    }

    public byte scanUntil() {
        while ( a < x | a > y ) {
            System.out.println("введите чсло от " + x + " до " + y);
            try {
                inputIndex();
            } catch (Exception e) {
                System.out.println("введено неверное число");
            }
        }
        return a;
    }

}
