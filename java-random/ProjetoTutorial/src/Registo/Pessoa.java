package Registo;

public class Pessoa {

    private String nome;
    private int idade;
    private float renda;
    private long nif;

    public Pessoa(String nome, int idade, float renda, long nif) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public long getNif() {
        return nif;
    }

    public void setNif(long nif) {
        this.nif = nif;
    }
    
    

}
