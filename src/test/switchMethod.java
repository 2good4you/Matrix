package test;

public class switchMethod {
    inputIndex value = new inputIndex(1, 4);
    Methods m = new Methods();
    int method = value.scanUntil();

    public void switchMethod () throws Exception {

        switch( method ) {
            case 1:
                System.out.println("Your have chosen 1st method: matrix");
                m.matrixMethodOut();
                break;
            case 2:
                System.out.println("Your have chosen 2nd method: spiral");
                m.spiralMethodOut();
                break;
            case 3:
                System.out.println("Your have chosen 3rd method: matrix");
                m.snakeMethodOut();
                break;
            case 4:
                System.out.println("Your have chosen all methods");
                m.matrixMethodOut();
                m.spiralMethodOut();
                m.snakeMethodOut();
                break;
            default:
                break;
        }
    }
}
