import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class JavaStack {
    public static void main (String [] args){

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');


        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String expression=sc.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false");
        }
        sc.close();

    }
    private static boolean isBalanced(String expression, HashMap<Character, Character> map){
        if ((expression.length() % 2) !=0){
            return false;
        }
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i=0; i<expression.length(); i++){
            Character ch = expression.charAt(i);
            if(map.containsKey(ch)){
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())){
                return false;
            }
        }
        return deque.isEmpty();

    }
}
