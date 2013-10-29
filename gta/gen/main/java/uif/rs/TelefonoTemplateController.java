package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Telefono;


@Controller(value = "uif.rs.TelefonoTemplateController")
@RequestMapping(value = "/application/uif_telefonos/template")
public class TelefonoTemplateController extends AbstractObjectTemplateController<Telefono> {
    public TelefonoTemplateController() {
        super(Telefono.class);
    }
}