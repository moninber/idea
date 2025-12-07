package test;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            if(str.equals("88")){
                break;
            }
            byte[] bytes = str.getBytes();
            int port = 10086;
            InetAddress address= InetAddress.getByName("127.0.0.1");
            DatagramPacket  dp = new DatagramPacket(bytes,bytes.length,address,port);
            ds.send(dp);
        }
        ds.close();
    }
}
