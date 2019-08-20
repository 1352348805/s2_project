package VehicleCar;

import java.util.ArrayList;
import java.util.List;

public final class Bus extends MotoVehicle {

	private int seatCount;
	static List list = new ArrayList();

	public static void InitCarNo() {
		list.add("赣A21421");
		list.add("赣B23523");
		list.add("赣C36432");
	}
	@Override
	public int calRent(int days) {
		// TODO �Զ����ɵķ������
		if (getSeatCount() <= 16) {
			return 800 * days;
		}else {
			return 1500 * days;
		}
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
}
