import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String>[] arrayOfList = new List[n];

        for (int i =0; i<n; i++){
            int d = scanner.nextInt();
            List<String> line = new ArrayList<>();
            for(int j=0; j<d;j++){
                line.add(scanner.next());
            }
            arrayOfList[i] = line;
        }
        int q = scanner.nextInt();

        for(int i=0; i<q;i++){
            int y = scanner.nextInt();
            int x = scanner.nextInt();

            try{
                String answer = arrayOfList[y-1]. get(x-1);
                System.out.println(answer);
            }
            catch (Exception e){
                System.out.println("Error");
            }

        }
    }


}
