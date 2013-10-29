package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.TelefonoDeleteInput;


@Controller(value = "uif.rs.TelefonoDeleteController")
@RequestMapping(value = "/application/uif_telefonos/{id}", method = RequestMethod.DELETE)
public class TelefonoDeleteController extends AbstractObjectDeleteController<TelefonoDeleteInput> {
    public TelefonoDeleteController() {
        super(TelefonoDeleteInput.class);
    }
}