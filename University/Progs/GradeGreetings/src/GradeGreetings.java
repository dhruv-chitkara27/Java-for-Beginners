public class GradeGreetings {

    public static void main(String args[]) {
        char grade;

        //System.out.println("Enter your grade : ");
        grade = 'A';
        //Scanner in = new Scanner(System.in);
        //grade = in.nextChar();
        switch(grade) {

            case 'A':
                System.out.println("Amazing work there. Keep going");
                break;
            case 'B':
                System.out.println("You can do Better");
                break;
            case 'C':
                System.out.println("Little more hard work , Buddy");
                break;
            case 'D':
                System.out.println("Ohh boy , Get serious");
                break;
            case 'E':
                System.out.println("Almost got failed , somehow just got it");
                break;
            case 'F':
                System.out.println("You need to focus on studies");
                break;
            default:
                System.out.println("Grade can only be A to F");
        }
    }
}
