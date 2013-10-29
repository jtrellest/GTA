package xcp.rs;

import com.emc.xcp.services.content.rs.AbstractFolderController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xcp.domain.Dm_folderDa_def_create_dm_folderInput;


@Controller(value = "xcp.rs.Dm_folderDa_def_create_dm_folderController")
@RequestMapping(value = "/application/xcp_dm_folders", method = RequestMethod.POST, params = "type=xcp_da_def_create_dm_folder")
public class Dm_folderDa_def_create_dm_folderController extends AbstractFolderController<Dm_folderDa_def_create_dm_folderInput> {
    public Dm_folderDa_def_create_dm_folderController() {
        super(Dm_folderDa_def_create_dm_folderInput.class);
    }
}