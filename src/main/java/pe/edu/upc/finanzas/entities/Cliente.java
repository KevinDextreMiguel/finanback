package pe.edu.upc.finanzas.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(name = "nombreCliente",nullable = false)
    private String nombreCliente;
    @Column(name = "dniCliente",nullable = false)
    private String dniCliente;
    @Column(name = "direccionCliente",nullable = false)
    private String direccionCliente;
    @Column(name = "limiteCredito",nullable = false)
    private double limiteCredito;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombreCliente, String dniCliente, String direccionCliente, double limiteCredito) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.direccionCliente = direccionCliente;
        this.limiteCredito = limiteCredito;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

}
