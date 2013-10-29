package uif.rs;

import com.emc.xcp.services.content.rs.AbstractFolderController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.CarpetaDa_def_create_carpetaInput;


@Controller(value = "uif.rs.CarpetaDa_def_create_carpetaController")
@RequestMapping(value = "/application/uif_carpetas", method = RequestMethod.POST, params = "type=uif_da_def_create_carpeta")
public class CarpetaDa_def_create_carpetaController extends AbstractFolderController<CarpetaDa_def_create_carpetaInput> {
    public CarpetaDa_def_create_carpetaController() {
        super(CarpetaDa_def_create_carpetaInput.class);
    }
}