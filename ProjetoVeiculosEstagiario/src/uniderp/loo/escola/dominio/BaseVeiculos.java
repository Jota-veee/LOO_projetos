package uniderp.loo.escola.dominio;

class BaseVeiculos {
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected int anoModelo;
    protected int anoFabricacao;
    protected int eixos;
    protected double pesoTotal;
    protected int assentos;
    protected int rodas;
    protected String fabricante;
    protected double potencia;
    protected String tipoCombustivel;
    protected String nomeProprietario;
    protected String estadoUF;
    protected String tipoVeiculo;
    protected int qtdeMotores;
    protected int qtdeOcupantes;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public BaseVeiculos(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao, int eixos,
            double pesoTotal, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.eixos = eixos;
        this.pesoTotal = pesoTotal;
        this.assentos = assentos;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.nomeProprietario = nomeProprietario;
        this.estadoUF = estadoUF;
        this.tipoVeiculo = tipoVeiculo;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
    }
}