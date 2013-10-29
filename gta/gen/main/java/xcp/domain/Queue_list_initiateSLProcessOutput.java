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
@Linked(template = "/application/processes/xcp_queue_list_initiate")
@JsonPropertyOrder(alphabetic = true)
public class Queue_list_initiateSLProcessOutput {

    @ProcessVariable(variableName = "queueList")
    private String queuelist;

    public String getQueuelist(){
        return queuelist;
    }

    public void setQueuelist(String queuelist){
        this.queuelist = queuelist;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}