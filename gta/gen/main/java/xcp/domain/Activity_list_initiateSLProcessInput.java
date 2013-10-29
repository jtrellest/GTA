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
@Linked(template = "/application/processes/xcp_activity_list_initiate")
@JsonPropertyOrder(alphabetic = true)
public class Activity_list_initiateSLProcessInput {

    @ProcessVariable(variableName = "id")
    private String id;

    @ProcessVariable(variableName = "port_type")
    private String port_type;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPort_type(){
        return port_type;
    }

    public void setPort_type(String port_type){
        this.port_type = port_type;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}