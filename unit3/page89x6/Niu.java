package page89x6;

public class Niu {

    public void serveFriend(Friends friend){
        if (friend instanceof Wang){
            Wang wang = (Wang)friend;
            wang.eat();
            wang.play();
        }else if (friend instanceof Yue){
            Yue yue = (Yue)friend;
            yue.eat();
            yue.play();
        }
    }
}
