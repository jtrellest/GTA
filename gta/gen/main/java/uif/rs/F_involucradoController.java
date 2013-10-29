package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.F_involucrado;


@Controller(value = "uif.rs.F_involucradoController")
@RequestMapping(value = "/application/uif_f_involucrados/{id}")
public class F_involucradoController extends AbstractObjectController<F_involucrado> {
    public F_involucradoController() {
        super(F_involucrado.class);
    }
}