package AnimalShop;

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        Map<String,Dog> map = new HashMap<String,Dog>();
        Dog dog1 = new Dog("小黄","拉布拉多");
        Dog dog2 = new Dog("小黑","哈士奇");
        Dog dog3 = new Dog("小白","拉布拉多");
        map.put(dog1.getName(),dog1);
        map.put(dog2.getName(),dog2);
        map.put(dog3.getName(),dog3);
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            String key = (String)iterator.next();
            Dog dog = (Dog)map.get(key);
            System.out.println(dog.getName()+"    "+dog.getBrand());
        }
    }
}
