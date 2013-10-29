package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Identificacion;


@Controller(value = "uif.rs.IdentificacionTemplateController")
@RequestMapping(value = "/application/uif_identificacions/template")
public class IdentificacionTemplateController extends AbstractObjectTemplateController<Identificacion> {
    public IdentificacionTemplateController() {
        super(Identificacion.class);
    }
}