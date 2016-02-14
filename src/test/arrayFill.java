package test;

import java.util.Random;

public class arrayFill {
    Random rand = new Random();
    inputIndex a = new inputIndex();
    int input = a.a;
    int index = input - 1;
    int arr[][] = new int[index][index];

    public void fill() {
        for ( int i = 0; i < input; i++ ) {
            for (int j = 0; j < input; j++) {
                arr[i][j] = rand.nextInt(200) - 100;
            }
        }
    }
}


