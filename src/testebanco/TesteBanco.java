
package testebanco;

/* @author ARTHUR CASTRO*/
public class TesteBanco {

    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(10001);
        conta1.setDono("Arthur");
        conta1.abrirConta("CC");
        conta1.depositar(150);
        conta1.sacar(125);
        
        conta1.info();
        
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(10002);
        conta2.setDono("Lais");
        conta2.abrirConta("CP");
        conta2.depositar(150);
        conta2.sacar(125);
        
        conta2.info();
    }
    
}
