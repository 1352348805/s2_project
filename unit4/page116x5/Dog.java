package page116x5;

public class Dog extends Pet implements Eatable,FlyingDiscCatchable {

    public Dog(String name, int health) {
        super(name, health);
    }

    @Override
    public void print() {
        System.out.println("名字" + getName() + ",健康值是" + getHealth());
    }

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void catchingFlyDisc() {
        System.out.println("接飞盘");
    }
}
