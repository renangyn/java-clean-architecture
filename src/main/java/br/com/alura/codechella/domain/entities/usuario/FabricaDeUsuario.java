public class FabricaDeUsuario {
    private Usuario usuario;
    

    public Usuario comNomeCpfNascimento(String nome,String cpf, LocalDate nascimento ){
        this.usuario= new Usuario(cpf, nome, nascimento, email:""); 
        return this.usuario;
    }

    private Usuario incluirEndereco(String cep, Integer numero,String complemento ){
        this.usuario.setEndereco(new Endereco(cep, numero, complemento));
    }
}
