


import java.util.ArrayList;
import java.util.List;


public class CompareTriplets {
  //  Integer[] a = {6,3,2};
    //Integer[] b = {2,3,4};

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        int ap = 0;
        int bp = 0;


        for (int i=0; i < 3; i++){
            int apoint = a.get(i);
            int bpoint = b.get(i);



            if (apoint > bpoint) {
                ap += 1;
            }
            else if (apoint < bpoint) {
                bp += 1;
            }

        }
        List<Integer> ered = new ArrayList<>();
        ered.add(ap);
        ered.add(bp);
        System.out.println(ered);
        return ered;

        }

    public static void main(String[] args) {
      //  List<Integer> a = {6,3,2};
      //  List<Integer> b = new int[2, 3, 4];
       // compareTriplets();

        List<Integer> a = new ArrayList<Integer>(){{
            add(6);
            add(3);
            add(2);
        }};
        List<Integer> b = new ArrayList<Integer>(){{
            add(2);
            add(3);
            add(4);
        }};
        compareTriplets(a,b);
      //  System.out.println(ered);
        //compareTriplets(List<Integer> a,List<Integer> b);

    }
}
