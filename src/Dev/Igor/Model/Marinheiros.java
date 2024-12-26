package Dev.Igor.Model;

public abstract class Marinheiros {
    private String nome;
    private String cargo;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void capituraPiraata(){
        System.out.println("Eu posso prender esse pirata");
    }

}
