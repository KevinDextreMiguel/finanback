package pe.edu.upc.finanzas.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Cuenta")

public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuenta;
    @Column(name = "saldoActual",nullable = false)
    private double saldoActual;
    @Column(name = "numeroCuenta",nullable = false)
    private String numeroCuenta;
    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(int idCuenta, double saldoActual, String numeroCuenta, Cliente cliente) {
        this.idCuenta = idCuenta;
        this.saldoActual = saldoActual;
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
