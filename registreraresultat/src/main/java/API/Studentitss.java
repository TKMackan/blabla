/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import entities.Studentits;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcu
 */
@Entity
@Table(name = "studentits")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studentits.findAll", query = "SELECT s FROM Studentits s"),
    @NamedQuery(name = "Studentits.findByPersonnr", query = "SELECT s FROM Studentits s WHERE s.personnr = :personnr"),
    @NamedQuery(name = "Studentits.findByFirstname", query = "SELECT s FROM Studentits s WHERE s.firstname = :firstname"),
    @NamedQuery(name = "Studentits.findByLastname", query = "SELECT s FROM Studentits s WHERE s.lastname = :lastname"),
    @NamedQuery(name = "Studentits.findByNameltu", query = "SELECT s FROM Studentits s WHERE s.nameltu = :nameltu")})
public class Studentitss implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PERSONNR")
    private String personnr;
    @Size(max = 50)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Size(max = 50)
    @Column(name = "LASTNAME")
    private String lastname;
    @Size(max = 50)
    @Column(name = "NAMELTU")
    private String nameltu;

    public Studentitss() {
    }

    public Studentitss(String personnr) {
        this.personnr = personnr;
    }

    public String getPersonnr() {
        return personnr;
    }

    public void setPersonnr(String personnr) {
        this.personnr = personnr;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNameltu() {
        return nameltu;
    }

    public void setNameltu(String nameltu) {
        this.nameltu = nameltu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personnr != null ? personnr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentits)) {
            return false;
        }
        Studentits other = (Studentits) object;
        if ((this.personnr == null && other.personnr != null) || (this.personnr != null && !this.personnr.equals(other.personnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "API.Studentits[ personnr=" + personnr + " ]";
    }
    
}
