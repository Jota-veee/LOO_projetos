package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoAereo extends BaseVeiculos {
    protected int portas;
    protected int cabine;
    protected int asas;
    
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getCabine() {
        return cabine;
    }
    public void setCabine(int cabine) {
        this.cabine = cabine;
    }
    public int getAsas() {
        return asas;
    }
    public void setAsas(int asas) {
        this.asas = asas;
    }
    public BaseVeiculoAereo(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int eixos, double pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String estadoUF, String tipoVeiculo, int qtdeMotores,
            int qtdeOcupantes, int portas, int cabine, int asas) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, eixos, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, tipoVeiculo, qtdeMotores, qtdeOcupantes);
        this.portas = portas;
        this.cabine = cabine;
        this.asas = asas;
    }  
}
