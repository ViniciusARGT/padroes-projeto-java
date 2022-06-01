package dio.gof.chainOfResponsibility;

public  abstract class BaseTratamento {
    protected  BaseTratamento proximo = null;

    public BaseTratamento setProximo(BaseTratamento tratamento) {
        this.proximo = tratamento;
        return tratamento;
    }

    public Call Tratar (Call call) {
        if (this.proximo != null) {
            return Tratar(call);
        }
        return call;

    }
}
