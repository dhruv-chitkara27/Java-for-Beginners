public class DoWhile {
        public static void main(String args[]) {
            int myVariable = 1;

            while(myVariable <= 100) {
                System.out.println(myVariable);
                myVariable++;
            }

            System.out.println("I am out of the loop");

            //Do While loop
            do {
                System.out.println(myVariable);
                myVariable++;
            }while(myVariable < 10);
        }
    }


