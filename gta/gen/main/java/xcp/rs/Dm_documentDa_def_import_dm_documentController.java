package xcp.rs;

import com.emc.xcp.services.content.rs.AbstractImportOperationController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.Dm_documentDa_def_import_dm_documentInput;


@Controller(value = "xcp.rs.Dm_documentDa_def_import_dm_documentController")
@RequestMapping(value = "/application/xcp_dm_documents", method = RequestMethod.POST, params = "type=xcp_da_def_import_dm_document")
public class Dm_documentDa_def_import_dm_documentController extends AbstractImportOperationController<Dm_documentDa_def_import_dm_documentInput> {
    public Dm_documentDa_def_import_dm_documentController() {
        super(Dm_documentDa_def_import_dm_documentInput.class);
    }
}