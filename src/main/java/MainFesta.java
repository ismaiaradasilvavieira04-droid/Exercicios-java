package org.example;

public class MainFesta {

    public static void main(String[] args) {

        Festa festa = new Festa();

        festa.setData("10/01/2025");
        festa.setLocal("Salão do Zé");
        festa.setEndereco("Rua das Flores, 123");
        festa.setAniversariante("Maria");
        festa.setIdade(15);

        System.out.println("Data: " + festa.getData());
        System.out.println("Local: " + festa.getLocal());
        System.out.println("Endereço: " + festa.getEndereco());
        System.out.println("Aniversariante: " + festa.getAniversariante());
        System.out.println("Idade: " + festa.getIdade());
    }
}