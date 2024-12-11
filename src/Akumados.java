// Conceito de herança ae
public class Akumados  extends Pirata{
    boolean temHakiDoRei;
    public void userAkumados(){
        System.out.println("Usuario de akuma no mi");
        System.out.println("Esse usuario possui poderes.");
    }
    @Override
    public void ataqueBasico(){
        System.out.println("Soco basico ou chute sla com o poder da akuma no mi do usuario ( logia, paramecia ou zoan)");
    }
}
