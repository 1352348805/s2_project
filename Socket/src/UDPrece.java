
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPrece {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(5550);

        byte[] bytes = new byte[1024*8];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        try {
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
