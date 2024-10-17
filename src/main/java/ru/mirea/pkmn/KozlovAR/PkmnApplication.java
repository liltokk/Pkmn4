package ru.mirea.pkmn.KozlovAR;

import ru.mirea.pkmn.Card;

import java.io.IOException;

public class PkmnApplication {
    public static void main(String[] args) throws IOException {
        CardImport imp = new CardImport();
        Card card = imp.importCards("src\\main\\resources\\my_card.txt");

        CardExport exp = new CardExport();
        exp.exportCard(card);

        card = imp.importCardByte("Grimmsnarl.crd");
        System.out.println(card.toString());
        Card card1 = imp.importCardByte("Magmortar.crd");
        System.out.println(card1.toString());
    }
}
