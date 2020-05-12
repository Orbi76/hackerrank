public class JavaSubstringComparisons {


    public static void main(String[]args){
        String s = "welcometojava";
        System.out.println(getSmallestAndLargest(s,3));

    }

    public static String getSmallestAndLargest(String s,int k ){
        String actual_substring = s.substring(0,k);
        String smallest = actual_substring;
        String largest = actual_substring;

        for (int i =0; i<= s.length() - k; i++){
            actual_substring = s.substring(i,i+k);
            if (actual_substring.compareTo(largest)>0){
                largest = actual_substring;
            }
            if (actual_substring.compareTo(smallest)<0){
                smallest = actual_substring;
            }
        }
        return smallest + "\n" + largest;
    }
}
