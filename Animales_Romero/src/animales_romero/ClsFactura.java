/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales_romero;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author windows 8
 */
@Entity
@Table(name = "clsFactura", catalog = "facturacion", schema = "public")
@NamedQueries({
    @NamedQuery(name = "ClsFactura.findAll", query = "SELECT c FROM ClsFactura c"),
    @NamedQuery(name = "ClsFactura.findByCodigofactura", query = "SELECT c FROM ClsFactura c WHERE c.codigofactura = :codigofactura"),
    @NamedQuery(name = "ClsFactura.findByCodigo", query = "SELECT c FROM ClsFactura c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "ClsFactura.findByFecha", query = "SELECT c FROM ClsFactura c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "ClsFactura.findBySubtotal", query = "SELECT c FROM ClsFactura c WHERE c.subtotal = :subtotal"),
    @NamedQuery(name = "ClsFactura.findByTotal", query = "SELECT c FROM ClsFactura c WHERE c.total = :total"),
    @NamedQuery(name = "ClsFactura.findByIva", query = "SELECT c FROM ClsFactura c WHERE c.iva = :iva"),
    @NamedQuery(name = "ClsFactura.findByDescuento", query = "SELECT c FROM ClsFactura c WHERE c.descuento = :descuento")})
public class ClsFactura implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigofactura")
    private String codigofactura;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "subtotal")
    private Double subtotal;
    @Column(name = "total")
    private Double total;
    @Column(name = "iva")
    private Double iva;
    @Column(name = "descuento")
    private Double descuento;

    public ClsFactura() {
    }

    public ClsFactura(String codigofactura) {
        this.codigofactura = codigofactura;
    }

    public String getCodigofactura() {
        return codigofactura;
    }

    public void setCodigofactura(String codigofactura) {
        String oldCodigofactura = this.codigofactura;
        this.codigofactura = codigofactura;
        changeSupport.firePropertyChange("codigofactura", oldCodigofactura, codigofactura);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        Double oldSubtotal = this.subtotal;
        this.subtotal = subtotal;
        changeSupport.firePropertyChange("subtotal", oldSubtotal, subtotal);
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        Double oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        Double oldIva = this.iva;
        this.iva = iva;
        changeSupport.firePropertyChange("iva", oldIva, iva);
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        Double oldDescuento = this.descuento;
        this.descuento = descuento;
        changeSupport.firePropertyChange("descuento", oldDescuento, descuento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigofactura != null ? codigofactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClsFactura)) {
            return false;
        }
        ClsFactura other = (ClsFactura) object;
        if ((this.codigofactura == null && other.codigofactura != null) || (this.codigofactura != null && !this.codigofactura.equals(other.codigofactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "animales_romero.ClsFactura[ codigofactura=" + codigofactura + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
