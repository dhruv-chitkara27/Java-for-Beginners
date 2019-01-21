public class ArrayExcercise {
    public static void main(String args[]) {

        //declare int Array
        int[] excerciseArray = {3,4,2,7,3,4,5,44,33,22,66,22};



        //print array elements
        for(int i=0;i<excerciseArray.length;i++) {

            System.out.println("Element is " + excerciseArray[i]);
        }


        //find the largest number

        int largest = excerciseArray[0];
        for(int i=1;i<excerciseArray.length;i++) {
            if(excerciseArray[i] > largest) {
                largest = excerciseArray[i];
            }
        }
        System.out.println("Largest number is : " + largest);


        //sum up all numbers
        int sum = 0;
        for(int i=0;i<excerciseArray.length;i++) {
            sum = sum+excerciseArray[i];
        }

        System.out.println("Total is " + sum);
    }
}
