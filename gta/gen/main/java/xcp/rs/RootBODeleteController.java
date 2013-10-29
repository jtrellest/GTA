package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.RootBODeleteInput;


@Controller(value = "xcp.rs.RootBODeleteController")
@RequestMapping(value = "/application/xcp_RootBOs/{id}", method = RequestMethod.DELETE)
public class RootBODeleteController extends AbstractObjectDeleteController<RootBODeleteInput> {
    public RootBODeleteController() {
        super(RootBODeleteInput.class);
    }
}