package dio.gof.chainOfResponsibility;

public class ReebolsoTratamento extends BaseTratamento{
    @Override
    public Call Tratar(Call call) {
        if(call.opcao == 2) {
            System.out.println("tratamento de reembolso.");
            call.resolvido = true;
            return call;
        }
        return super.Tratar(call);
    }
}
