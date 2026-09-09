package Ejercicio4;

public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipo;

    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipo = "Ahorros";
    }

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipo = "Corriente";
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Número=" + numeroCuenta + ", Saldo=" + saldo + ", Tipo=" + tipo + "]";
    }
}