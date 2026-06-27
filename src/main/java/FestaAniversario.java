package org.example;

public abstract class FestaAniversario {

    private String data;
    private String local;
    private String endereco;
    private String aniversariante;
    private int idade;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getAniversariante() {
        return aniversariante;
    }

    public void setAniversariante(String aniversariante) {
        this.aniversariante = aniversariante;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}