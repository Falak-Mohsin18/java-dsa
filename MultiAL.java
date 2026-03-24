import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialization
        for(int i = 0 ; i<3;i++){
            list.add(new ArrayList<>());
        }
        //add elements
        for(int i = 0 ; i<3;i++){
            for(int j = 0 ; j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
       /*  list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(3);

        list.get(1).add(4);
        list.get(1).add(5);

        list.get(2).add(6);
        list.get(2).add(7);
        list.get(2).add(8);
        list.get(2).add(9);*/

        System.out.println(list);
    }
}
