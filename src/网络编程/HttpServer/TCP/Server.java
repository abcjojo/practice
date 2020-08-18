package ÍøÂç±à³Ì.HttpServer.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(8750);
        System.out.println("server is running...");

        for ( ; ; ){
            Socket socket = ss.accept();
            System.out.println("connected from " + socket.getRemoteSocketAddress());

            Thread thread = new Handle(socket);
            thread.run();
        }
    }

}

/**
 * @description£º
 * @createBy£º the-handsome-boy-lijj  2020-08-10 17:35
 */

class Handle extends Thread{

    Socket socket;

    public Handle(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try(InputStream inputStream = this.socket.getInputStream()){
            try(OutputStream outputStream = this.socket.getOutputStream()){
                handle(inputStream, outputStream);
            }
        } catch (IOException e) {
            try{
                this.socket.close();
            }catch(IOException ioe){
            }
            System.out.println("client disconnected.");
        }
    }

    private void handle(InputStream input, OutputStream output) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));

        writer.write("hello\n");
        writer.flush();

        for( ; ; ){
            String s = reader.readLine();
            if ("bye".equals(s)){
                writer.write("bye\n");
                writer.flush();
                break;
            }
            writer.write("ok: " + s + "\n" );
            writer.flush();
        }
    }

}