package page116x5;

public class Penguin extends Pet implements Eatable,Swimmable {

    public Penguin(String name, int health) {
        super(name, health);
    }

    @Override
    public void eat() {
        System.out.println("企鹅吃");
    }

    @Override
    public void print() {
        System.out.println("名字" + getName() + ",健康值是" + getHealth());
    }

    @Override
    public void swim() {
        System.out.println("企鹅游泳");
    }
}
