package boletin.pkg6;

/**
 *
 * @author fdacostamillos
 */
public class Boletin6 {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setNumCuenta(1956321);
        cuenta1.setNombre("Aurelio");
        cuenta1.setSaldo(1000);
        cuenta1.ingreso(70);
        cuenta1.reintegro(500);
        cuenta1.visualizar();
        
        
        Cuenta cuenta2 = new Cuenta();
        cuenta2.setNumCuenta(6543217);
        cuenta2.setNombre("Amador");
        cuenta2.setSaldo(5000);
        cuenta2.ingreso(400);
        cuenta2.reintegro(2000);
        cuenta2.visualizar();
        
        cuenta2.transferencia(cuenta1, 100);
        cuenta1.visualizar();
        cuenta2.visualizar();
    }
    
}
