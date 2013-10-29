package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Carpeta;


@Controller(value = "uif.rs.CarpetaTemplateController")
@RequestMapping(value = "/application/uif_carpetas/template")
public class CarpetaTemplateController extends AbstractObjectTemplateController<Carpeta> {
    public CarpetaTemplateController() {
        super(Carpeta.class);
    }
}