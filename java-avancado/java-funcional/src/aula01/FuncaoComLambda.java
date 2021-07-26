package aula01;


/*
Mesmo exemplo realizado na Classe função com classe anonima, porém utilizando lambda
visando simplificar o código
 */

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao srNaString = valor -> "Sr. " + valor;
        System.out.println(srNaString.gerar("João"));
    }
}
