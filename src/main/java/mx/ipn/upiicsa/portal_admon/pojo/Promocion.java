package mx.ipn.upiicsa.portal_admon.pojo;
// Generated 22/07/2017 04:38:28 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Promocion generated by hbm2java
 */
public class Promocion  implements java.io.Serializable {


     private int id;
     private TipoPromocion tipoPromocion;
     private String codigo;
     private String descripcion;
     private String imagen;
     private Date fechaInicio;
     private Date fechaFin;
     private Date fechaAlta;
     private String usuarioAlta;
     private int status;
     private Set promocionBeacons = new HashSet(0);

    public Promocion() {
    }

	
    public Promocion(int id, TipoPromocion tipoPromocion, String codigo, String descripcion, String imagen, Date fechaInicio, Date fechaFin, Date fechaAlta, String usuarioAlta, int status) {
        this.id = id;
        this.tipoPromocion = tipoPromocion;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaAlta = fechaAlta;
        this.usuarioAlta = usuarioAlta;
        this.status = status;
    }
    public Promocion(int id, TipoPromocion tipoPromocion, String codigo, String descripcion, String imagen, Date fechaInicio, Date fechaFin, Date fechaAlta, String usuarioAlta, int status, Set promocionBeacons) {
       this.id = id;
       this.tipoPromocion = tipoPromocion;
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.imagen = imagen;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.fechaAlta = fechaAlta;
       this.usuarioAlta = usuarioAlta;
       this.status = status;
       this.promocionBeacons = promocionBeacons;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public TipoPromocion getTipoPromocion() {
        return this.tipoPromocion;
    }
    
    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getUsuarioAlta() {
        return this.usuarioAlta;
    }
    
    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    public Set getPromocionBeacons() {
        return this.promocionBeacons;
    }
    
    public void setPromocionBeacons(Set promocionBeacons) {
        this.promocionBeacons = promocionBeacons;
    }




}


