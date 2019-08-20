package VehicleCar;

import VehicleCar.Bus;
import VehicleCar.Car;

import java.util.*;

public class UserMain {

	public void Menu() {
		System.out.println("欢迎来到汽车租赁公司！");
		System.out.println("请输入要租赁的天数：");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.println("请输入要租赁的汽车类型（1：轿车	2：客车）");
		String typeString = input.next();
		Car car = null;
		String noString = "";
		String brandString = "";
		int money = 0;
		switch (typeString) {
			case "1":
				car = new Car();
				System.out.println("请输入要租赁的汽车品牌（1：宝马	2：别克）");
				car.setBrand(input.next());
				brandString = car.getBrand();
				if (brandString.equals("1")) {
					System.out.println("请输入轿车的型号 1:宝马550i");
					car.setType(input.next());
				}else if (brandString.equals("2")) {
					System.out.println("请输入轿车的型号 2:商务舱GL8 3:林荫大道");
					car.setType(input.next());
				}
				Car.InitCarNo();
				Random r = new Random();
				int rr = r.nextInt(3);
				noString = car.list.get(rr).toString();
				money = car.calRent(i);
				break;

			case "2":
				Bus bus = new Bus();
				System.out.println("请输入要租赁的客车品牌（1：金杯	2：金龙）：");
				bus.setBrand(input.next());
				System.out.println("请输入客车的座位数：");
				bus.setSeatCount(input.nextInt());
				bus.InitCarNo();
				Random ramdom = new Random();
				int rrr = ramdom.nextInt(3);
				noString = bus.list.get(rrr).toString();
				bus.setNo(noString);
				money = bus.calRent(i);
				break;
		}

		System.out.println("分配给您的汽车牌号是" + noString);
		System.out.println("顾客您好，您需要支付的租赁费用是" + money);
	}

}
