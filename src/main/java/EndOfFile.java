import java.util.Scanner;

public class EndOfFile {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int lnum = 1;
        while (scanner.hasNext()){
            System.out.println(lnum + " "+ scanner.nextLine() );
            lnum++;
        }
        scanner.close();
    }
}
