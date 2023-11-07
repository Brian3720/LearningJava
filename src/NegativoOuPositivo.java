//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.

import java.util.Scanner;

public class NegativoOuPositivo {
    public static void main(String[] args) {


        System.out.print("Digite um número e vamos verificar se ele é positivo ou negativo: ");
        Scanner numero = new Scanner(System.in);
        int inputNumber = numero.nextInt();

        if (inputNumber < 0) {
            System.out.println(inputNumber + " É negativo");
        }

        else {
            System.out.println(inputNumber + " É positivo");
        }
    }
}
