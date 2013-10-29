package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.IdentificacionDa_def_update_identificacionInput;


@Controller(value = "uif.rs.IdentificacionDa_def_update_identificacionController")
@RequestMapping(value = "/application/uif_identificacions/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_identificacion")
public class IdentificacionDa_def_update_identificacionController extends AbstractObjectUpdateController<IdentificacionDa_def_update_identificacionInput> {
    public IdentificacionDa_def_update_identificacionController() {
        super(IdentificacionDa_def_update_identificacionInput.class);
    }
}