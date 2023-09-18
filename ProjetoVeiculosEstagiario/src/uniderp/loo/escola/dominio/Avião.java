package uniderp.loo.escola.dominio;

public class Avião extends BaseVeiculoAereo {
    private String piloto;

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public Avião(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao, int eixos,
            double pesoTotal, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes,
            int portas, int cabine, int asas, String piloto) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, eixos, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, portas,
                cabine, asas);
        this.piloto = piloto;
    }  
}
