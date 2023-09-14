public class LivroDeNotas{
    
    private String nomeDisciplina;
    //metodos getter/setter
    //principio do menor privilegio
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    setter
    public void setNomeDisciplina(){
        this.nomeDisciplina= nomeDisciplina;
    }
    public void exibirMensagem(){
       System.out.printf("Bem vindo ao livro de notas de %s \n",nomeDisciplina);
    }
    //construtor padrao(onde a lista de parametros é vazia)
LivroDeNotas(String n){
   this.nomeDisciplina=n;
}
}