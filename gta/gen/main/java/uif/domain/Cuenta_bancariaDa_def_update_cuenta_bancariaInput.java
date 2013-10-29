package uif.domain;

import com.emc.xcp.persistence.annotation.CustomAttribute;
import com.emc.xcp.persistence.annotation.PersistentAttribute;
import com.emc.xcp.persistence.annotation.PersistentId;
import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.domain.LinkSource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(type = "uif_cuenta_bancaria")
@Linked(template = "/application/uif_cuenta_bancarias")
@JsonPropertyOrder(alphabetic = true)
public class Cuenta_bancariaDa_def_update_cuenta_bancariaInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "banco")
    private String banco;

    @PersistentAttribute(name = "fecha_apertura")
    private Date fecha_apertura;

    @PersistentAttribute(name = "fecha_cierre")
    private Date fecha_cierre;

    @PersistentAttribute(name = "moneda")
    private String moneda;

    @PersistentAttribute(name = "pais")
    private String pais;

    @PersistentAttribute(name = "object_name")
    private String object_name;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public List<String> getEffectivePermissions(){
        return effectivePermissions;
    }

    public void setEffectivePermissions(List<String> effectivePermissions){
        this.effectivePermissions = effectivePermissions;
    }

    public String getBanco(){
        return banco;
    }

    public void setBanco(String banco){
        this.banco = banco;
    }

    public Date getFecha_apertura(){
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura){
        this.fecha_apertura = fecha_apertura;
    }

    public Date getFecha_cierre(){
        return fecha_cierre;
    }

    public void setFecha_cierre(Date fecha_cierre){
        this.fecha_cierre = fecha_cierre;
    }

    public String getMoneda(){
        return moneda;
    }

    public void setMoneda(String moneda){
        this.moneda = moneda;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getObject_name(){
        return object_name;
    }

    public void setObject_name(String object_name){
        this.object_name = object_name;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}