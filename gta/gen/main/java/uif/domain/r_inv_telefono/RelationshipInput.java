package uif.domain.r_inv_telefono;

import java.util.List;


public class RelationshipInput {

    private String targetId;

    private List<String> effectivePermissions;

    public String getTargetId(){
        return targetId;
    }

    public void setTargetId(String targetId){
        this.targetId = targetId;
    }

    public List<String> getEffectivePermissions(){
        return effectivePermissions;
    }

    public void setEffectivePermissions(List<String> effectivePermissions){
        this.effectivePermissions = effectivePermissions;
    }

}