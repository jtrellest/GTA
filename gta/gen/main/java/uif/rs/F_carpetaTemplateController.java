package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.F_carpeta;


@Controller(value = "uif.rs.F_carpetaTemplateController")
@RequestMapping(value = "/application/uif_f_carpetas/template")
public class F_carpetaTemplateController extends AbstractObjectTemplateController<F_carpeta> {
    public F_carpetaTemplateController() {
        super(F_carpeta.class);
    }
}