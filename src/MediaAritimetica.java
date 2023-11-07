import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);


        System.out.println("Digite um número: ");
        Integer primeiroNota = notas.nextInt();
        Integer segundaNota = notas.nextInt();
        Integer terceiraNota = notas.nextInt();
        Integer quartaNota = notas.nextInt();
        Integer quintaNota = notas.nextInt();
        Integer sextaNota = notas.nextInt();
        Integer setimaNota = notas.nextInt();
        Integer oitavaNota = notas.nextInt();
        Integer nonaNota = notas.nextInt();
        Integer decimaNota = notas.nextInt();

        int media = (primeiroNota + segundaNota + terceiraNota + quartaNota + quintaNota + sextaNota + setimaNota + oitavaNota + nonaNota + decimaNota) / 10;

        if (media < 7) {
            System.out.println("Tu se ferrou irmão sua média foi " + media + " você reprovou.");
        }
        else{
            System.out.println("Sua média de notas é: " + media + " Parabéns você passou!");
        }
    }
}
