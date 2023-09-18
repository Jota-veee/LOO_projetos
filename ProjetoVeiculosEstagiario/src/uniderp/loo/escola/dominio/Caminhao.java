package uniderp.loo.escola.dominio;

public class Caminhao extends BaseAutomotivo {
    private int carroceria;

    public int getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(int carroceria) {
        this.carroceria = carroceria;
    }

    public Caminhao(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao, int eixos,
            double pesoTotal, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes,
            String chassi, String placa, int codigoRenavam, String cidade, double pesoLiquido, int portas,
            int carroceria) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, eixos, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, chassi,
                placa, codigoRenavam, cidade, pesoLiquido, portas);
        this.carroceria = carroceria;
    }
}
