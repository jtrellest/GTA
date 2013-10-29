package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.IdentificacionDa_def_create_identificacionInput;


@Controller(value = "uif.rs.IdentificacionDa_def_create_identificacionController")
@RequestMapping(value = "/application/uif_identificacions", method = RequestMethod.POST, params = "type=uif_da_def_create_identificacion")
public class IdentificacionDa_def_create_identificacionController extends AbstractObjectCreateController<IdentificacionDa_def_create_identificacionInput> {
    public IdentificacionDa_def_create_identificacionController() {
        super(IdentificacionDa_def_create_identificacionInput.class);
    }
}