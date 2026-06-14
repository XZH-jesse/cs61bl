public class TriangleDrawer2 {
    public static void drawTriangle() {
        // your code here
        int SIZE = 5;
        for (int row = 0; row < SIZE; row += 1) {
            for (int col = 0; col <= row; col += 1) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // your code here
        drawTriangle();
    }
}
