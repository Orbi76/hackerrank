import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class RouletteNumbers {

   public static int rouletteNumbers(int neighbour){
        int result = 3;
  //      int firstOBJECT = (int) runum.get(0);
 //       int size = runum.size();


   /*    for (int next : runum) {
        System.out.println(next);
           osszeg += i;

       }
       for (int i : ar) {
           osszeg += i;

       }
       for (int i=0; i<runum.size(); i++){
            int next = runum.get(i);

       }
*/
        return result + neighbour;
    }

    public static void give2nebArray(int [] rouletSzamokArray, int neighbour){


        // int szamok[] = {1,2,3,4,5} ;
     //  ArrayList[] szamok;
       int x = 2;//rouletSzamokArray.indexOf(neighbour);
    //   int jo = x+2;
    //   int ba = x-2;
        System.out.println(rouletSzamokArray);
     //  System.arraycopy(runum,2,szamok,0,4);
        int [] szamok = Arrays.copyOfRange(rouletSzamokArray, 0, 5);
        System.out.println("szamok");
        for (int i=0; i<szamok.length; i++){
            System.out.print(szamok[i]+" ");
        }
      // return szamok;
    //   */
        System.out.println("give2neb ez " +neighbour+"   ");
       // return szamok;
    }

    public static int  twoNebList(ArrayList<Integer> rouletSzamokArrayList, int neighbour) {
        int result = 0;
        int rouletSzamokArrayListSize = rouletSzamokArrayList.size();
        int s = 2;
        int b = rouletSzamokArrayList.get(neighbour);
        int a = rouletSzamokArrayList.indexOf(neighbour);
        int c = rouletSzamokArrayList.get(a);
        int d = 0;
    /*    for(int i =0; a-2<a+3; i++){
            d = runumb.get(a);
            System.out.println(a+" from for loop");

        }
*/
        System.out.println("Two neighbours of " + neighbour + " is:");
        System.out.println("towNeb psition of " + neighbour + " in array is: (index Of(neighbour)  " + a + " number in position is: get(a) " + c);
        System.out.println(neighbour + "\'s two neigbours is: " + rouletSzamokArrayList.get(a - 2) + " " + rouletSzamokArrayList.get(a - 1) + " " + c + " " + rouletSzamokArrayList.get(a + 1) + " " + rouletSzamokArrayList.get(a + 2));
        System.out.println("rouletSzamokArrayList size: " + rouletSzamokArrayListSize);
        int f = 0;
        for (int i = 0; i < rouletSzamokArrayList.size(); i++) {
            f = rouletSzamokArrayList.get(a);

            if (f == i) {
                System.out.println(f + " ez az f");


            }
        }
        System.out.println(rouletSzamokArrayList + "twoNebben");


        return f;
    }

    public static void main (String [] args) {
        // rouletteNumbers();
        Scanner scanner = new Scanner(System.in);
        int neighbour = scanner.nextInt();
        scanner.close();


        ArrayList<Integer> rouletSzamokArrayList = new ArrayList<Integer>(37); //(Arrays.asList(0, 32, 15, 19, 4, 21, 2, 25, 17, 34, 6, 27, 13, 36, 11, 30, 8, 23, 10, 5, 24, 16, 33, 1, 20, 14, 31, 9, 22, 18, 29, 7, 28, 12, 35, 3, 26));

        int [] rouletSzamokArray = new int[] {0, 32, 15, 19, 4, 21, 2, 25, 17, 34, 6, 27, 13, 36, 11, 30, 8, 23, 10, 5, 24, 16, 33, 1, 20, 14, 31, 9, 22, 18, 29, 7, 28, 12, 35, 3, 26};


        //  0-32-15-19-4-21-2-25-17-34-6-27-13-36-11-30-8-23-10-5-24-16-33-1-20-14-31-9-22-18-29-7-28-12-35-3-26

        rouletSzamokArrayList.add(0);
        rouletSzamokArrayList.add(32);
        rouletSzamokArrayList.add(15);
        rouletSzamokArrayList.add(19);
        rouletSzamokArrayList.add(4);
        rouletSzamokArrayList.add(21);
        rouletSzamokArrayList.add(2);
        rouletSzamokArrayList.add(25);
        rouletSzamokArrayList.add(17);
        rouletSzamokArrayList.add(34);
        rouletSzamokArrayList.add(6);
        rouletSzamokArrayList.add(27);
        rouletSzamokArrayList.add(13);
        rouletSzamokArrayList.add(36);
        rouletSzamokArrayList.add(11);
        rouletSzamokArrayList.add(30);
        rouletSzamokArrayList.add(8);
        rouletSzamokArrayList.add(23);
        rouletSzamokArrayList.add(10);
        rouletSzamokArrayList.add(5);
        rouletSzamokArrayList.add(24);
        rouletSzamokArrayList.add(16);
        rouletSzamokArrayList.add(33);
        rouletSzamokArrayList.add(1);
        rouletSzamokArrayList.add(20);
        rouletSzamokArrayList.add(14);
        rouletSzamokArrayList.add(31);
        rouletSzamokArrayList.add(9);
        rouletSzamokArrayList.add(22);
        rouletSzamokArrayList.add(18);
        rouletSzamokArrayList.add(29);
        rouletSzamokArrayList.add(7);
        rouletSzamokArrayList.add(28);
        rouletSzamokArrayList.add(12);
        rouletSzamokArrayList.add(35);
        rouletSzamokArrayList.add(3);
        rouletSzamokArrayList.add(26);

        // rouletteNumbers(neighbour);
      //  System.out.println(rouletteNumbers(neighbour));

        twoNebList(rouletSzamokArrayList,neighbour);
        give2nebArray(rouletSzamokArray,neighbour);
    }

}
