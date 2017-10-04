
package ejercicio1;

public class Cuenta {
    //Atributos
    private String Nombre;
    private int Nro_cuenta;
    private double saldo;
    
    //Contructores
    //Por defecto
    
    public Cuenta() {
    }
     //Con parametros

    public Cuenta(String Nombre, int Nro_cuenta, double saldo) {
        this.Nombre = Nombre;
        this.Nro_cuenta = Nro_cuenta;
        this.saldo = saldo;
    }
    
    //Copia
    public Cuenta(Cuenta cuentas){
        this.Nombre = cuentas.Nombre;
        this.Nro_cuenta = cuentas.Nro_cuenta;
        this.saldo = cuentas.saldo;
    }
    
    // Setters y Getters
    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNro_cuenta() {
        return Nro_cuenta;
    }

    public void setNro_cuenta(int Nro_cuenta) {
        this.Nro_cuenta = Nro_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodos
    public void ingreso() {}
    public void reintegro(){}
    public void transferencia(){}
    
}
