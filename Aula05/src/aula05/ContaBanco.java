package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    
    public void estadoAtual(){
        System.out.println("\nConta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus() + "\n\n");
    }
    
    public void abrirConta(int numConta, String dono, String tipo_conta){
        if(this.getStatus() == false){
            this.status = true;
            this.numConta = numConta;
            this.dono = dono;
            this.tipo = tipo_conta;
            if(this.getTipo().equals("cc")){
                this.depositar(50);
            }else if(getTipo().equals("cp")){
                this.depositar(150);
            }
        }else{
            System.out.println("Esta conta já está aberta!");
        }
    }
    
    public void fecharConta(){
        if(this.getStatus() == true){
            if(this.getSaldo() == 0){
                this.status = false;
            }else{
                System.out.println("Você não pode fechar uma conta com debito ou com saldo positivo!");
            }
        }else{
            System.out.println("Esta conta já está fechada!");
        }
    }
    
    public void depositar(float Valor_deposito){
        if(this.getStatus() == true){
            this.saldo = this.getSaldo() + Valor_deposito;
        }else{
            System.out.println("Valor não pode ser depositado porque esta conta está fechada!");
        }   
    }
    
    public void sacar(float Valor_saque){
        if(this.getStatus() == true){
            if(this.getSaldo() >= Valor_saque){
                this.saldo = this.getSaldo() - Valor_saque;
            }else{
                System.out.println("ERRO! -> Saldo insuficente!");
            }
        }else{
            System.out.println("Valor não pode ser sacado porque esta conta está fechada!");
        }
    }
    
    public void pagarMensal(){
        if(this.getTipo().equals("cp")){
            this.sacar(this.getSaldo() - 20);
        }else if(getTipo().equals("cc")){
            this.sacar(this.getSaldo() - 12);
        }
    }

    public int getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public boolean getStatus() {
        return this.status;
    }
}
