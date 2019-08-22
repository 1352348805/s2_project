package page61x5;

public class Fish extends Animal {

    private int weight;

    @Override
    public void info() {
        System.out.println("我是一只"+ weight + "斤重的鱼!\r\n今年" +super.getAge()+"岁了！");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
