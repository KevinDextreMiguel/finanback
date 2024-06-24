package pe.edu.upc.finanzas.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrestamo;
    @Column(name = "montoPrestamo",nullable = false)
    private double montoPrestamo;
    @Column(name = "diaPagaMensual",nullable = false)
    private int diaPagoMensual;

    @Column(name = "tipoCredito",nullable = false)
    private String tipoCredito;

    @Column(name = "tasa",nullable = false)
    private double tasa;
    @Column(name = "tipoTasa",nullable = false)
    private String tipoTasa;

    @Column(name = "periodoGracia",nullable = false)
    private int periodoGracia;

    @Column(name = "tasaMoratoria",nullable = false)
    private double tasaMoratoria;

    @Column(name = "fecha_inicial",nullable = false)
    private LocalDate fecha_inicial;
    @Column(name = "fecha_vencimiento",nullable = false)
    private LocalDate fecha_vencimiento;

    @Column(name = "monto_final")
    private double monto_final;

    @Column(name = "interesPrestamo")
    private double interesPrestamo;


    @Column(name = "cuota")
    private double cuota;

    @Column(name = "interes_cuota")
    private double ineteres_cuota;

    @Column(name = "cantidad_cuota")
    private int cantidad_cuota;

    @Column(name = "saldo")
    private double saldo;

    @Column(name = "estadoPrestamo")
    private String estadoPrestamo;

    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente cliente;

    public Prestamo() {

    }

    public Prestamo(int idPrestamo, double montoPrestamo, int diaPagoMensual, String tipoCredito, double tasa, String tipoTasa, int periodoGracia, double tasaMoratoria, LocalDate fecha_inicial, LocalDate fecha_vencimiento, double monto_final, double interesPrestamo, double cuota, double ineteres_cuota, int cantidad_cuota, double saldo, String estadoPrestamo, Cliente cliente) {
        this.idPrestamo = idPrestamo;
        this.montoPrestamo = montoPrestamo;
        this.diaPagoMensual = diaPagoMensual;
        this.tipoCredito = tipoCredito;
        this.tasa = tasa;
        this.tipoTasa = tipoTasa;
        this.periodoGracia = periodoGracia;
        this.tasaMoratoria = tasaMoratoria;
        this.fecha_inicial = fecha_inicial;
        this.fecha_vencimiento = fecha_vencimiento;
        this.monto_final = monto_final;
        this.interesPrestamo = interesPrestamo;
        this.cuota = cuota;
        this.ineteres_cuota = ineteres_cuota;
        this.cantidad_cuota = cantidad_cuota;
        this.saldo = saldo;
        this.estadoPrestamo = estadoPrestamo;
        this.cliente = cliente;
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public int getPeriodoGracia() {
        return periodoGracia;
    }

    public void setPeriodoGracia(int periodoGracia) {
        this.periodoGracia = periodoGracia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getIneteres_cuota() {
        return ineteres_cuota;
    }

    public void setIneteres_cuota(double ineteres_cuota) {
        this.ineteres_cuota = ineteres_cuota;
    }

    public int getCantidad_cuota() {
        return cantidad_cuota;
    }

    public void setCantidad_cuota(int cantidad_cuota) {
        this.cantidad_cuota = cantidad_cuota;
    }

    public double getInteresPrestamo() {
        return interesPrestamo;
    }

    public void setInteresPrestamo(double interesPrestamo) {
        this.interesPrestamo = interesPrestamo;
    }

    public double getMonto_final() {
        return monto_final;
    }

    public void setMonto_final(double monto_final) {
        this.monto_final = monto_final;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public int getDiaPagoMensual() {
        return diaPagoMensual;
    }

    public void setDiaPagoMensual(int diaPagoMensual) {
        this.diaPagoMensual = diaPagoMensual;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public String getTipoTasa() {
        return tipoTasa;
    }

    public void setTipoTasa(String tipoTasa) {
        this.tipoTasa = tipoTasa;
    }


    public double getTasaMoratoria() {
        return tasaMoratoria;
    }

    public void setTasaMoratoria(double tasaMoratoria) {
        this.tasaMoratoria = tasaMoratoria;
    }

    public LocalDate getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(LocalDate fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
