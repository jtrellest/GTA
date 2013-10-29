package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.RootBODa_def_create_rootboInput;


@Controller(value = "xcp.rs.RootBODa_def_create_rootboController")
@RequestMapping(value = "/application/xcp_RootBOs", method = RequestMethod.POST, params = "type=xcp_da_def_create_rootbo")
public class RootBODa_def_create_rootboController extends AbstractObjectCreateController<RootBODa_def_create_rootboInput> {
    public RootBODa_def_create_rootboController() {
        super(RootBODa_def_create_rootboInput.class);
    }
}