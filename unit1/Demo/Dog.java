package Demo;

public class Dog {


    private String name;
    private String sex;
    private int love = 0;
    private int heath = 100;
    public static final String SEX_MALE = "雄";
    public static final String SEX_FEMALE = "雌";

    public void print()
    {
        System.out.println("我的名字叫" + this.name +",健88康值是" + this.heath + ",和主人的亲密度是"+ this.love+
                ",性别是" + this.sex);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
    }

    public static String getSexMale() {
        return SEX_MALE;
    }

    public static String getSexFemale() {
        return SEX_FEMALE;
    }

}
