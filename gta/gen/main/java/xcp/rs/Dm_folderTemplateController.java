package xcp.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xcp.domain.Dm_folder;


@Controller(value = "xcp.rs.Dm_folderTemplateController")
@RequestMapping(value = "/application/xcp_dm_folders/template")
public class Dm_folderTemplateController extends AbstractObjectTemplateController<Dm_folder> {
    public Dm_folderTemplateController() {
        super(Dm_folder.class);
    }
}