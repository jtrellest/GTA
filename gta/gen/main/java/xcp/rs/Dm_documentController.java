package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xcp.domain.Dm_document;


@Controller(value = "xcp.rs.Dm_documentController")
@RequestMapping(value = "/application/xcp_dm_documents/{id}")
public class Dm_documentController extends AbstractObjectController<Dm_document> {
    public Dm_documentController() {
        super(Dm_document.class);
    }
}