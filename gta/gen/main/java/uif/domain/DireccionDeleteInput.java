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
import javax.persistence.ElementCollection;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(type = "uif_direccion")
@Linked(template = "/application/uif_direccions")
@JsonPropertyOrder(alphabetic = true)
public class DireccionDeleteInput {

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

    @PersistentAttribute(name = "provincia")
    private String provincia;

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

    @PersistentAttribute(name = "tipo_numero")
    private String tipo_numero;

    @PersistentAttribute(name = "tipo_via")
    private String tipo_via;

    @PersistentAttribute(name = "tipo_zona")
    private String tipo_zona;

    @PersistentAttribute(name = "i_folder_id")
    @ElementCollection(targetClass = String.class)
    private List<String> i_folder_id;

    @PersistentAttribute(name = "r_creation_date")
    private Date r_creation_date;

    @PersistentAttribute(name = "r_creator_name")
    private String r_creator_name;

    @PersistentAttribute(name = "r_modify_date")
    private Date r_modify_date;

    @PersistentAttribute(name = "r_modifier")
    private String r_modifier;

    @PersistentAttribute(name = "r_object_type")
    private String r_object_type;

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

    public String getProvincia(){
        return provincia;
    }

    public void setProvincia(String provincia){
        this.provincia = provincia;
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

    public List<String> getI_folder_id(){
        return i_folder_id;
    }

    public void setI_folder_id(List<String> i_folder_id){
        this.i_folder_id = i_folder_id;
    }

    public Date getR_creation_date(){
        return r_creation_date;
    }

    public void setR_creation_date(Date r_creation_date){
        this.r_creation_date = r_creation_date;
    }

    public String getR_creator_name(){
        return r_creator_name;
    }

    public void setR_creator_name(String r_creator_name){
        this.r_creator_name = r_creator_name;
    }

    public Date getR_modify_date(){
        return r_modify_date;
    }

    public void setR_modify_date(Date r_modify_date){
        this.r_modify_date = r_modify_date;
    }

    public String getR_modifier(){
        return r_modifier;
    }

    public void setR_modifier(String r_modifier){
        this.r_modifier = r_modifier;
    }

    public String getR_object_type(){
        return r_object_type;
    }

    public void setR_object_type(String r_object_type){
        this.r_object_type = r_object_type;
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