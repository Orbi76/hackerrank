import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList();
        for(int i=0; i<n;i++){
            list.add(scan.nextInt());
        }

        int q = scan.nextInt();

        for (int i=0; i<q; i++) {
            String query = scan.next();
            int x = scan.nextInt();
            if (query.equals("Insert")) {
                int y = scan.nextInt();
                list.add(x, y);
            } else {
                list.remove(x);
            }
        }
            for (int i = 0; i<list.size(); i++){
                System.out.print(list.get(i) + " ");
            }

    }
}
