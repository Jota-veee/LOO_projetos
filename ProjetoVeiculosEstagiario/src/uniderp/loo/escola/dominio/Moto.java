package uniderp.loo.escola.dominio;

public class Moto extends BaseVeiculoTerrestre {
    private int manopla;

    public int getManopla() {
        return manopla;
    }

    public void setManopla(int manopla) {
        this.manopla = manopla;
    }

    public Moto(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao, int eixos,
            double pesoTotal, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes,
            String chassi, String placa, int codigoRenavam, String cidade, int manopla) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, eixos, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, chassi,
                placa, codigoRenavam, cidade);
        this.manopla = manopla;
    }   
}
