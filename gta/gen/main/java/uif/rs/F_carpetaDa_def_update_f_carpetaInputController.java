package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.F_carpetaDa_def_update_f_carpetaInput;


@Controller(value = "uif.rs.F_carpetaDa_def_update_f_carpetaInputController")
@RequestMapping(value = "/application/uif_f_carpetas/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_f_carpeta")
public class F_carpetaDa_def_update_f_carpetaInputController extends AbstractObjectController<F_carpetaDa_def_update_f_carpetaInput> {
    public F_carpetaDa_def_update_f_carpetaInputController() {
        super(F_carpetaDa_def_update_f_carpetaInput.class);
    }
}