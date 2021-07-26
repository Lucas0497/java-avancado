package aula02;

/*
* 1- Filtre e imprima os nomes "Lucas" contido no array "nomes".
* 2- Para cada numero contido no array "numero" retorno o dobro do mesmo.
*/

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploInteracoes {
    public static void main(String[] args) {
        String[] nomes = {"João", "Lucas", "Pedro", "Paulo", "Thiago", "Lucas", "Daniel"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        filtroNomes(nomes);
        imprimirDobro(numeros);
        }

        public static void filtroNomes(String... nomes){

            String nomesImprimir = "";
            for (int i = 0; i < nomes.length ; i++) {
                if (nomes[i].equals("Lucas")){
                    nomesImprimir += " " + nomes[i];
                }
            }
            System.out.println("Nomes com for: " + nomesImprimir);

            //Filtrou e printou a string "Lucas" assim como o for acima
            //porém utilizou apenas 3 linhas de código muito mais legível
            Stream.of(nomes)
                    .filter(nome -> nome.equals("Lucas"))
                    .collect(Collectors.joining()); // Agrupa as strings dentro de uma única string separando as por espaço

            System.out.println("Nomes com Stream: " + nomesImprimir);
        }
        public static void imprimirDobro(Integer... numeros) {
            System.out.println("Solução 2 com FOR: ");
            for (Integer numero : numeros) {
                System.out.println(numero * 2);
            }
            System.out.println("Solução 2 com Stream:");
            Stream.of(numeros).map(numero -> numero * 2)
                    .forEach(System.out::println);
        }


}
