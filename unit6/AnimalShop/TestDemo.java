package AnimalShop;

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<Dog>();
        Dog dog1 = new Dog("小黄","拉布拉多");
        Dog dog2 = new Dog("小黑","哈士奇");
        Dog dog3 = new Dog("小白","拉布拉多");
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        Iterator i = list.iterator();
        while(i.hasNext()){
            Dog d = (Dog)i.next();
            System.out.println(d.getName()+"    "+d.getBrand());
        }
    }
}
