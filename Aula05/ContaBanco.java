public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String nome;
    private float saldo;
    private boolean status;

    public void abrirConta(String t){
      this.setTipoConta(t);
      this.setStatus(true);
      if (t =="CC") {
            this.setSaldo(50);
      } else if (t == "CP") {
            this.setSaldo(150);
      }
      System.out.println("Conta aberta com sicesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() < 0) {
            System.out.println("Não conseguimos encerrar sua conta, por favor verifique se há débitos para pagar.");
        }
        else if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, saque seu dinheiro para darmos continuidade no fechamento de sua conta.");
        } else {
            System.out.println("Conta Encerrada!");
            this.setStatus(false);
        }
    }

    public void depositar(float valor) {
        if (this.getStatus(true)) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Impossível fazer o depósito");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Impossível realizar o saque, verifique seu saldo.");
            }
        } else {
            System.out.println("Saque não realizado, verifique o status da conta.");
        }
    }

    public void pagarMensal(){ 
       int valor;
       if (tipoConta == "CC") {
            valor = 12;
       } if (tipoConta == "C") {
            valor = 20;
       }

       if (getStatus(true)) {
            if (getSaldo() > valor) {
                setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Não foi possivel realizar o pagamento, verifique o saldo em sua conta.");
        }
    }

    public void ContaBanco() {
        this.saldo = 0;
       this.status = false;
    }

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

    public void statusConta() {
        System.out.println("O Número da conta: " + this.numConta);
        System.out.println("tipo de Conta: " + getTipoConta());
        System.out.println("Nome do Cliente: " + getNome());
        System.out.println("Saldo atual: " + getSaldo());
        System.out.println("Status da Conta: " + this.status);
    }
}

