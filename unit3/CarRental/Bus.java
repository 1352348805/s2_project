package CarRental;

public class Bus extends MotoVehicle {

    private int seatCount;
    private final int UNDER = 800; //低于或等于16座价格
    private final int EXCEED = 1500; //高于16座价格
    @Override
    public int calRent(int days){
        if (seatCount <= 16){
            return UNDER * days;
        }else{
            return EXCEED * days;
        }
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
