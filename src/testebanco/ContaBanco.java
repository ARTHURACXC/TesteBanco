
package testebanco;

/* @author ARTHUR CASTRO */

public class ContaBanco {
    
    /*ATRUBUTOS*/
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    /*MÉTODOS*/
    
    public void info(){
        System.out.println("\n_____________________________________");
        System.out.println("Account number: "+this.getNumConta());
        System.out.println("Account type: "+this.getTipo());
        System.out.println("Client: "+this.getDono());
        System.out.println("Balance: $"+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
        System.out.println("_____________________________________");
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this. setStatus(true);
        if (t=="CC") {
            this.setSaldo(50);
        } else if(t=="CP") {
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("\nYour account cannot be closed with  a positive balance.");
        } else if (this.getSaldo()<0) {
            System.out.println("\nYour account cannot be closed with a negative balance.");
        } else{
            this.setStatus(false);
        }
        
    }
    
    public void depositar(float v){
        if (this.isStatus()){
        this.setSaldo(this.getSaldo() + v);
        System.out.printf("\nSuccessful $%.2f deposit", v);
        } else {
            System.out.println("\nIt's not possible to make a deposit in a closed account!");
        }
    }
    
    public void sacar(float v){
        if(this.isStatus()){
        if (this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo()-v);
            System.out.printf("\nSuccessful $%.2f Withdraw", v);
        } else {
            System.out.println("\nNot enougth founds!!!");
        }
        }else{
           System.out.println("\nIt's not possible to whitdraw money from a closed account!"); 
        }
    }
    
    public void tarifar(){
        float v=0;
        
        if (this.getTipo() == "CC") {
            v=15.25f;          
        } else {
            v=5.5f;   
        }
        this.setSaldo(this.getSaldo() - v);
        System.out.printf("\nSuccessful debit of bank fee ($.2f)", v);
    }
    
    /*METODOS ESPECIAIS*/

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
