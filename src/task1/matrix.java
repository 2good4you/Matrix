package task1;

import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;


public class matrix {

//    public static byte inputArrayIndex() {
//        byte a = 0;
//        Scanner sc = new Scanner(System.in);
//
//        if (sc.hasNextByte()) {
//            a = sc.nextByte();
//        }
//
//        return a;
//    }

    public static byte inputArrayIndex() {
        byte a;
        Scanner sc = new Scanner(System.in);

        String b = sc.nextLine();
        a = Byte.parseByte(b);

        return a;
    }

    public static void arrayFill(int arr[][], int input) {
        Random rand = new Random();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                arr[i][j] = rand.nextInt(200) - 100;
            }
        }
    }

    public static void spiralMethodOut(int arr[][], int input, int index) throws Exception {
        FileOutputStream spiral = new FileOutputStream("spiral.txt");
        String fileOut;

        for (int col = 0, row = 0; col < input / 2; ) {


            for (int i = row; i < index; i++) {
                fileOut = Integer.toString(arr[col][i]) + " ";
                spiral.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[col][i]);
            }
            for (int i = col; i < index; i++) {
                fileOut = Integer.toString(arr[i][index]) + " ";
                spiral.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[i][index]);
            }
            for (int i = index; i > row; i--) {
                fileOut = Integer.toString(arr[index][i]) + " ";
                spiral.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[index][i]);
            }
            for (int i = index; i > col; i--) {
                fileOut = Integer.toString(arr[i][row]) + " ";
                spiral.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[i][row]);
            }

            col += 1;
            row += 1;
            index -= 1;
        }

        if (input == 1) {
            fileOut = Integer.toString(arr[0][0]) + "\r\n";
            spiral.write(fileOut.getBytes());
//            System.out.println(arr[0][0]);
        } else if (input % 2 != 0) {
            fileOut = Integer.toString(arr[input / 2][input / 2]) + "\r\n";
            spiral.write(fileOut.getBytes());
//            System.out.printf("%d\n", arr[input/2][input/2]);
        } else {
            fileOut = "\r\n";
            spiral.write(fileOut.getBytes());
//            System.out.println();
        }

        spiral.flush();
        spiral.close();
    }

    public static void matrixMethodOut(int arr[][], int input, int index) throws Exception {
        FileOutputStream matrix = new FileOutputStream("matrix.txt");
        String fileOut;

        for (int col = 0; col < input; col++) {
            for (int row = 0; row < index; row++) {
                fileOut = Integer.toString(arr[col][row]) + "\t";
                matrix.write(fileOut.getBytes());
//                System.out.printf("%4d ", arr[col][row]);
            }
            fileOut = Integer.toString(arr[col][index]) + "\r\n";
            matrix.write(fileOut.getBytes());
//            System.out.printf("%4d\n", arr[col][index]);
        }

        matrix.flush();
        matrix.close();
    }

    public static void snakeMethodOut(int arr[][], int input, int index) throws Exception {
        FileOutputStream snake = new FileOutputStream("snake.txt");
        String fileOut;

        for (int col = index, row = 0; col > 0; ) {

            for (int i = index; i >= 0; i--) {
                fileOut = Integer.toString(arr[col][i]) + " ";
                snake.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[col][i]);
            }
            col -= 1;
            for (int i = row; i <= index; i++) {
                fileOut = Integer.toString(arr[col][i]) + " ";
                snake.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[col][i]);
            }
            col -= 1;
        }

        if (input % 2 != 0) {
            for (int i = index; i > 0; i--) {
                fileOut = Integer.toString(arr[0][i]) + " ";
                snake.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[0][i]);
            }
            fileOut = Integer.toString(arr[0][0]) + "\r\n";
            snake.write(fileOut.getBytes());
//            System.out.printf("%d\n", arr[0][0]);
        } else {
            fileOut = "\r\n";
            snake.write(fileOut.getBytes());
//            System.out.println();
        }

        snake.flush();
        snake.close();
    }

    public static void choseMethods(int method, int arr[][], int input, int index) throws Exception {

        switch (method) {
            case 1:
                System.out.println("Your have chosen 1st method: matrix");
                matrixMethodOut(arr, input, index);
                break;
            case 2:
                System.out.println("Your have chosen 2nd method: spiral");
                spiralMethodOut(arr, input, index);
                break;
            case 3:
                System.out.println("Your have chosen 3rd method: matrix");
                snakeMethodOut(arr, input, index);
                break;
            case 4:
                System.out.println("Your have chosen all methods");
                matrixMethodOut(arr, input, index);
                spiralMethodOut(arr, input, index);
                snakeMethodOut(arr, input, index);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        int input = 0, index, arr[][], method = 0;

        do {
            try {
                System.out.println("enter the vule from 1 to 10");
                input = inputArrayIndex();
            } catch ( NumberFormatException e) {
                System.out.println("вы ввели некоректное число");
                continue;
            }
            System.out.println("вы ввели некоректное число");
        } while ( input > 10 | input < 1 );

        index = input - 1;
        arr = new int[input][input];

        do {
            System.out.println("chose method");
            System.out.println("1. matrix method");
            System.out.println("2. spiral method");
            System.out.println("3. snake method");
            System.out.println("4. all methods");
            try {
                System.out.println("enter the vule from 1 to 10");
                method = inputArrayIndex();
            } catch ( NumberFormatException e) {
                System.out.println("вы ввели некоректное число");
                continue;
            }
            System.out.println("вы ввели некоректное число");
        } while (method > 4 | method < 1);

        arrayFill(arr, input);
        choseMethods(method, arr, input, index);

    }
}

