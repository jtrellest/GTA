package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Involucrado;


@Controller(value = "uif.rs.InvolucradoController")
@RequestMapping(value = "/application/uif_involucrados/{id}")
public class InvolucradoController extends AbstractObjectController<Involucrado> {
    public InvolucradoController() {
        super(Involucrado.class);
    }
}