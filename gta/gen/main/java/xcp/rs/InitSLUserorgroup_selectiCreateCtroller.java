package xcp.rs;

import com.emc.xcp.services.process.rs.AbstractProcessDataSourceControllerMultiObjects;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.Userorgroup_selectiSLProcessInput;
import xcp.domain.Userorgroup_selectiSLProcessOutput;


@Controller(value = "xcp.rs.InitSLUserorgroup_selectiCreateCtroller")
@RequestMapping(value = "/application/processes/xcp_userorgroup_selecti", method = RequestMethod.GET)
public class InitSLUserorgroup_selectiCreateCtroller extends AbstractProcessDataSourceControllerMultiObjects<Userorgroup_selectiSLProcessInput,Userorgroup_selectiSLProcessOutput> {
    public InitSLUserorgroup_selectiCreateCtroller() {
        super("urn:xcp:com.emc.ide.artifact.process:Artifacts/Processes/userorgroup_selecti.process", Userorgroup_selectiSLProcessInput.class,Userorgroup_selectiSLProcessOutput.class);
    }
}