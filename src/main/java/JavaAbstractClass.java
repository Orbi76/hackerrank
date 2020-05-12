
import java.util.Scanner;
abstract class Book{
    String title;
    int pageNumber;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
    abstract void setPageNumber(int pn);
    int getPageNumber(){
        return pageNumber;
    }
}

class MyBook extends Book{
    
    void setTitle(String s) {
        title = s;
    }

    void setPageNumber(int pn){
        pageNumber = pn;
    }


}
/*
class MyPage extends MyBook{
    void showPageNumber(int pn){
        pageNumber = pn;
    }
}
*/
public class JavaAbstractClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        int pageNumber = sc.nextInt();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        new_novel.setPageNumber(pageNumber);
        System.out.println("The title is: "+new_novel.getTitle() + " Oldal: " + new_novel.getPageNumber());
        sc.close();

    }
}

