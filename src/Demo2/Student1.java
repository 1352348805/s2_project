package Demo2;

public class Student1 {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16){
            System.out.println("年龄不能小于16岁！");
            //return;
        }
        this.age = age;
    }

    public void print(){
        System.out.println("我的名字叫"+ this.name + "，今年" + this.age);
    }
}
