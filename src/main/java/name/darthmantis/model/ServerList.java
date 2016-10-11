/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.darthmantis.model;

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
 * @author darthmantis
 */
@Entity
@Table(name = "server_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerList.findAll", query = "SELECT s FROM ServerList s")
    , @NamedQuery(name = "ServerList.findByName", query = "SELECT s FROM ServerList s WHERE s.name = :name")
    , @NamedQuery(name = "ServerList.findByType", query = "SELECT s FROM ServerList s WHERE s.type = :type")
    , @NamedQuery(name = "ServerList.findByRegion", query = "SELECT s FROM ServerList s WHERE s.region = :region")})
public class ServerList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "name")
    private String name;
    @Size(max = 10)
    @Column(name = "type")
    private String type;
    @Size(max = 10)
    @Column(name = "region")
    private String region;

    public ServerList() {
    }

    public ServerList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServerList)) {
            return false;
        }
        ServerList other = (ServerList) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "name.darthmantis.model.ServerList[ name=" + name + " ]";
    }
    
}
