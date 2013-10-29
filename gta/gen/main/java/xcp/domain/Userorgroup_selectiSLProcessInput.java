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
@Linked(template = "/application/processes/xcp_userorgroup_selecti")
@JsonPropertyOrder(alphabetic = true)
public class Userorgroup_selectiSLProcessInput {

    @ProcessVariable(variableName = "starts_with_filter")
    private String starts_with_filter;

    public String getStarts_with_filter(){
        return starts_with_filter;
    }

    public void setStarts_with_filter(String starts_with_filter){
        this.starts_with_filter = starts_with_filter;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}