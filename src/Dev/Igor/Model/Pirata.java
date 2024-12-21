package Dev.Igor.Model;

public class Pirata {
    private String nome;
    private boolean espadachim;
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
    public boolean getEspadachim(){
        return espadachim;
    }
    public void setEspadachim(boolean espadachim){
        this.espadachim = espadachim;
        if (espadachim == true) {
            System.out.println("Pode atacar com a espada.");
        } else {
            System.out.println("Não pode atacar com espada vai ter que ir no soco mesmo.");
        }
    }

    public void ataqueBasico(){
        System.out.println("Soco basico ou chute sla.");
    }
}
