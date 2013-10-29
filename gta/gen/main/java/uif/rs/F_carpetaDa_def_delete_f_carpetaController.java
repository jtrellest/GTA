package uif.rs;

import com.emc.xcp.services.content.rs.AbstractDeleteOperationController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.F_carpetaDa_def_delete_f_carpetaInput;


@Controller(value = "uif.rs.F_carpetaDa_def_delete_f_carpetaController")
@RequestMapping(value = "/application/uif_f_carpetas/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_f_carpeta")
public class F_carpetaDa_def_delete_f_carpetaController extends AbstractDeleteOperationController<F_carpetaDa_def_delete_f_carpetaInput> {
    public F_carpetaDa_def_delete_f_carpetaController() {
        super(F_carpetaDa_def_delete_f_carpetaInput.class);
    }
}