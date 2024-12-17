package Dev.Igor.Model;

public class Pirata {
    private String nome;
    private double recompensa;
    private boolean temHakiDoRei;
    // Criar o getter da classe privada //
    public boolean getTemHakiDoRei(){
        return temHakiDoRei;
    }
    public void setTemHakiDoRei(boolean temHakiDoRei){
        this.temHakiDoRei = temHakiDoRei;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ataqueBasico(){
        System.out.println("Soco basico ou chute sla.");
    }
}
