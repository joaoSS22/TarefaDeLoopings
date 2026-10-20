package Looping;

import java.util.Scanner;

public class Looping {
        static int numero = 0;
        static String nome;

    public static void main(String[] args) {


        Dados();
        LoopingCrescente();
        LoopingDescente();
        ImprimirNome();
    }

    public static void Dados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();


            while (numero <= 0){

                System.out.println("Digite um numero maior do que zero:");

                if (scanner.hasNextInt()) {

                    numero = scanner.nextInt();

                    if (numero <= 0) {
                        System.out.println("O numero deve ser maior que zero!");
                    }

                } else {

                    System.out.println("Entrada invalida! Digite um numero inteiro.");

                    scanner.nextLine();
                }

            }

            scanner.close();
    }

    public static void LoopingCrescente(){

        for (int num0 =0; num0 <= numero;num0++){
            System.out.println(num0);
        }}

    public static void LoopingDescente(){

        for (int numeroControle = numero; numeroControle >= 0; numeroControle--){
            System.out.println(numeroControle);
        }}

    public static void ImprimirNome(){

            if (nome.length() > 6){
            for (int NumeroDeNomes = numero; NumeroDeNomes > 0; NumeroDeNomes--){
                System.out.println(nome);
            }
        }else{
                System.out.println(nome);
            }


}
}
