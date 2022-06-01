package dio.gof.chainOfResponsibility;

public class VendasTratamento extends BaseTratamento{
    @Override
    public Call Tratar(Call call) {
        if(call.opcao == 1) {
            System.out.println("tratamento de vendas.");
            call.resolvido = true;
            return call;
        }
        return super.Tratar(call);
    }
}
