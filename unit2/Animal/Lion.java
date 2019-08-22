package Animal;

public class Lion extends Animal {

    public void LockDestination(){
        super.LockDestination();
        System.out.println("用牙齿和利爪抓获");
    }

    @Override
    public void Say() {
        System.out.println("奥乌");
    }
}
