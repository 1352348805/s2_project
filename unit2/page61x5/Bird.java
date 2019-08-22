package page61x5;

public class Bird extends Animal {

    private String color;

    @Override
    public void info() {
        System.out.println("我是一只" + color + "的鸟!\r\n今年" + super.getAge() + "岁了！");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
