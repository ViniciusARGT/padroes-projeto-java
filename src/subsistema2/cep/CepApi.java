package subsistema2.cep;

import dio.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instacia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instacia;
    }

    public String recuperarCidade(String cep) {
        return "Uberlandia";
    }

    public String recuperarEstado(String cep) {
        return "MG";
    }
}


