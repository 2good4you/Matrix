package test;


import java.io.FileOutputStream;

public class Methods {
    inputIndex a = new inputIndex();
    arrayFill array = new arrayFill();

    int input;
    int index = input - 1;
    int arr[][] = array.arr;

    public Methods ( int input, int arr[][]) {
        this.input = input;
        this.arr = arr;
    }

    public Methods () {

    }

    public void spiralMethodOut() throws Exception {
        FileOutputStream spiral = new FileOutputStream("C://spiral.txt");
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

        if ( input == 1 ) {
            fileOut = Integer.toString(arr[0][0]) + "\r\n";
            spiral.write(fileOut.getBytes());
//            System.out.println(arr[0][0]);
        } else if ( input % 2 != 0 ) {
            fileOut = Integer.toString(arr[input/2][input/2]) + "\r\n";
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

    public void matrixMethodOut () throws Exception {
        FileOutputStream matrix = new FileOutputStream("C://matrix.txt");
        String fileOut;

        for ( int col = 0; col < input; col++ ) {
            for ( int row = 0; row < index; row++ ) {
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

    public void snakeMethodOut() throws Exception {
        FileOutputStream snake = new FileOutputStream("C://snake.txt");
        String fileOut;

        for ( int col = index, row = 0; col > 0; ) {

            for ( int i = index; i >= 0; i-- ) {
                fileOut = Integer.toString(arr[col][i]) + " ";
                snake.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[col][i]);
            }
            col -= 1;
            for ( int i = row; i <= index; i++ ) {
                fileOut = Integer.toString(arr[col][i]) + " ";
                snake.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[col][i]);
            }
            col -= 1;
        }

        if ( input % 2 != 0 ) {
            for ( int i = index; i > 0; i-- ) {
                fileOut = Integer.toString(arr[0][i]) + " ";
                snake.write(fileOut.getBytes());
//                System.out.printf("%d ", arr[0][i]);
            }
            fileOut = Integer.toString(arr[0][0]) + "\r\n";
            snake.write(fileOut.getBytes());
//            System.out.printf("%d\n", arr[0][0]);
        } else {
            fileOut =  "\r\n";
            snake.write(fileOut.getBytes());
//            System.out.println();
        }

        snake.flush();
        snake.close();
    }

}
