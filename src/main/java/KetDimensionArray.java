public class KetDimensionArray {

    public static void main(String[]args){

        ketDimensionArray();

        ketDimStringArray();
    }

    static int[][] ketDimensionArray(){

        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        return arr;
    }


    static String [][] ketDimStringArray(){
        String[][] arrStr = new String[3][4];
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                arrStr[i][j] = "Str" + j;
                System.out.print(arrStr[i][j] + " ");
            }
            System.out.println("");
        }


        return arrStr;

    }
}
