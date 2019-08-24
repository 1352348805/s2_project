package Animal;

public class Frog extends Animal {

    @Override
    public void LockDestination(){
        super.LockDestination();
        System.out.println("用舌头抓获");
    }

    @Override
    public void Say() {
        System.out.println("呱呱");
    }
}
