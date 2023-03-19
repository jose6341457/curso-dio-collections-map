package br.com.dio.collections.map.exerciciosPropostos;

/*Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265

Crie um dicionário e relacione os estados e suas populações;

* */


import java.util.*;

public class ExercicioPopulacao {
    public static void main(String[] args) {

//Crie um dicionário e relacione os estados e suas populações;

        Map<String, Double> minhaPopulacao = new LinkedHashMap<>(){{
            put("PE", (double) 9616621);
            put("AL", (double) 3351543);
            put("CE", (double) 9187103);
            put("RN", (double) 3534265);

        }};

        System.out.println(minhaPopulacao.toString());

        System.out.println("Substitua a população do estado do RN por 3.534.165");
        minhaPopulacao.put("RN", 3534165d);
        System.out.println(minhaPopulacao);


        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB -4.039.277");
        System.out.println("PB se encontra no dicionário? " + minhaPopulacao.containsKey("PB"));
        System.out.println("Adicione PB ao dicionário: PB - 4.039.277");
        minhaPopulacao.put("PB", 4039277d);
        System.out.println(minhaPopulacao);

        System.out.println("Exiba a população PE: " + minhaPopulacao.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
        System.out.println(minhaPopulacao);

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Double> minhaPopulacao1 = new TreeMap<>(minhaPopulacao);
        System.out.println(minhaPopulacao1);

        System.out.println("Exiba o estado com o menor população e sua quantidade: ");
        Double menorPopulacao = Collections.min(minhaPopulacao1.values());
        Set<Map.Entry<String, Double>> entries = minhaPopulacao1.entrySet();
        String estadoMenorPopulacao = "";
//Quando a variavél entry não é reconhecida, posiciona-se acima dela e solicitar importar. Logo,
// já o sistema permite o uso do método getValue() e getKey();
       for (Map.Entry<String, Double> entry : entries)  {
            if(entry.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = entry.getKey();
                System.out.println("Estado com o menor população :" + estadoMenorPopulacao + " - " + menorPopulacao);
            }
        }

        System.out.println("Exiba o estado com o maior população e sua quantidade: ");
        Double maiorPopulacao = Collections.max(minhaPopulacao.values());
        Set<Map.Entry<String, Double>> entries1 = minhaPopulacao1.entrySet();
        String estadoMaiorPopulacao = "";

        for (Map.Entry<String, Double> entry: entries1) {
            if(entry.getValue().equals(maiorPopulacao)) {
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("Estado com maior população: " + estadoMaiorPopulacao + " - " + maiorPopulacao);
            }
        }
        System.out.println("Exiba a soma da população desses estados: ");
        Iterator<Double> iterator = minhaPopulacao.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma da População: " + soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + soma/ minhaPopulacao.size());

        System.out.println("Remova os estados com a população menor que 4.000.000");
        System.out.println("Conjunto original: " + minhaPopulacao);
        Iterator<Double> iterator1 = minhaPopulacao.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() < 4000000.0) iterator1.remove();
            }
        System.out.println("Conjunto modificado: " + minhaPopulacao);

        System.out.println("Apague o dicionário de estados" );
        minhaPopulacao.clear();
        System.out.println("Dicionário: " + minhaPopulacao);
        System.out.println("Confira se o dicionário está vazio: " + minhaPopulacao.isEmpty());
        

    }
}
