package Dev.Igor.Model;

import Dev.Igor.Cargos;

public abstract class Marinheiros {
    private String nome;
    private int idade;
    private Cargos cargo;

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
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
    public void exibirInfo(){
        System.out.println("Meu nome é "+ nome + " e meu cargo é " + cargo);
    }

    public void capituraPiraata(){
        System.out.println("Eu posso prender esse pirata");
    }

}
