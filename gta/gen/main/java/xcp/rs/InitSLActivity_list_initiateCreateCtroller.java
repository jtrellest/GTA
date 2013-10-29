package xcp.rs;

import com.emc.xcp.services.process.rs.AbstractProcessDataSourceControllerMultiObjects;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.Activity_list_initiateSLProcessInput;
import xcp.domain.Activity_list_initiateSLProcessOutput;


@Controller(value = "xcp.rs.InitSLActivity_list_initiateCreateCtroller")
@RequestMapping(value = "/application/processes/xcp_activity_list_initiate", method = RequestMethod.GET)
public class InitSLActivity_list_initiateCreateCtroller extends AbstractProcessDataSourceControllerMultiObjects<Activity_list_initiateSLProcessInput,Activity_list_initiateSLProcessOutput> {
    public InitSLActivity_list_initiateCreateCtroller() {
        super("urn:xcp:com.emc.ide.artifact.process:Artifacts/Processes/activity_list.process", Activity_list_initiateSLProcessInput.class,Activity_list_initiateSLProcessOutput.class);
    }
}