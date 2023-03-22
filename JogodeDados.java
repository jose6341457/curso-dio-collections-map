package br.com.dio.collections.map.exerciciosPropostos;


import java.util.*;

/*Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.
* */
public class JogodeDados {
    public static void main(String[] args) {
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;


        ArrayList lista = new ArrayList<String>();

        for (int i = 1; i <= 100; i++) {

            Random random = new Random();
            int numero = random.nextInt(6) + 1;

            String a = "Jogada ";
            String result = a + i;

            lista.add(result + " Valor: " + numero);

            if(numero == 1){
                uno++;
            } else if (numero == 2) {
                dos++;
            } else if (numero == 3) {
                tres++;
            } else if (numero == 4) {
                cuatro++;
            } else if (numero == 5) {
                cinco++;
            } else if (numero == 6) {
                seis++;
            }

            if (i == 100){
                System.out.println("Vezes do uno: " + uno);
                System.out.println("Vezes do uno: " + dos);
                System.out.println("Vezes do uno: " + tres);
                System.out.println("Vezes do uno: " + cuatro);
                System.out.println("Vezes do uno: " + cinco);
                System.out.println("Vezes do uno: " + seis);
            }
        }
    }
}
