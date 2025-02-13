public class Endereco {
    private String cep;
    private Integer numero;
    private String complemento;

    public Endereco (String cep, Integer numero, String complemento){
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    public getCep(){
        return cep;
    }

    public setCe(String cep){
        this.cep = cep;
    }

    public getNumero(){
        return numero;
    }

    public setNumero(Integer numero){
        this.numero = numero;
    }

    public getComplemento(){
        return complemento;
    }

    public setComplemento(String complemento){
        this.complemento = complemento;
    }

}
