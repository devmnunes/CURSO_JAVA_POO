public class Conta {
    public int numConta;
    protected String tipoConta;
    private String nome;
    private float saldo;
    private boolean status;

    void abrirConta(){
      this.status = true;
        if(tipoConta == "CC"){
            saldo = 50;
        } else  {
            saldo = 150;
        }
    }
    

    public void fecharConta(){
        if (saldo < 0){
            System.out.println("Seu saldo é negativo, não podemos fechar sua conta!!!");
            status = true;
        } else {
            System.out.println("Conta encerrada com SUCESSO!!!");
            status = false;
        }
      }

    public void depositar(){
        status = true;
    }

    public void sacar(){
        status = true;
    }          


    public void pagarMensal(){
        if (tipoConta == "CC"){
            saldo = saldo - 12;
        }
        if (tipoConta == "CP"){
            saldo = saldo - 50;
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void statusConta(){
        System.out.println("O Número da conta: " + this.numConta);
        System.out.println("tipo de Conta: " + getTipoConta());
        System.out.println("Nome do Cliente: " + getNome());
        System.out.println("Saldo atual: " + getSaldo());
        System.out.println("Status da Conta: " + this.status);
    }
}
