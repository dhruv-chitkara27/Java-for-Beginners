import java.util.ArrayList;

public class Geny {

    public static void main(String args[]) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        //ArrayList arrayList =>> We can also use this but then it will
        //also take string and double values which will be wrong in some cases

        arrayList.add(23);
        arrayList.add(24);
        arrayList.add(25);
        arrayList.add(26);

        for(Object i : arrayList) {
            System.out.println(i);
        }
    }
}
