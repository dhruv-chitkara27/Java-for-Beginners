import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String args[]) {

        //String[] stringArray = new String[10];
        //StringArray[0] = "delhi";

        //System.out.println(stringArray[0]);

        //Array List

        ArrayList<String> heroes = new ArrayList<String>();

        heroes.add("Narendra Modi");
        heroes.add("Hulk");
        heroes.add("Iron Man");
        heroes.add(0,"Captain America");

        System.out.println("My super hero is : " + heroes.get(0));
    }
}
