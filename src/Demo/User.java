package Demo;

import java.util.Scanner;

public class User {

    public void start()
    {
        System.out.println("欢迎您来到宠物店！");
        System.out.print("请输入要领养的宠物的名字：");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("请选择要领养的宠物类型：（1.狗狗 2.企鹅）");
        String type = input.next();
        switch (type) {
            case "1":
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("请选择企鹅的性别：（1." + Dog.SEX_MALE + " 2." + Dog.SEX_FEMALE + "）");
                String dogSexSelect = input.next();
                if (dogSexSelect.equals("1")) {
                    dog.setSex(Dog.SEX_MALE);
                } else if (dogSexSelect.equals("2")) {
                    dog.setSex(Dog.SEX_FEMALE);
                } else {
                    System.out.println("没有这个选项");
                    break;
                }
                dog.print();
                break;
            case "2":
                Penguin penguin = new Penguin();
                penguin.setName(name);
                System.out.println("请选择狗的性别：（1." + penguin.SEX_MALE + " 2." + penguin.SEX_FEMALE + "）");
                String penSexSelect = input.next();
                if (penSexSelect.equals("1")) {
                    penguin.setSex(penguin.SEX_MALE);
                } else if (penSexSelect.equals("2")) {
                    penguin.setSex(Dog.SEX_FEMALE);
                } else {
                    System.out.println("没有这个选项");
                    break;
                }
                penguin.print();
                break;
            default:
                System.out.println("没有这个选项");
                break;
        }
    }
}
