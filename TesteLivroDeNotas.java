public class TesteLivroDeNotas{
    public static void main(String args []){
        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("digite o nome da disciplina");
        //variavel de referencia = ponteiro
        //var somente apartir de java10

        var livroDeNotas = new LivroDeNotas(nomeDisciplina);
       // livroDeNotas.nomeDisciplina = nomeDisciplina;
        livroDeNotas.exibirMensagem();
        System.out.println("Ate logo");
    } 
}