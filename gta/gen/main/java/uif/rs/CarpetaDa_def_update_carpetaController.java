package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.CarpetaDa_def_update_carpetaInput;


@Controller(value = "uif.rs.CarpetaDa_def_update_carpetaController")
@RequestMapping(value = "/application/uif_carpetas/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_carpeta")
public class CarpetaDa_def_update_carpetaController extends AbstractObjectUpdateController<CarpetaDa_def_update_carpetaInput> {
    public CarpetaDa_def_update_carpetaController() {
        super(CarpetaDa_def_update_carpetaInput.class);
    }
}