package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.CarpetaDa_def_update_carpetaInput;


@Controller(value = "uif.rs.CarpetaDa_def_update_carpetaInputController")
@RequestMapping(value = "/application/uif_carpetas/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_carpeta")
public class CarpetaDa_def_update_carpetaInputController extends AbstractObjectController<CarpetaDa_def_update_carpetaInput> {
    public CarpetaDa_def_update_carpetaInputController() {
        super(CarpetaDa_def_update_carpetaInput.class);
    }
}