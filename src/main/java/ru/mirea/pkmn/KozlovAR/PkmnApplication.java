package ru.mirea.KozlovAR.pkmn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PkmnApplication {
    public static void main(String[] args) throws IOException {
        CardImport imp = new CardImport();
        Card card = imp.importCards("src\\main\\resources\\my_card.txt");

        CardExport exp = new CardExport();
        exp.exportCard(card);

        card = imp.importCardByte("Grimmsnarl.crd");
        System.out.printf(card.toString());
    }
}
