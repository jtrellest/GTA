package xcp.rs;

import com.emc.xcp.services.process.rs.AbstractProcessDataSourceControllerMultiObjects;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.User_from_queue_initiateSLProcessInput;
import xcp.domain.User_from_queue_initiateSLProcessOutput;


@Controller(value = "xcp.rs.InitSLUser_from_queue_initiateCreateCtroller")
@RequestMapping(value = "/application/processes/xcp_user_from_queue_initiate", method = RequestMethod.GET)
public class InitSLUser_from_queue_initiateCreateCtroller extends AbstractProcessDataSourceControllerMultiObjects<User_from_queue_initiateSLProcessInput,User_from_queue_initiateSLProcessOutput> {
    public InitSLUser_from_queue_initiateCreateCtroller() {
        super("urn:xcp:com.emc.ide.artifact.process:Artifacts/Processes/user_from_queue.process", User_from_queue_initiateSLProcessInput.class,User_from_queue_initiateSLProcessOutput.class);
    }
}