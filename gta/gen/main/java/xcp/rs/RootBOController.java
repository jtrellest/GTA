package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xcp.domain.RootBO;


@Controller(value = "xcp.rs.RootBOController")
@RequestMapping(value = "/application/xcp_RootBOs/{id}")
public class RootBOController extends AbstractObjectController<RootBO> {
    public RootBOController() {
        super(RootBO.class);
    }
}