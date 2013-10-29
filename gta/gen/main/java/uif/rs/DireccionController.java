package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Direccion;


@Controller(value = "uif.rs.DireccionController")
@RequestMapping(value = "/application/uif_direccions/{id}")
public class DireccionController extends AbstractObjectController<Direccion> {
    public DireccionController() {
        super(Direccion.class);
    }
}