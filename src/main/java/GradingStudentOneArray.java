import java.util.ArrayList;
import java.util.List;

public class GradingStudentOneArray {


    static int gradingStudentOneArray(List<Integer> ar) {

        int osszeg = 0;
        for (int i : ar) {
            osszeg += i;

        }
        // System.out.println(osszeg);
        return osszeg;

    }

  //  static int gradingStudent(List<Integer> arr) {
 /*       int grade = 0;


        for (int i = 0; i < 4; i++) {

            int score = arr.get(i);
          //  int diff = score % 5;
            int k = 0;


            if (score >= 38) {
                grade = score;
                System.out.println(grade);
                return grade;


        /*        if (score % 5 <= 3) {


                     System.out.println(grade);
                    return score;

                }
         */
 /*if (score % 5 > 3) {

                    k = score / 5;
                    grade = (k + 1) * 5;
                    System.out.println(grade);
                }
                return grade;

            }

        }
        return grade;

    }
*/
 //   }
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<Integer>() {{
            add(4);
            add(73);
            add(67);
            add(38);
            add(33);

        }};

        List<Integer> arr = new ArrayList<Integer>() {{
            add(4);
            add(73);
            add(67);
            add(38);
            add(33);

        }};

        System.out.println(ar);
        //   simpleArraySum(ar);


        System.out.println(gradingStudentOneArray(ar));
        System.out.println("masik");
       // System.out.println(gradingStudent(arr));
    }


}
