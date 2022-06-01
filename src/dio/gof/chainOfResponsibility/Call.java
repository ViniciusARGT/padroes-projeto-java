package dio.gof.chainOfResponsibility;


public class Call {

    boolean resolvido = false;
    int opcao = 0;

    public Call(int opcao) {
        this.opcao = opcao;
    }
}
