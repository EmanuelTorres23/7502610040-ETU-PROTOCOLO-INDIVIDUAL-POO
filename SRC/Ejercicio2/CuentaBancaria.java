package Ejercicio2;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "Sin asignar";
        this.saldo = 0.0;
        this.tipoCuenta = "Sin asignar";
    }

    // 2. Constructor con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }

    // 3. Constructor con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para imprimir
    public void mostrarInformacion() {
        System.out.println("Información de la Cuenta");
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Tipo de cuenta: " + this.tipoCuenta);
        System.out.println("Saldo actual: $" + this.saldo);
    }

    // Ejecución de prueba
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("10023456", 150000.0, "Ahorros");
        cuenta1.mostrarInformacion();
    }
}