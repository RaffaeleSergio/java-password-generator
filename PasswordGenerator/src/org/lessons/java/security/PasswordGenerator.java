package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il nome:");
        String nome = input.nextLine();

        System.out.println("Inserisci il tuo cognome:");
        String cognome = input.nextLine();

        System.out.println("Inserisci il tuo colore preferito:");
        String colore = input.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita:");
        String giorno = input.nextLine();
        int giornoNum = Integer.parseInt(giorno);

        System.out.println("Inserisci il tuo mese di nascita:");
        String mese = input.nextLine();
        int meseNum = Integer.parseInt(mese);

        System.out.println("Inserisci il tuo anno di nascita:");
        String anno = input.nextLine();
        int annoNum = Integer.parseInt(anno);

        int sommmaNascita = giornoNum + meseNum + annoNum;

        String passwordGen = nome + "-" + cognome + "-" + colore + "-" + sommmaNascita;

        System.out.println("La password generata è: " + passwordGen);

        input.close();

    }
}
