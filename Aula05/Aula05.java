public class Aula05 {
   public static void main(String[] args) {
    ContaBanco c1 = new ContaBanco();
        c1.numConta = 123456;
        c1.tipoConta = "CC";
        c1.setNome("Matheus Nunes");
        c1.abrirConta();
        c1.statusConta();

    ContaBanco c2 = new ContaBanco();
        c2.numConta = 150895;
        c2.tipoConta = "CP";
        c2.setNome("Daniela dos Santos");
        c2.abrirConta();
        c2.statusConta();
   }

   

}
