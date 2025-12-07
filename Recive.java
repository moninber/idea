package test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class Recive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] datas = new byte[1024];
        DatagramPacket dp = new DatagramPacket(datas, datas.length);
        while(true){
            ds.receive(dp);
            datas = dp.getData();
            int len = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();
            System.out.println("ip为："+ip+" name为："+name+" 的人发送了信息："+new String(datas,0,len, StandardCharsets.UTF_8));
        }
    }
}
