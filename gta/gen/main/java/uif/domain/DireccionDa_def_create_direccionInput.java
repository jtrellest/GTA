package uif.domain;

import com.emc.xcp.persistence.annotation.CustomAttribute;
import com.emc.xcp.persistence.annotation.PersistentAttribute;
import com.emc.xcp.persistence.annotation.PersistentId;
import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.domain.LinkSource;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(type = "uif_direccion")
@Linked(template = "/application/uif_direccions")
@JsonPropertyOrder(alphabetic = true)
public class DireccionDa_def_create_direccionInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "ciudad")
    private String ciudad;

    @PersistentAttribute(name = "codigo_postal")
    private String codigo_postal;

    @PersistentAttribute(name = "departamento")
    private String departamento;

    @PersistentAttribute(name = "distrito")
    private String distrito;

    @PersistentAttribute(name = "nombre_via")
    private String nombre_via;

    @PersistentAttribute(name = "nombre_zona")
    private String nombre_zona;

    @PersistentAttribute(name = "numero_exteriores")
    private String numero_exteriores;

    @PersistentAttribute(name = "numero_interiores")
    private String numero_interiores;

    @PersistentAttribute(name = "pais")
    private String pais;

    @PersistentAttribute(name = "provincia")
    private String provincia;

    @PersistentAttribute(name = "tipo_numero")
    private String tipo_numero;

    @PersistentAttribute(name = "tipo_via")
    private String tipo_via;

    @PersistentAttribute(name = "tipo_zona")
    private String tipo_zona;

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

    public String getCiudad(){
        return ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public String getCodigo_postal(){
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal){
        this.codigo_postal = codigo_postal;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDistrito(){
        return distrito;
    }

    public void setDistrito(String distrito){
        this.distrito = distrito;
    }

    public String getNombre_via(){
        return nombre_via;
    }

    public void setNombre_via(String nombre_via){
        this.nombre_via = nombre_via;
    }

    public String getNombre_zona(){
        return nombre_zona;
    }

    public void setNombre_zona(String nombre_zona){
        this.nombre_zona = nombre_zona;
    }

    public String getNumero_exteriores(){
        return numero_exteriores;
    }

    public void setNumero_exteriores(String numero_exteriores){
        this.numero_exteriores = numero_exteriores;
    }

    public String getNumero_interiores(){
        return numero_interiores;
    }

    public void setNumero_interiores(String numero_interiores){
        this.numero_interiores = numero_interiores;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getProvincia(){
        return provincia;
    }

    public void setProvincia(String provincia){
        this.provincia = provincia;
    }

    public String getTipo_numero(){
        return tipo_numero;
    }

    public void setTipo_numero(String tipo_numero){
        this.tipo_numero = tipo_numero;
    }

    public String getTipo_via(){
        return tipo_via;
    }

    public void setTipo_via(String tipo_via){
        this.tipo_via = tipo_via;
    }

    public String getTipo_zona(){
        return tipo_zona;
    }

    public void setTipo_zona(String tipo_zona){
        this.tipo_zona = tipo_zona;
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