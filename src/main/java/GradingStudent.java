public class GradingStudent {

    public static void main(String[] args) {


        int[][] arr;
        arr = new int[4][2];
        arr[0][0] = 1;
        arr[0][1] = 73;
        arr[1][0] = 2;
        arr[1][1] = 67;
        arr[2][0] = 3;
        arr[2][1] = 38;
        arr[3][0] = 4;
        arr[3][1] = 33;


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        GradingStudent(arr);
        //  System.out.println(GradingStudent(arr));

    }

    static int GradingStudent(int[][] arr) {
        int grade = 0;
       // int vege = 100;
       // int res = 0;

        //    int avgrade = 0;
        //    int n = 4;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int score = arr[i][j];
                int diff = arr[i][j] % 5;
                int k = 0;



                //  if (score < 40) {
                if (arr[i][j] < 38) {
              //      System.out.println(arr[i][j]);
                //    System.out.println(score);
                  //  System.out.println(diff);

                     grade = arr[i][j];
                    System.out.println(grade);


                } else if (diff <= 3) {
             //       System.out.println(score);
               //     System.out.println(diff);

                   grade = arr[i][j];
                    System.out.println(grade);

                } else if(diff > 3) {
                     k = arr[i][j] / 5;
                     grade = (k + 1) * 5;
                    System.out.println(grade);
            //        System.out.println(k);
              //      System.out.println(diff);
                //    System.out.println(score);
                  //  System.out.println(grade);
                   // return grade;

                }
             //   System.out.println("end of for j");
            }
         //   System.out.println("end of for i");
        }
      //  System.out.println("end of grading s");
        return grade;

    }
}


/*

List int grades = new ArrayList<int>(grades);
      for (int i = 0; i < grades.length; i++) {

            int diff = grades[i]%5;


          if (grades[i] < 38) {

                grade = grades[i];



            } else if (diff <= 3) {
                grade = grades[i];

            }
            else if (diff > 3) {
            //    int k = score/5;
              int k = grades[i]/5;
                grade = (k+1)*5;


            }

         }

       // return grade;
      */





