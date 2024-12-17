package Dev.Igor;

import Dev.Igor.Model.Marinheiros;
import Dev.Igor.Model.Pirata;


public class Main2 {
    public static void main(String[] args) {
        // Objeto 1
        Akumados luffy = new Akumados();
        luffy.setNome("Monkey D.Luffy");
        System.out.println("Meu nome é " + luffy.getNome());
        luffy.userAkumados();
        luffy.setTemHakiDoRei(true);
        System.out.println("O luffy tem haki do "+luffy.getTemHakiDoRei());
        luffy.ataqueBasico();

        // Objeto 2
        Pirata kid = new Pirata();
        kid.setNome("Eustas Captan Kid");
        System.out.println("Meu nome é " + kid.getNome());

        // objeto 3
        NaoAkumado zoro = new NaoAkumado();
        zoro.setNome("Roronoa zoro");
        System.out.println("Meu nome é " + zoro.getNome());
        zoro.NaoAkumado();
        zoro.setTemHakiDoRei(true);
        System.out.println("O zoro tem haki do "+zoro.getTemHakiDoRei());
        zoro.ataqueBasico();
        zoro.NaoAkumado(true);

        // Objeto 4
        Marinheiros garp = new Marinheiros();
        garp.setCargo("Vice-Almirante");
        System.out.println("Eu sou um marinheiro e meu cargo é " + garp.getCargo());


    }
}
