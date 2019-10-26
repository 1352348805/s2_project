package page145x3;

public class demo {
    public static void main(String[] args) {
        try{
            int [] array = new int [5];
            int i = array[5];

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
    }
}
