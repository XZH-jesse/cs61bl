public class TriangleDrawer {

    public static void drawTriangle() {
        // your code here
        int SIZE = 5;
        int row = 0;
        while (row < SIZE) {
            int col = 0;
            while(col <= row) {
                col = col + 1;
                System.out.print('*');
            }
            row = row + 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // your code here
        drawTriangle();
    }


}
