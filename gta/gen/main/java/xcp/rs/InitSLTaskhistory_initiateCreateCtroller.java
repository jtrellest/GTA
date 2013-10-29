package xcp.rs;

import com.emc.xcp.services.process.rs.AbstractProcessDataSourceControllerMultiObjects;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.Taskhistory_initiateSLProcessInput;
import xcp.domain.Taskhistory_initiateSLProcessOutput;


@Controller(value = "xcp.rs.InitSLTaskhistory_initiateCreateCtroller")
@RequestMapping(value = "/application/processes/xcp_taskhistory_initiate", method = RequestMethod.GET)
public class InitSLTaskhistory_initiateCreateCtroller extends AbstractProcessDataSourceControllerMultiObjects<Taskhistory_initiateSLProcessInput,Taskhistory_initiateSLProcessOutput> {
    public InitSLTaskhistory_initiateCreateCtroller() {
        super("urn:xcp:com.emc.ide.artifact.process:Artifacts/Processes/taskhistory.process", Taskhistory_initiateSLProcessInput.class,Taskhistory_initiateSLProcessOutput.class);
    }
}