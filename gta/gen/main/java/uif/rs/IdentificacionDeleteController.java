package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.IdentificacionDeleteInput;


@Controller(value = "uif.rs.IdentificacionDeleteController")
@RequestMapping(value = "/application/uif_identificacions/{id}", method = RequestMethod.DELETE)
public class IdentificacionDeleteController extends AbstractObjectDeleteController<IdentificacionDeleteInput> {
    public IdentificacionDeleteController() {
        super(IdentificacionDeleteInput.class);
    }
}