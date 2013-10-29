package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.TelefonoDa_def_update_telefonoInput;


@Controller(value = "uif.rs.TelefonoDa_def_update_telefonoController")
@RequestMapping(value = "/application/uif_telefonos/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_telefono")
public class TelefonoDa_def_update_telefonoController extends AbstractObjectUpdateController<TelefonoDa_def_update_telefonoInput> {
    public TelefonoDa_def_update_telefonoController() {
        super(TelefonoDa_def_update_telefonoInput.class);
    }
}