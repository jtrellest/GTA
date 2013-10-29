package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.RootBODa_def_selector_rootboInput;


@Controller(value = "xcp.rs.RootBODa_def_selector_rootboController")
@RequestMapping(value = "/application/xcp_RootBOs/{id}", method = RequestMethod.DELETE, params = "type=xcp_da_def_selector_rootbo")
public class RootBODa_def_selector_rootboController extends AbstractObjectUpdateController<RootBODa_def_selector_rootboInput> {
    public RootBODa_def_selector_rootboController() {
        super(RootBODa_def_selector_rootboInput.class);
    }
}