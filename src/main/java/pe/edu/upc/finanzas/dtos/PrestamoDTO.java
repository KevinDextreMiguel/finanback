package pe.edu.upc.finanzas.dtos;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.finanzas.entities.Cliente;

import java.time.LocalDate;
import java.util.Date;

public class PrestamoDTO {
    private int idPrestamo;
    private double montoPrestamo;
    private int diaPagoMensual;
    private String tipoCredito;
    private double tasa;
    private String tipoTasa;
    private int periodoGracia;
    private double tasaMoratoria;
    private LocalDate fecha_inicial;
    private LocalDate fecha_vencimiento;
    private Cliente cliente;
    private double monto_final;
    private double interesPrestamo;

    private double cuota;
    private double ineteres_cuota;
    private int cantidad_cuota;
    private double saldo;
    private String estadoPrestamo;

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
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

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }




    public double getMonto_final() {
        return monto_final;
    }

    public void setMonto_final(double monto_final) {
        this.monto_final = monto_final;
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

    public int getPeriodoGracia() {
        return periodoGracia;
    }

    public void setPeriodoGracia(int periodoGracia) {
        this.periodoGracia = periodoGracia;
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
