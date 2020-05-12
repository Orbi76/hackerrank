import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proba {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList();
        for (int i=0; i<n;i++){
            list.add(scanner.nextInt());

        }
    }
}
