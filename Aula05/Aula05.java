public class Aula05 {
   public static void main(String[] args) {
    Conta c1 = new Conta();
        c1.numConta = 123456;
        c1.tipoConta = "CC";
        c1.setNome("Matheus Nunes");
        c1.abrirConta();
        c1.statusConta();

    Conta c2 = new Conta();
        c2.numConta = 150895;
        c2.tipoConta = "CP";
        c2.setNome("Daniela dos Santos");
        c2.abrirConta();
        c2.statusConta();
   }

   

}
