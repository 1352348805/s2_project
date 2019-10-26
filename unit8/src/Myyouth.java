
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Myyouth {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\我的青春谁做主.txt");
            fos = new FileOutputStream("C:\\myFile\\myPrime.txt");
            byte [] words = new byte[1024];
            int i ;
            while ((i=fis.read(words,0,words.length))!=-1)
            fos.write(words,0,i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
