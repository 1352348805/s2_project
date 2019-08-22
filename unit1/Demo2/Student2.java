package Demo2;

public class Student2 {
    private String name;
    private int age;
    private String sex;
    private String major;


    public Student2(String sex,String major){
        this.sex = sex;
        this.major = major;
    }

    public Student2(String name,int age,String sex,String major){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.major = major;
    }

    public void showInfo()
    {
        System.out.println("我叫"+ this.name +",今年"+ this.age
                +"岁,性别是"+ this.sex +",专业是"+ this.major);
    }

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
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
