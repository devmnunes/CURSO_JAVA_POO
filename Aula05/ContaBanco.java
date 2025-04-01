public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String nome;
    private float saldo;
    private boolean status;


    public void abrirConta(String t){
      setTipoConta(t);
      status = true;
      if (tipoConta == "CC") {
        saldo = 15;

      } if (tipoConta == "CP") {
        saldo = 150;
      } 
    }
    
    public void fecharConta(){
        if (saldo < 0){
            System.out.println("Não conseguimos encerrar sua conta, por favor verifique se se há débitos para pagar.");
        } if (saldo > 0){
            System.out.println("Conta com dinheiro.");
        } else {
            System.out.println("Conta Encerrada!");
            status = false;
        }
      }

    public void depositar(float valor){
        if (status = true) {
            saldo = saldo + valor;
        } else {
            System.out.println("Impossível fazer o depósito");
        }
    }

    public void sacar(float valor){
        if (status = true) {
            if (saldo > valor) {
                saldo = saldo - valor;
            } else {
                System.out.println("Impossível realizar o saque, verifique seu saldo.");
            }
        } else {
            System.out.println("Saque não realizado, verifique o status da conta.");
        }
    }          

    public void pagarMensal(){ 
        var valor = int;
        
        if (status = true){
            if (tipoConta == "CC") {
                valor = 12;
                } if (saldo > valor) {
                        saldo = saldo - valor;
                }




            
        } if (tipoConta == "CP"){
           valor = 20;
        }
    };

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String t) {
        this.tipoConta = t;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    public void statusConta(){
        System.out.println("O Número da conta: " + this.numConta);
        System.out.println("tipo de Conta: " + getTipoConta());
        System.out.println("Nome do Cliente: " + getNome());
        System.out.println("Saldo atual: " + getSaldo());
        System.out.println("Status da Conta: " + this.status);
    }
}
