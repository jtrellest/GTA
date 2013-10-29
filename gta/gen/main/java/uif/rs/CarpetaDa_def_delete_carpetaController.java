package uif.rs;

import com.emc.xcp.services.content.rs.AbstractDeleteOperationController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.CarpetaDa_def_delete_carpetaInput;


@Controller(value = "uif.rs.CarpetaDa_def_delete_carpetaController")
@RequestMapping(value = "/application/uif_carpetas/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_carpeta")
public class CarpetaDa_def_delete_carpetaController extends AbstractDeleteOperationController<CarpetaDa_def_delete_carpetaInput> {
    public CarpetaDa_def_delete_carpetaController() {
        super(CarpetaDa_def_delete_carpetaInput.class);
    }
}