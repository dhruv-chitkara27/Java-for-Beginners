public class Methods {

    //public - visible to everyone
    //private - visible only to class
    //protected - visible to the package and all subclass

    //modifier return-type method-name(Parameter list){
        //body
    //}




    public static void main(String args[]) {
        System.out.println("Hello World");
        sayHello();
        sayHello();

        int numberOne = 7;
        int numberTwo = 5;

        int result = minNumber(numberOne,numberTwo);

        System.out.println(result);

        //System.out.println(minNumber(numberOne, numberTwo));
    }

    public static void sayHello() {
        System.out.println("Hello Java");
        System.out.println("How are you?");

    }

    public static int minNumber(int num1, int num2) {
        int min;
        if(num1 > num2) {
            min = num2;
        }
        else {
            min = num1;
        }

        return min;
    }
}
