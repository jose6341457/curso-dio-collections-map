package br.com.dio.collections.map.exerciciosPropostos;

import java.util.*;

/*Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.
* */
public class JogosdeDadosMap {
    public static void main(String[] args) {

        List<Integer> jogada = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(6) + 1;
            jogada.add(number);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : jogada) {
            if (lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            else lancamentos.put(resultado, 1);
        }

        System.out.print("Jogando");

        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
        //    System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
            System.out.println("  " + entry.getKey() + "         " + entry.getValue());
        }
    }
}


