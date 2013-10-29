package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.F_carpeta;


@Controller(value = "uif.rs.F_carpetaController")
@RequestMapping(value = "/application/uif_f_carpetas/{id}")
public class F_carpetaController extends AbstractObjectController<F_carpeta> {
    public F_carpetaController() {
        super(F_carpeta.class);
    }
}