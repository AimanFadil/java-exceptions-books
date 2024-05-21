package org.excercise.books;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Quanti libri vuoi inserire: ");
        int quantita = scanner.nextInt();
        scanner.nextLine();

        Libro[] libro = new Libro[quantita];

        for (int i = 0; i < quantita; i++) {
            try {

                    System.out.println("\nInserimento Libro " + (i + 1) + ":");

                    System.out.print("Titolo: ");
                    String titolo = scanner.nextLine();

                    System.out.print("Numero Pagine: ");
                    int nPagine = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Autore: ");
                    String autore = scanner.nextLine();

                    System.out.print("Editore: ");
                    String editore = scanner.nextLine();

                    libro[i] = new Libro(titolo, nPagine, autore, editore);

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("fineeeeeeeeee");
            }
        }
        System.out.println(Arrays.toString(libro));





    }
}
