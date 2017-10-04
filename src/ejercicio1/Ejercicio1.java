
package ejercicio1;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c = new Cuenta("Juan", 1234, 320);
        System.out.println(""+c.getNombre());
        System.out.println(""+c.getNro_cuenta());
        System.out.println(""+c.getSaldo());
        System.out.println("----------------------------------------------");
        System.out.println("Nombre: "+c.getNombre()+"\t"+"Nro Cuenta: "+c.getNro_cuenta()+"\t"+"Saldo: "+c.getSaldo());
    }
    
}
