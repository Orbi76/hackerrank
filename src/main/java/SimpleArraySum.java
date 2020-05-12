import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {


    static int simpleArraySum(List<Integer> ar) {

        int osszeg = 0;
        for (int i :ar){
            osszeg += i;

        }
       // System.out.println(osszeg);
        return osszeg;

    }

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(10);
            add(11);
        }};

        System.out.println(ar);
     //   simpleArraySum(ar);

        System.out.println(simpleArraySum(ar));
    }
}

