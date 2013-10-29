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
public class Activity_list_initiateSLProcessOutput {

    @ProcessVariable(variableName = "output_activity_names")
    private String output_activity_names;

    public String getOutput_activity_names(){
        return output_activity_names;
    }

    public void setOutput_activity_names(String output_activity_names){
        this.output_activity_names = output_activity_names;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}