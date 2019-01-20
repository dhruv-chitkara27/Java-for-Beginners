public class PatternC {
    public static void main(String args[]) {
        int i,j,l=1;
        for(i=5;i>0;i--) {
            for(j=0;j<i;j++) {
                System.out.print(j+1);
                l++;
            }
            System.out.println("");
        }
    }
}
