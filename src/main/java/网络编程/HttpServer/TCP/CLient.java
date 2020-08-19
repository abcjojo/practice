package 网络编程.HttpServer.TCP;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @description:
 * @author: the-handsome-boy-lijj
 * @create: 2020-08-12
 **/
public class CLient {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 8750);

        try(InputStream input = socket.getInputStream()){
            try(OutputStream output = socket.getOutputStream()){
                handle(input, output);
            }
        }

        socket.close();
        System.out.println("disconnected.");
    }

    /**
     * @description：
     * @createBy： the-handsome-boy-lijj  2020-08-12 15:10
     */
    public static void handle(InputStream input, OutputStream output) throws IOException {

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.println("[server]" + reader.readLine());

        for (;;){
            //打印提示
            System.out.println(">>>>>>");
            String s = scanner.nextLine();
            writer.write(s);
            writer.newLine();
            writer.flush();
            String resp = reader.readLine();
            System.out.println("<<<<<<" + resp);
            if ("bye".equals(resp)) {
                break;
            }
        }

    }
}
