package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xcp.domain.RootBO;


@Controller(value = "xcp.rs.RootBOTemplateController")
@RequestMapping(value = "/application/xcp_RootBOs/template")
public class RootBOTemplateController extends AbstractObjectTemplateController<RootBO> {
    public RootBOTemplateController() {
        super(RootBO.class);
    }
}