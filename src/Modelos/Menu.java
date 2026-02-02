package Modelos;

import java.util.Scanner;

public class Menu {

    public int mostrarMenu(Scanner leitura) {

        System.out.println("=== CONVERSOR DE MOEDAS ===");
        System.out.println("1 - USD → BRL");
        System.out.println("2 - EUR → BRL");
        System.out.println("3 - ARS → BRL");
        System.out.println("4 - BRL → USD");
        System.out.println("5 - USD → EUR");
        System.out.println("6 - BRL → EUR");
        System.out.println("0 - Sair");
        System.out.println("********************************");
        System.out.print("Escolha uma opção: ");

        return leitura.nextInt();
    }
}
