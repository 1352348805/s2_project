import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(5555);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        System.out.println("连接成功");
            byte [] bytes = new byte[1024];
            is.read(bytes,0,bytes.length);

            System.out.println(new String(bytes,0,bytes.length));


    }
}
