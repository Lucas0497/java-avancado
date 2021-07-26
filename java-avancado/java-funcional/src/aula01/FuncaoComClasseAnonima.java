package aula01;

public class FuncaoComClasseAnonima {
    public static void main(String[] args) {
        Funcao inserirSrStrign = new Funcao(){
            @Override
            public String gerar(String valor) {return "Sr. " + valor;}
        };
        System.out.println(inserirSrStrign.gerar("João"));
    }
}
