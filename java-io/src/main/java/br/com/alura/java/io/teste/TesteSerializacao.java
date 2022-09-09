package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);

    }

}


//        Cliente cliente = new Cliente();
//        cliente.setNome("Daniel");
//        cliente.setProfissao("Desenvolvedor");
//        cliente.setCpf("12345678911");
//
////        String nome = "Daniel Oliveira";
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//        Cliente cliente = (Cliente) ois.readObject();
//        ois.close();
//        System.out.println(cliente.getCpf());





