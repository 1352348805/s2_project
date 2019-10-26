import java.io.*;

public class T3 {
    public static void main(String[] args) {
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try {
            bfr = new BufferedReader(new FileReader("C:\\新建文件夹\\source.txt"));
            bfw = new BufferedWriter(new FileWriter("D:\\target.txt"));
            char [] chars = new char[1024];
            int i ;
            while ((i= bfr.read(chars,0,chars.length))!=-1){
                bfw.write(chars,0,chars.length);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bfr!=null){
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bfw!=null){
                try {
                    bfw.flush();
                    bfw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
