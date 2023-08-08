package com.example.revisaodesafops;
import java.util.Scanner;

public class Calc {
    public static void caculadora() {
        int refaz = 1;
        Scanner ler = new Scanner(System.in);
        while (refaz == 1){
        System.out.println("Solicite a opcao de calculo:");
        System.out.println("""
                (1) Soma
                (2) Subtração
                (3) Multiplicacao
                (4) Divisao""");

        int opcao = ler.nextInt();
            ler.nextLine();

        System.out.println("Primeiro numero do calculo:");
        double numero1 = ler.nextDouble();
            ler.nextLine();

        System.out.println("Segundo numero do calculo:");
        double numero2 = ler.nextDouble();
            ler.nextLine();

            if(opcao == 1) {
                System.out.println("Resultado da divisão: " + (numero1 + numero2));
            }else if (opcao == 2) {
                System.out.println("Resultado da divisão: " + (numero1 - numero2));
            }else if (opcao == 3) {
                System.out.println("Resultado da divisão: " + (numero1 * numero2));
            }else if (opcao == 4) {
                System.out.println("Resultado da divisão: " + (numero1 / numero2));
            }else{
                System.out.println("Digite um valor valido!");
            }
            System.out.println("Deseja refazer os calculos? (1) Sim - (2) Não");
            refaz = ler.nextInt();
        }
    }
}
