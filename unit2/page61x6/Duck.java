package page61x6;

public class Duck extends Poultry {


    @Override
    public void info() {
        System.out.println("我叫" + super.getName() + ",是一只" + super.getBreed() + "鸭!");
    }

    @Override
    public void habit() {
        System.out.println("我会游泳");
    }
}
