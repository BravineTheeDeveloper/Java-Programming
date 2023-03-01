public class NestedLoops {
    //outer loop that iterates through the rows
    public static void main(String[] args) {
        //inner loop iterates through the columns
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                //if current row is one or current row and column are equal, print "&"
                if (i == 1 || i == j) {
                    System.out.print("& ");
                } 
                //if current row is more than one or current row and column are not equal, print "*"
                else {
                    System.out.print("* ");
                }
            }
            //Move to the next line after each row is printed
            System.out.println();
        }
    }
}
