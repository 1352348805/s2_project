package 读取模板;

import java.io.*;

public class BuffedIODemo {
    public static void main(String[] args) {

        BufferedReader bis = null;
        BufferedWriter bos = null;
        try {
             bis =
                    new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\caogao1.txt"));
             bos =
                     new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\caogao2.txt"));
             String i=bis.readLine();
             i = i.replaceAll("\\{name\\}","欧欧");
             i = i.replaceAll("\\{type\\}","狗狗");
             i = i.replaceAll("\\{master\\}","李伟");
             bos.write(i.toCharArray());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
