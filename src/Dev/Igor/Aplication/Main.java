package Dev.Igor.Aplication;

import Dev.Igor.Akainu;
import Dev.Igor.Cargos;
import Dev.Igor.Garp;
import Dev.Igor.Model.Marinheiros;

public class Main extends Marinheiros {
    public static void main(String[] args) {
        Akainu akainu = new Akainu();
        Garp garp = new Garp();

        garp.capituraPiraata();
        garp.setNome("Garp");
        System.out.println("Meu nome é " + garp.getNome());
        akainu.protegerTenriobituos();
        garp.setCargo(Cargos.vice_almirante);
        garp.exibirInfo();

    }
}
