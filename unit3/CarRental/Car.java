package CarRental;

public class Car extends MotoVehicle{

    private String type;
    private final int BUICKGL8_$ = 600;
    private final int BMW_$ = 500;
    private final int BUICKGREEN_$ = 300;

    @Override
    public int calRent(int days){
        if (type.equals("1")){
            return BMW_$ * days;
        }else if (type.equals("2")){
            return BUICKGL8_$ * days;
        }else if (type.equals("3")){
            return BUICKGREEN_$ * days;
        }
        return 99999;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




}
