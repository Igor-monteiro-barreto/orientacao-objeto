public class Main2 {
    public static void main(String[] args) {
        // Objeto 1
        Akumados luffy = new Akumados();
        luffy.setNome("Monkey D.Luffy");
        System.out.println("Meu nome é " + luffy.getNome());
        luffy.userAkumados();
        luffy.temHakiDoRei = true;
        luffy.ataqueBasico();

        // Objeto 2
        Pirata kid = new Pirata();
        kid.setNome("Eustas Captan Kid");

        // objeto 3
        NaoAkumado zoro = new NaoAkumado();
        zoro.setNome("Roronoa zoro");
        zoro.NaoAkumado();
        zoro.temHakiDoRei = false;
        zoro.ataqueBasico();
        zoro.NaoAkumado(false);
        zoro.NaoAkumado(true);
    }
}
