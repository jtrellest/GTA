package uif.domain.r_inv_cuenta_banc;

import com.emc.xcp.persistence.annotation.CustomAttribute;
import com.emc.xcp.persistence.annotation.PersistentAttribute;
import com.emc.xcp.persistence.annotation.PersistentId;
import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.persistence.annotation.PersistentTypedRelationship;
import com.emc.xcp.persistence.annotation.ReferredName;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.rs.json.EntityAsIdSerializer;
import java.util.List;
import javax.persistence.OneToMany;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaToInvolucradoAssociation;


@PersistentObject(superType = "dm_sysobject", type = "uif_involucrado")
@JsonPropertyOrder(alphabetic = true)
@JsonIgnoreProperties(value = {"dirty"})
public class InvolucradoTargetRelation {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @OneToMany
    @PersistentTypedRelationship(type = "uif_r_inv_cuenta_banc")
    @ReferredName("cuenta_bancaria")
    private List<Cuenta_bancariaToInvolucradoAssociation> parentChildAssociation;

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

    @JsonSerialize(using = EntityAsIdSerializer.class)
    public List<Cuenta_bancariaToInvolucradoAssociation> getParentChildAssociation(){
        return parentChildAssociation;
    }

    @JsonIgnore
    public void setParentChildAssociation(List<Cuenta_bancariaToInvolucradoAssociation> parentChildAssociation){
        this.parentChildAssociation = parentChildAssociation;
    }

}