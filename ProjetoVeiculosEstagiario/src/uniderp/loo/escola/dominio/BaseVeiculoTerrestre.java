package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoTerrestre extends BaseVeiculos {
    protected String chassi;
    protected String placa;
    protected int codigoRenavam;
    protected String cidade;
    
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(int codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public BaseVeiculoTerrestre(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int eixos, double pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String estadoUF, String tipoVeiculo, int qtdeMotores,
            int qtdeOcupantes, String chassi, String placa, int codigoRenavam, String cidade) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, eixos, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, tipoVeiculo, qtdeMotores, qtdeOcupantes);
        this.chassi = chassi;
        this.placa = placa;
        this.codigoRenavam = codigoRenavam;
        this.cidade = cidade;
    }
}
