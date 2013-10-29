package xcp.rs;

import com.emc.xcp.services.process.rs.AbstractProcessDataSourceControllerMultiObjects;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.Queue_list_initiateSLProcessInput;
import xcp.domain.Queue_list_initiateSLProcessOutput;


@Controller(value = "xcp.rs.InitSLQueue_list_initiateCreateCtroller")
@RequestMapping(value = "/application/processes/xcp_queue_list_initiate", method = RequestMethod.GET)
public class InitSLQueue_list_initiateCreateCtroller extends AbstractProcessDataSourceControllerMultiObjects<Queue_list_initiateSLProcessInput,Queue_list_initiateSLProcessOutput> {
    public InitSLQueue_list_initiateCreateCtroller() {
        super("urn:xcp:com.emc.ide.artifact.process:Artifacts/Processes/queue_list.process", Queue_list_initiateSLProcessInput.class,Queue_list_initiateSLProcessOutput.class);
    }
}