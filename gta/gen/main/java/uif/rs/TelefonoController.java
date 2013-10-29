package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Telefono;


@Controller(value = "uif.rs.TelefonoController")
@RequestMapping(value = "/application/uif_telefonos/{id}")
public class TelefonoController extends AbstractObjectController<Telefono> {
    public TelefonoController() {
        super(Telefono.class);
    }
}