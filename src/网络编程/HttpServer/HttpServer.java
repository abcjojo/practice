package ������.HttpServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
    *  https://www.liaoxuefeng.com/wiki/1252599548343744/1304265903570978
    *  ��дһ��Httpserver���䱾������һ��TCP������
    * */
public class HttpServer {
        public static void main(String[] args) throws IOException {
            //�����˿�
            ServerSocket ss = new ServerSocket(8080);
            System.out.println("server is running...");
            for (;;){
                Socket sock = ss.accept();
                System.out.println("connected from " + sock.getRemoteSocketAddress());
                Thread t = new Headler(sock);
                t.start();
            }
        }
}

class Headler extends Thread{
    Socket sock;

    public Headler(Socket sock) {
        this.sock = sock;
    }

    public void run(){
        try(InputStream input = this.sock.getInputStream()){
            try(OutputStream output = this.sock.getOutputStream()){
                headle(input,output);
            }
        } catch (IOException e) {
            try{
                this.sock.close();
            }catch(IOException ioe){

            }
            System.out.println("client disconnected");
        }
    }

    private void headle(InputStream input, OutputStream output) throws IOException{
        System.out.println("Process new http request...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        //��ȡhttp����
        boolean requestOk = false;
        String first = reader.readLine();
        if (first.startsWith("GET / HTTP/1.")){
            requestOk = true;
        }
        //��ȡhttp body
        for ( ; ; ) {
            String header = reader.readLine();
            if (header.isEmpty()){
                break;  //��������ʱ��http header ��ȡ���
            }
            System.out.println(header);
        }
        System.out.println(requestOk ? "Response OK" : "Response ERROR");
        if (!requestOk) {
            //���ʹ�����Ӧ
            writer.write("404 Not Found\r\n");
            writer.write("Content-Length: 0\r\n");
            writer.write("\r\n");
            writer.flush();
        }else{
            //���ͳɹ���Ӧ
            String data = "<html><body><h1>Hello, World</h1></body></html>";
            int length = data.getBytes(StandardCharsets.UTF_8).length;
            writer.write("HTTP/1.0 200 OK\r\n");
            writer.write("Connection: close\r\n");
            writer.write("Content-Type: text/html\r\n");
            writer.write("Content-Length: " + length + "\r\n");
            writer.write("\r\n");
            writer.write(data);
            writer.flush();
        }
    }
}