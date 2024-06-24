package pe.edu.upc.finanzas.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Transaccion")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTransaccion;
    @Column(name = "fechaTransaccion",nullable = false)
    private Date fechaTransaccion;
    @Column(name = "tipoTransaccion",nullable = false)
    private String tipoTransaccion;
    @Column(name = "montoTransaccion",nullable = false)
    private double montoTransaccion;
    @ManyToOne
    @JoinColumn(name = "cuentaId")
    private Cuenta cuenta;

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, Date fechaTransaccion, String tipoTransaccion, double montoTransaccion, Cuenta cuenta) {
        this.idTransaccion = idTransaccion;
        this.fechaTransaccion = fechaTransaccion;
        this.tipoTransaccion = tipoTransaccion;
        this.montoTransaccion = montoTransaccion;
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }
    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    public double getMontoTransaccion() {
        return montoTransaccion;
    }
    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }
}
