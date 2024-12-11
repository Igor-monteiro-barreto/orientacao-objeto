public class Pirata {
    private String nome;
    private double recompensa;
    private String bando;

    // Criar o getter da classe privada //

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRecompensa(){
        return recompensa;
    }
    public void setRecompensa(double recompensa){
        this.recompensa = recompensa;
    }


    public void ataqueBasico(){
        System.out.println("Soco basico ou chute sla.");
    }
}
