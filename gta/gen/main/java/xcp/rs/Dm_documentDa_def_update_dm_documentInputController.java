package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.Dm_documentDa_def_update_dm_documentInput;


@Controller(value = "xcp.rs.Dm_documentDa_def_update_dm_documentInputController")
@RequestMapping(value = "/application/xcp_dm_documents/{id}", method = RequestMethod.GET, params = "type=xcp_da_def_update_dm_document")
public class Dm_documentDa_def_update_dm_documentInputController extends AbstractObjectController<Dm_documentDa_def_update_dm_documentInput> {
    public Dm_documentDa_def_update_dm_documentInputController() {
        super(Dm_documentDa_def_update_dm_documentInput.class);
    }
}