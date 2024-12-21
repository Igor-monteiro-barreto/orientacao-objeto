package Dev.Igor;

import Dev.Igor.Controller.Akumados;

public class Spandam extends Akumados implements objetoAkumado {
    @Override
    public void ataqueObjeto() {
        System.out.println("Ataque basico deste objeto akumado");
    }

    @Override
    public void ataqueCombinado() {
        System.out.println("Ataque basico do objeto mais o seu ataque akumado");
    }
}
