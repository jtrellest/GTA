package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Involucrado;


@Controller(value = "uif.rs.InvolucradoTemplateController")
@RequestMapping(value = "/application/uif_involucrados/template")
public class InvolucradoTemplateController extends AbstractObjectTemplateController<Involucrado> {
    public InvolucradoTemplateController() {
        super(Involucrado.class);
    }
}