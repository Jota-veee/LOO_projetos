package uniderp.loo.escola.dominio;

public abstract class BaseAutomotivo extends BaseVeiculoTerrestre{
    protected double pesoLiquido;
    protected int portas;
    
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public BaseAutomotivo(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int eixos, double pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String estadoUF, String tipoVeiculo, int qtdeMotores,
            int qtdeOcupantes, String chassi, String placa, int codigoRenavam, String cidade, double pesoLiquido,
            int portas) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, eixos, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, chassi,
                placa, codigoRenavam, cidade);
        this.pesoLiquido = pesoLiquido;
        this.portas = portas;
    }
}
