package demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("欧欧","雪纳瑞");
        Dog dog2 = new Dog("亚亚","拉布拉多");
        Dog dog3 = new Dog("菲菲","拉布拉多");
        Dog dog4= new Dog("美美","雪纳瑞");
        List dogs = new ArrayList();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        System.out.println("共计有"+ dogs.size() +"条狗狗");
        for (int i = 0; i < dogs.size(); i++) {
            Dog dog = (Dog)dogs.get(i);
            System.out.println(dog.getName() + "  " + dog.getStrain());
        }


    }
}
