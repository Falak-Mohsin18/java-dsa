import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<>(10);
             /*list.add(67);
             list.add(45);
             list.add(23);
             list.add(12);

            System.out.println(list);*/

            //input
            for(int i = 0 ; i<5;i++){
                list.add(in.nextInt());
            }
            //get item
            for(int i = 0 ; i<5;i++){
                list.add(list.get(i));
            }
            System.out.println(list);

    }
}
