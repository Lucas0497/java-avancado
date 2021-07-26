package aula03;

import java.util.stream.IntStream;

public class ExemploParallelStream {
    public static void main(String[] args) {
        // Solução de fatorial rodando em serial
       long inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial :: " + (fim - inicio) + " Millisegundos");

        // Solução fatorial rodando com Parallel, visando performance
        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num)); // Parallel
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel :: " + (fim - inicio) + " Millisegundos");

        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> fatorial(num)); // Parallel
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial :: " + (fim - inicio) + " Millisegundos");

        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num)); // Parallel
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel :: " + (fim - inicio) + " Millisegundos");




    }

    public static long  fatorial (long num){
        long fat = 1;

        for (long i = 2; i <= num ; i++) {
            fat *= i;
        }
        return fat;
    }
}
