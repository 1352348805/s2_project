package CarRental;

import java.util.Scanner;

public class Business {

    Scanner input = new Scanner(System.in);

    public void Init(){
        System.out.println("欢迎您来到汽车租赁公司！");
        System.out.print("请输入要租赁的天数：");
        int day = input.nextInt();

        System.out.print("请输入要租赁的汽车类型（1.轿车    2.客车）：");
        String type = input.next();
        int money = 0;
        switch (type){
            case "1":
                Car car = new Car();
                System.out.print("请输入要租赁的品牌（1.宝马    2.别克）：");
                String inputbrand = input.next();
                if(inputbrand.equals("1")){
                    car.setBrand("宝马");
                    System.out.print("请输入轿车的型号 2.商务舱GL8   3.林荫大道");
                }else if (inputbrand.equals("2")){
                    car.setBrand("别克");
                    System.out.print("请输入轿车的型号 1.宝马550i");
                }

                money = car.calRent(day);
                break;

        }

        System.out.print("顾客您好！您需要支付的租赁费用是" + money);

    }
}
