public class NaoAkumado extends Pirata{
    boolean temHakiDoRei;
    boolean espadachim;
    public void NaoAkumado(){
        System.out.println("Usuario não akumado, igual o zoro.");
    }
    public void NaoAkumado(boolean espadachim){
        if(espadachim == true){
            System.out.println("Pode atacar com a espada.");
        }
        else{
            System.out.println("Não pode atacar com espada vai ter que ir no soco mesmo.");
        }
    }
}
