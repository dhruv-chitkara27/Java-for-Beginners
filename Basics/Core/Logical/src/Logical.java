public class Logical {

    public static void main(String args[]) {
        boolean hasAccount = true;
        boolean isLoggedIn = false;
        boolean hasPaid = false;
        boolean fblogin = true;
        boolean googlelogin = false;
        boolean email = false;

        //returns true if both/all conditions are true
        System.out.println(fblogin || googlelogin || email);

    }
}
