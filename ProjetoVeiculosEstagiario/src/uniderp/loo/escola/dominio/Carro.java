package uniderp.loo.escola.dominio;

public class Carro extends BaseAutomotivo{
    private String conversivel;

    public String getConversivel() {
        return conversivel;
    }

    public void setConversivel(String conversivel) {
        this.conversivel = conversivel;
    }

    public Carro(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao, int eixos,
            double pesoTotal, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes,
            String chassi, String placa, int codigoRenavam, String cidade, double pesoLiquido, int portas,
            String conversivel) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, eixos, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, chassi,
                placa, codigoRenavam, cidade, pesoLiquido, portas);
        this.conversivel = conversivel;
    } 
}
