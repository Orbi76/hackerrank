public class aVeryBigSum {
    static long aVeryBigSum(long[] ar) {
    /*
           long sum = 0;
            for (int i=0; i<ar.length; i++){
            long arElem = ar[i];
                sum += arElem;
            }

            return sum;
            */
        ///*
        long sum = 0;
        for (long i : ar) {
            sum += i;

        }
        // System.out.println(sum);
        return sum;
        //*/
    }

    public static void main(String[] args) {

        long[] ar = {1000000001,1000000002,1000000003,1000000004,1000000005};

        aVeryBigSum(ar);
        System.out.println(aVeryBigSum(ar));
    }



}


