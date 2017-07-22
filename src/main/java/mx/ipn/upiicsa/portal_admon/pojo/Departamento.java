package mx.ipn.upiicsa.portal_admon.pojo;
// Generated 22/07/2017 04:38:28 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Departamento generated by hbm2java
 */
public class Departamento  implements java.io.Serializable {


     private Integer id;
     private Sucursal sucursal;
     private String codigo;
     private String descripcion;
     private String ubicacion;
     private Date fechaAlta;
     private String usuarioAlta;
     private int status;
     private Set beaconDepartamentos = new HashSet(0);

    public Departamento() {
    }

	
    public Departamento(Sucursal sucursal, String codigo, String descripcion, Date fechaAlta, String usuarioAlta, int status) {
        this.sucursal = sucursal;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
        this.usuarioAlta = usuarioAlta;
        this.status = status;
    }
    public Departamento(Sucursal sucursal, String codigo, String descripcion, String ubicacion, Date fechaAlta, String usuarioAlta, int status, Set beaconDepartamentos) {
       this.sucursal = sucursal;
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.ubicacion = ubicacion;
       this.fechaAlta = fechaAlta;
       this.usuarioAlta = usuarioAlta;
       this.status = status;
       this.beaconDepartamentos = beaconDepartamentos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Sucursal getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
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
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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
    public Set getBeaconDepartamentos() {
        return this.beaconDepartamentos;
    }
    
    public void setBeaconDepartamentos(Set beaconDepartamentos) {
        this.beaconDepartamentos = beaconDepartamentos;
    }




}


