package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.RootBODa_def_delete_rootboInput;


@Controller(value = "xcp.rs.RootBODa_def_delete_rootboController")
@RequestMapping(value = "/application/xcp_RootBOs/{id}", method = RequestMethod.DELETE, params = "type=xcp_da_def_delete_rootbo")
public class RootBODa_def_delete_rootboController extends AbstractObjectDeleteController<RootBODa_def_delete_rootboInput> {
    public RootBODa_def_delete_rootboController() {
        super(RootBODa_def_delete_rootboInput.class);
    }
}