package uniderp.loo.escola.dominio;

public class Onibus extends BaseAutomotivo {
    private int andares;

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public Onibus(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao, int eixos,
            double pesoTotal, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes,
            String chassi, String placa, int codigoRenavam, String cidade, double pesoLiquido, int portas,
            int andares) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, eixos, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, chassi,
                placa, codigoRenavam, cidade, pesoLiquido, portas);
        this.andares = andares;
    }
    
    
}
