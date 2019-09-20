import java.util.ArrayList;

public class test
{
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        for (int i = 0; i <10; i++){
            list.add(i);
        }


        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains(1));

    }
}
