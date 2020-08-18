package ÍøÂç±à³Ì.HttpServer.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description:
 * @author: the-handsome-boy-lijj
 * @create: 2020-08-16
 **/
public class TCPServer {

    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(8875);
        try {
            Socket socket = server.accept();
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                int count = 1;
                boolean flag = true;
                while (flag){
                    System.out.println("count:" + count);
                    count++;
                    String line = reader.readLine();
                    if ("bye".equals(line)){
                        flag = true;
                        System.out.println("bye, client");
                    }else{
                        System.out.println("clent output: " + line);
                    }
                }
            } finally {
                socket.close();
            }
        }finally {
            server.close();
        }

    }


}
