public class DiagonalDifference3 {

    static int DiagonalDifference3(int[][] arr) {

        // int absdiff = 0;
        int ltr = 0;
        int rtl = 0;

        int rows = arr.length;
        int columns = arr[0].length;

        int ii = 0;
        int j = 0;
        int k = 0;
        int l = arr.length - 1;
        int n = arr[0][0];

        for (int i = 0; i < n; i++) {
            ltr += arr[i][i];
            rtl += arr[(n - 1) - i][i];

        }


        System.out.println(ltr);
        System.out.println(rtl);
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
        DiagonalDifference3(arr);

        System.out.println(DiagonalDifference3(arr) + "Ezzel kell kiirni");

    }
}



