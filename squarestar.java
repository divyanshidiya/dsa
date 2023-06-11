

public class squarestar {
     public static void main(String[] args) {
        int size = 5;  

        printSquareStar(size, size);
    }

    public static void printSquareStar(int size, int row) {
        if (row == 0) {
            return;
        }

        printStarRow(size, size);
        System.out.println();
        printSquareStar(size, row - 1);
    }

    public static void printStarRow(int size, int column) {
        if (column == 0) {
            return;
        }

        System.out.print("* ");
        printStarRow(size, column - 1);
    }
}
 

    
    

