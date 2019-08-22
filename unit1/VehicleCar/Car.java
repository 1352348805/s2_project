package VehicleCar;

import java.util.ArrayList;
import java.util.List;


public final class Car extends MotoVehicle {

	private String type; //汽车型号

	static List list = new ArrayList();

	public static void InitCarNo() {
		list.add("赣A88888");
		list.add("赣B12345");
		list.add("赣C98765");
	}

	@Override
	public int calRent(int days) {
		// TODO 自动生成的方法存根
		if (super.getBrand().equals("1")) {
			if (getType().equals("1")) {
				return 500 * days;
			}
		}else if (super.getBrand().equals("2")){
			if (getType().equals("2")) {
				return 600 * days;
			}else if (getType().equals("3")) {
				return 300 * days;
			}
		}
		return 9999 ;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
}