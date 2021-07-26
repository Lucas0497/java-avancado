package aula01;

/*
* Crie uma função que vai filtrar um array, filtrando somente os numeros pares e
* os multiplicando pos dois.
* Imprima o resultado final.
 */

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4};

        // Exemplo com paradigma funcional
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));


        // Exemplo com paradigma imperativo
        for (int i = 0; i < valores.length; i++) {
            int valor = 0;
            if (valores[i] % 2 == 0){
                valor = valores[i] * 2;

                if (valor != 0){
                    System.out.println(valor);
                }
            }

        }

    }

}

