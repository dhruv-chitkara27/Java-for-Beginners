public class Compare {
    public static void main(String args[]) {
        //declare two variables

        int numberOne = 356;
        int numberTwo = 465;

        if(numberOne > numberTwo) {
            System.out.println(numberOne + "is greater than " + numberTwo);
        }
        else if(numberTwo > numberOne) {
            System.out.println(numberTwo + "is greater than " + numberOne);
        }
        else {
            System.out.println(numberOne + "is equal to " + numberTwo);
        }
    }
}
