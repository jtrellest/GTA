package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.RootBODa_def_update_rootboInput;


@Controller(value = "xcp.rs.RootBODa_def_update_rootboInputController")
@RequestMapping(value = "/application/xcp_RootBOs/{id}", method = RequestMethod.GET, params = "type=xcp_da_def_update_rootbo")
public class RootBODa_def_update_rootboInputController extends AbstractObjectController<RootBODa_def_update_rootboInput> {
    public RootBODa_def_update_rootboInputController() {
        super(RootBODa_def_update_rootboInput.class);
    }
}