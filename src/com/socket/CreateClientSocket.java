package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CreateClientSocket {
    public static void main(String[] args) {
            try {
                Socket socket = new Socket("127.0.0.1", 8888);//1创建连接 三次握手
                OutputStream os = socket.getOutputStream();//2获取网络字节输出流
                os.write("你好服务器！".getBytes());//3使用网络字节输出流中的write方法，给服务器写数据
                socket.shutdownOutput();
                InputStream is = socket.getInputStream();//4，获取Socket中网络字节输入流
                int len = 0;
                byte[] bytes = new byte[1024]; //5,读取信息
                while ((len = is.read(bytes)) != -1) {
                    System.out.println(new String(bytes, 0, len));
                    System.out.println(1);
                }

                socket.close();//关闭客户端socket
            } catch (IOException e) {
                e.printStackTrace();
         }
    }
}
