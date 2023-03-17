package br.com.dio.collections.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {


        System.out.println("Crie um dicionário que relacione os modelos e seus respetivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do Gol por 15.2 km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o valor de consumo do Uno: " + carrosPopulares.get("Uno"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais económico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        System.out.println("Exiba o modelo menos económico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry: entries1) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a media dos consumos deste dicionário de carros: ");
        System.out.println("Media dos consumos: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15.6 km/l : ");
        System.out.println("Conjunto original: " + carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("Conjunto modificado : " + carrosPopulares);

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println("Exiban todos os carros na ordem em que foram informados: ");
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        TreeMap<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário de carros");
        carrosPopulares.clear();
        System.out.println("Dicionário está vazio?: " + carrosPopulares.isEmpty());



    }
}
