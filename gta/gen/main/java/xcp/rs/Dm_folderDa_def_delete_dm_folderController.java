package xcp.rs;

import com.emc.xcp.services.content.rs.AbstractDeleteOperationController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.Dm_folderDa_def_delete_dm_folderInput;


@Controller(value = "xcp.rs.Dm_folderDa_def_delete_dm_folderController")
@RequestMapping(value = "/application/xcp_dm_folders/{id}", method = RequestMethod.DELETE, params = "type=xcp_da_def_delete_dm_folder")
public class Dm_folderDa_def_delete_dm_folderController extends AbstractDeleteOperationController<Dm_folderDa_def_delete_dm_folderInput> {
    public Dm_folderDa_def_delete_dm_folderController() {
        super(Dm_folderDa_def_delete_dm_folderInput.class);
    }
}