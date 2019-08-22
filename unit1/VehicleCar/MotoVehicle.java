package VehicleCar;

public abstract class MotoVehicle {

	private String brand;
	private String no;

	public abstract int calRent(int days);

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
}
