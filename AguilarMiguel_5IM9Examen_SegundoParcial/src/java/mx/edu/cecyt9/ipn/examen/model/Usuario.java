/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cecyt9.ipn.examen.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuario.findByApPat", query = "SELECT u FROM Usuario u WHERE u.apPat = :apPat")
    , @NamedQuery(name = "Usuario.findByApMat", query = "SELECT u FROM Usuario u WHERE u.apMat = :apMat")
    , @NamedQuery(name = "Usuario.findByEscuela", query = "SELECT u FROM Usuario u WHERE u.escuela = :escuela")
    , @NamedQuery(name = "Usuario.findByMatFav", query = "SELECT u FROM Usuario u WHERE u.matFav = :matFav")
    , @NamedQuery(name = "Usuario.findByDeporFav", query = "SELECT u FROM Usuario u WHERE u.deporFav = :deporFav")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 30)
    @Column(name = "apPat")
    private String apPat;
    @Size(max = 30)
    @Column(name = "apMat")
    private String apMat;
    @Size(max = 60)
    @Column(name = "escuela")
    private String escuela;
    @Size(max = 60)
    @Column(name = "matFav")
    private String matFav;
    @Size(max = 60)
    @Column(name = "deporFav")
    private String deporFav;

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getMatFav() {
        return matFav;
    }

    public void setMatFav(String matFav) {
        this.matFav = matFav;
    }

    public String getDeporFav() {
        return deporFav;
    }

    public void setDeporFav(String deporFav) {
        this.deporFav = deporFav;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.cecyt9.ipn.examen.model.Usuario[ nombre=" + nombre + " ]";
    }
    
}
