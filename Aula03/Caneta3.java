public class Caneta3 {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
 
    public Caneta3() {
    }
 
    void status() {
       System.out.println("Uma caneta " + this.cor);
       System.out.println("Esta tampada? " + this.tampada);
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Ponta: " + this.ponta);
       System.out.println("Carga: " + this.carga + "%.");
    }
 
   public void rabiscar() {
       if (this.tampada) {
          System.out.println("Erro não posso rabiscar.");
       } else {
          System.out.println("Ok, Estou rabiscando.");
       }
 
    }
 
   protected void tampar() {
       this.tampada = true;
    }
 
   protected void destampar() {
       this.tampada = false;
    }
 
}
