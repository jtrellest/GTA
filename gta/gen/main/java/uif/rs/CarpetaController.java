package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Carpeta;


@Controller(value = "uif.rs.CarpetaController")
@RequestMapping(value = "/application/uif_carpetas/{id}")
public class CarpetaController extends AbstractObjectController<Carpeta> {
    public CarpetaController() {
        super(Carpeta.class);
    }
}