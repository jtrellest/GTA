package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xcp.domain.Dm_document;


@Controller(value = "xcp.rs.Dm_documentTemplateController")
@RequestMapping(value = "/application/xcp_dm_documents/template")
public class Dm_documentTemplateController extends AbstractObjectTemplateController<Dm_document> {
    public Dm_documentTemplateController() {
        super(Dm_document.class);
    }
}