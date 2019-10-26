import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPsend {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte [] bytes = "sadpmasfkowenf".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.0.255"),5550);
        ds.send(dp);

        ds.close();
    }
}
