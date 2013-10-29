package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.Dm_folderDa_def_update_dm_folderInput;


@Controller(value = "xcp.rs.Dm_folderDa_def_update_dm_folderController")
@RequestMapping(value = "/application/xcp_dm_folders/{id}", method = RequestMethod.PUT, params = "type=xcp_da_def_update_dm_folder")
public class Dm_folderDa_def_update_dm_folderController extends AbstractObjectUpdateController<Dm_folderDa_def_update_dm_folderInput> {
    public Dm_folderDa_def_update_dm_folderController() {
        super(Dm_folderDa_def_update_dm_folderInput.class);
    }
}