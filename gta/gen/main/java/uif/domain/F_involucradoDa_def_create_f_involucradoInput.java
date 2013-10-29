package uif.domain;

import com.emc.xcp.persistence.annotation.CustomAttribute;
import com.emc.xcp.persistence.annotation.FolderId;
import com.emc.xcp.persistence.annotation.PersistentAttribute;
import com.emc.xcp.persistence.annotation.PersistentId;
import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.domain.LinkSource;
import java.util.List;
import java.util.Map;
import javax.persistence.ElementCollection;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(type = "uif_f_involucrado")
@Linked(template = "/application/uif_f_involucrados")
@JsonPropertyOrder(alphabetic = true)
public class F_involucradoDa_def_create_f_involucradoInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "alias")
    @ElementCollection(targetClass = String.class)
    private List<String> alias;

    @PersistentAttribute(name = "apellido_materno")
    private String apellido_materno;

    @PersistentAttribute(name = "apellido_paterno")
    private String apellido_paterno;

    @PersistentAttribute(name = "nacimiento_departamento")
    private String nacimiento_departamento;

    @PersistentAttribute(name = "nacimiento_distrito")
    private String nacimiento_distrito;

    @PersistentAttribute(name = "emails")
    private String emails;

    @PersistentAttribute(name = "estado")
    private String estado;

    @PersistentAttribute(name = "estado_civil")
    private String estado_civil;

    @PersistentAttribute(name = "fullname")
    private String fullname;

    @PersistentAttribute(name = "genero")
    private String genero;

    @PersistentAttribute(name = "nombres")
    private String nombres;

    @PersistentAttribute(name = "nacimiento_pais")
    private String nacimiento_pais;

    @PersistentAttribute(name = "profesiones")
    @ElementCollection(targetClass = String.class)
    private List<String> profesiones;

    @PersistentAttribute(name = "nacimiento_provincia")
    private String nacimiento_provincia;

    @PersistentAttribute(name = "razon_social")
    private String razon_social;

    @PersistentAttribute(name = "tipo_persona")
    private String tipo_persona;

    @PersistentAttribute(name = "object_name")
    private String object_name;

    @PersistentAttribute(name = "subject")
    private String subject;

    @PersistentAttribute(name = "title")
    private String title;

    @FolderId
    private String folder_id;

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

    public List<String> getAlias(){
        return alias;
    }

    public void setAlias(List<String> alias){
        this.alias = alias;
    }

    public String getApellido_materno(){
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno){
        this.apellido_materno = apellido_materno;
    }

    public String getApellido_paterno(){
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno){
        this.apellido_paterno = apellido_paterno;
    }

    public String getNacimiento_departamento(){
        return nacimiento_departamento;
    }

    public void setNacimiento_departamento(String nacimiento_departamento){
        this.nacimiento_departamento = nacimiento_departamento;
    }

    public String getNacimiento_distrito(){
        return nacimiento_distrito;
    }

    public void setNacimiento_distrito(String nacimiento_distrito){
        this.nacimiento_distrito = nacimiento_distrito;
    }

    public String getEmails(){
        return emails;
    }

    public void setEmails(String emails){
        this.emails = emails;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getEstado_civil(){
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil){
        this.estado_civil = estado_civil;
    }

    public String getFullname(){
        return fullname;
    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getNombres(){
        return nombres;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public String getNacimiento_pais(){
        return nacimiento_pais;
    }

    public void setNacimiento_pais(String nacimiento_pais){
        this.nacimiento_pais = nacimiento_pais;
    }

    public List<String> getProfesiones(){
        return profesiones;
    }

    public void setProfesiones(List<String> profesiones){
        this.profesiones = profesiones;
    }

    public String getNacimiento_provincia(){
        return nacimiento_provincia;
    }

    public void setNacimiento_provincia(String nacimiento_provincia){
        this.nacimiento_provincia = nacimiento_provincia;
    }

    public String getRazon_social(){
        return razon_social;
    }

    public void setRazon_social(String razon_social){
        this.razon_social = razon_social;
    }

    public String getTipo_persona(){
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona){
        this.tipo_persona = tipo_persona;
    }

    public String getObject_name(){
        return object_name;
    }

    public void setObject_name(String object_name){
        this.object_name = object_name;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getFolder_id(){
        return folder_id;
    }

    public void setFolder_id(String folder_id){
        this.folder_id = folder_id;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}