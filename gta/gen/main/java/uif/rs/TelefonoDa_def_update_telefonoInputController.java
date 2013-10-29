package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.TelefonoDa_def_update_telefonoInput;


@Controller(value = "uif.rs.TelefonoDa_def_update_telefonoInputController")
@RequestMapping(value = "/application/uif_telefonos/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_telefono")
public class TelefonoDa_def_update_telefonoInputController extends AbstractObjectController<TelefonoDa_def_update_telefonoInput> {
    public TelefonoDa_def_update_telefonoInputController() {
        super(TelefonoDa_def_update_telefonoInput.class);
    }
}