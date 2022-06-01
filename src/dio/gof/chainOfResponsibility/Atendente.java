package dio.gof.chainOfResponsibility;

public class Atendente {
    public void Tratar(int opcao) {
        final VendasTratamento tratar = new VendasTratamento();

        tratar.setProximo(new ReebolsoTratamento()).setProximo(new OutrosTratamentos());

        tratar.Tratar(new Call(opcao));
    }
}
