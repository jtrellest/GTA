package xcp.domain;

import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.domain.LinkSource;
import com.emc.xcp.services.process.annotation.ProcessVariable;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(superType = "", type = "dm_workflow")
@Linked(template = "/application/processes/xcp_taskhistory_initiate")
@JsonPropertyOrder(alphabetic = true)
public class Taskhistory_initiateSLProcessInput {

    @ProcessVariable(variableName = "process_instance_id")
    private String process_instance_id;

    public String getProcess_instance_id(){
        return process_instance_id;
    }

    public void setProcess_instance_id(String process_instance_id){
        this.process_instance_id = process_instance_id;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}