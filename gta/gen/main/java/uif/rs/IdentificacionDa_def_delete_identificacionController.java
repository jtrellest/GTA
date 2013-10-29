package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.IdentificacionDa_def_delete_identificacionInput;


@Controller(value = "uif.rs.IdentificacionDa_def_delete_identificacionController")
@RequestMapping(value = "/application/uif_identificacions/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_identificacion")
public class IdentificacionDa_def_delete_identificacionController extends AbstractObjectDeleteController<IdentificacionDa_def_delete_identificacionInput> {
    public IdentificacionDa_def_delete_identificacionController() {
        super(IdentificacionDa_def_delete_identificacionInput.class);
    }
}