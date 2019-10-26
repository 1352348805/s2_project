import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",5555);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        String data = "asdasdage我的期望";
        os.write(data.getBytes());

        os.close();
    }
}
