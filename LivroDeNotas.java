public class LivroDeNotas{
    String nomeDisciplina;
    public void exibirMensagem(){
       System.out.printf("Bem vindo ao livro de notas de %s \n",nomeDisciplina);
    }
    //construtor padrao(onde a lista de parametros é vazia)
LivroDeNotas(String n){
   this.nomeDisciplina=n;
}
}