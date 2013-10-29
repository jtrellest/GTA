package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.F_involucrado;


@Controller(value = "uif.rs.F_involucradoTemplateController")
@RequestMapping(value = "/application/uif_f_involucrados/template")
public class F_involucradoTemplateController extends AbstractObjectTemplateController<F_involucrado> {
    public F_involucradoTemplateController() {
        super(F_involucrado.class);
    }
}