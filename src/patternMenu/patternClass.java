package patternMenu;

public class patternClass {
    public void printRectangle(int length, int breadth) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printSquare(int lengthSquare) {
        for (int i = 1; i <= lengthSquare; i++) {
            for (int j = 1; j <= lengthSquare; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
