package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Identificacion;


@Controller(value = "uif.rs.IdentificacionController")
@RequestMapping(value = "/application/uif_identificacions/{id}")
public class IdentificacionController extends AbstractObjectController<Identificacion> {
    public IdentificacionController() {
        super(Identificacion.class);
    }
}