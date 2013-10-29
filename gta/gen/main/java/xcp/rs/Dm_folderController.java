package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xcp.domain.Dm_folder;


@Controller(value = "xcp.rs.Dm_folderController")
@RequestMapping(value = "/application/xcp_dm_folders/{id}")
public class Dm_folderController extends AbstractObjectController<Dm_folder> {
    public Dm_folderController() {
        super(Dm_folder.class);
    }
}