package dio.gof.chainOfResponsibility;

public class OutrosTratamentos extends BaseTratamento{
    @Override
    public Call Tratar(Call call) {
        System.out.println("Outro tratamento.");
        call.resolvido = true;
        return call;
    }
}
