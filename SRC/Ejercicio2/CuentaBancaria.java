package Ejercicio2;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this.numeroCuenta = "Sin asignar";
        this.saldo = 0.0;
        this.tipoCuenta = "Sin asignar";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("10023456", "Ahorros");
        CuentaBancaria cuenta3 = new CuentaBancaria("20098765", 500000.0, "Corriente");
    }
}