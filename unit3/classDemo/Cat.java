package classDemo;

public class Cat extends Animal{



    public Cat(String name){
        super(name);
    }

    @Override
    public void eat(String foot) {

        super.setHealth(getHealth() + 4);
        System.out.println("猫咪"+ super.getName() +"吃饱了! 健康值增加4");
    }


}