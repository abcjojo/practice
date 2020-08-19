package ÍøÂç±à³Ì.HttpServer.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @description:
 * @author: the-handsome-boy-lijj
 * @create: 2020-08-16
 **/
public class TCPClient {
    public static void main(String[] args) throws IOException {

        Socket client = new Socket("127.0.0.1", 8875);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            String words = sc.nextLine();
            writer.write(words);
            writer.flush();

            System.out.println("Ð´Êý¾Ý£º" + words);
        }
        sc.close();
        client.close();

    }
}
