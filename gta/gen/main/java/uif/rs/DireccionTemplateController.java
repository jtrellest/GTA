package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Direccion;


@Controller(value = "uif.rs.DireccionTemplateController")
@RequestMapping(value = "/application/uif_direccions/template")
public class DireccionTemplateController extends AbstractObjectTemplateController<Direccion> {
    public DireccionTemplateController() {
        super(Direccion.class);
    }
}