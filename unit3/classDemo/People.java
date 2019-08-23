package classDemo;

public class People {

    private String name;
    public People(String name){
        this.name = name;
    }

    public void getFood(Animal animal){
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.eat("猫粮");
        }
    }
}
