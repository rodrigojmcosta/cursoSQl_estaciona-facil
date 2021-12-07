package beans;

public class Veiculo {

    private int cod;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private String nomeProp;
    private String telProp;
    private String cpfProp;

    public Veiculo() {

    }

    ;
    
    public Veiculo(int cod, String marca, String modelo, String cor, String placa, String nomeProp,
            String telProp, String cpfProp) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.nomeProp = nomeProp;
        this.telProp = telProp;
        this.cpfProp = cpfProp;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeProp() {
        return nomeProp;
    }

    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    public String getTelProp() {
        return telProp;
    }

    public void setTelProp(String telProp) {
        this.telProp = telProp;
    }

    public String getCpfProp() {
        return cpfProp;
    }

    public void setCpfProp(String cpfProp) {
        this.cpfProp = cpfProp;
    }

}
