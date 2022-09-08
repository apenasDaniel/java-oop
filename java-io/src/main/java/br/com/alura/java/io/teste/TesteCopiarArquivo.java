package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

//        Socket skt = new Socket();

        InputStream fis = new FileInputStream("lorem.txt"); //skt.getInputStream();
//        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem2.txt");
//        OutputStream fos = skt.getOutputStream(); //System.out;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
//            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }

}
