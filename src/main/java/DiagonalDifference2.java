public class DiagonalDifference2 {

    static int DiagonalDifference2(int[][] arr) {

        // int absdiff = 0;
        int ltr = 0;
        int rtl = 0;

        int rows = arr.length;
        int columns = arr[0].length;

        int i = 0;
        int j = 0;
        int k = 0;
        int l = arr.length - 1;



        while (i < rows && j < columns && k < rows && l >= 0) {
            ltr += arr[i][j];
            rtl += arr[k][l];
            i += 1;
            j += 1;
            k += 1;
            l -= 1;
        }

        return Math.abs(ltr - rtl);


    }

    public static void main(String[] args) {

        int[][] arr;
        arr = new int[3][3];
        arr[0][0] = 11;
        arr[0][1] = 2;
        arr[0][2] = 4;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 10;
        arr[2][1] = 8;
        arr[2][2] = -12;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(arr[0][0]);
        DiagonalDifference2(arr);

        System.out.println(DiagonalDifference2(arr) + "Ezzel kell kiirni");

    }
}
