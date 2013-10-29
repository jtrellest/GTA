package xcp.domain;

import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.domain.LinkSource;
import com.emc.xcp.services.process.annotation.ProcessVariable;
import java.util.Date;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(superType = "", type = "dm_workflow")
@Linked(template = "/application/processes/xcp_taskhistory_initiate")
@JsonPropertyOrder(alphabetic = true)
public class Taskhistory_initiateSLProcessOutput {

    @ProcessVariable(variableName = "activity_name")
    private String activity_name;

    @ProcessVariable(variableName = "date")
    private Date date;

    @ProcessVariable(variableName = "performer")
    private String performer;

    @ProcessVariable(variableName = "status")
    private Integer status;

    public String getActivity_name(){
        return activity_name;
    }

    public void setActivity_name(String activity_name){
        this.activity_name = activity_name;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getPerformer(){
        return performer;
    }

    public void setPerformer(String performer){
        this.performer = performer;
    }

    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}