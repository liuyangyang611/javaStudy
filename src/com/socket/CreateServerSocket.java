package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CreateServerSocket {
    public static void main(String[] args) {
        try {
            //1,创建服务器，并开放指定端口

            ServerSocket server = new ServerSocket(8888);
            System.out.println("启动服务器成功！！");
            Socket client = server.accept();//2，接收客户端的连接请求，并保存客户端的Socket对象
            System.out.println("服务器正在创建与客户端的连接..."+client.getLocalAddress());
            InputStream is = client.getInputStream();//3，获取Socket中网络字节输入流
            int len = 0;
            byte[] bytes = new byte[1024]; //4,读取信息
            while ((len = is.read(bytes)) != -1) {
                System.out.println(new String(bytes,0 ,len));
            }
            System.out.println("发送完毕");
            //5 获取Socket中网络字节输出流
            OutputStream os=client.getOutputStream();
            os.write("你好客户端！".getBytes());
            client.shutdownOutput();
            os.flush();
            //释放资源
            //释放资源
            client.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
