import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class diagonalDifference{

    static int diagonalDifference(int [][]  arr){


       // int absdiff = 0;
        int ltr = 0;
        int rtl = 0;

        int rows = arr.length;
        int columns = arr[0].length;

        int i = 0;
        int j = 0;
        int k = 0;
        int l = arr.length - 1;

        while (i < rows && j < columns && k < rows && l >= 0){
            ltr += arr[i][j];
            rtl += arr[k][l];
            i += 1;
            j += 1;
            k += 1;
            l -= 1;
        }

            return Math.abs(ltr - rtl);
     //   absdiff = Math.abs(ltr - rtl);
       // System.out.println(absdiff);
     //   return absdiff;
//*/
     //System.out.println(arr);

    }
    static int enDiff( int [][]arr){
        int ltr = 0;
        int rtl = 0;

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                int sor = arr[i].length;
                int oszlop = arr[j].length;
                int k=0;
                int l=oszlop-1;

                if(i == j){
                    ltr += arr[i][j];
                   // System.out.println("ez ltr " + ltr);
                    System.out.println("sorO" + sor + oszlop);
                }



             //   while(sor==i && oszlop == j){
             //   if (k == j){
               //      rtl += arr[i][j];
                else if(k < sor && l >= 0){
                 //   while(k < sor && l >= 0) {

                        rtl += arr[k][l];
                        System.out.println("ki kellene irnod" + rtl);
                        k += 1;
                        l -= 1;
                  //  }

                }

                System.out.print(arr[i][j]);

            }
            System.out.println("");
            System.out.println("LTR osszege: " + ltr);
            System.out.println("RTL osszege: " + rtl);
        }




        return Math.abs(ltr - rtl);

    }

    public static void main(String[] args) {

        int[][] arr;
        arr = new int [3][3];
        arr[0][0] = 11;
        arr[0][1] = 2;
        arr[0][2] = 4;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 10;
        arr[2][1] = 8;
        arr[2][2] = -12;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //System.out.println(arr[0][0]);
        diagonalDifference(arr);
        System.out.println();
        System.out.println(diagonalDifference(arr) + " Ezzel kell kiirni");

        enDiff(arr);
        /*
                { 11, 2,4 }, { 4, 5,6 },{10, 8, -12} };
        System.out.println("hello");
        System.out.println(arr);
        diagonalDifference(arr [][]);
/*
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);
 */
    }




}


