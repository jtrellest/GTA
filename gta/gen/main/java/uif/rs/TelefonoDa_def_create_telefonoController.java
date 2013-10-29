package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.TelefonoDa_def_create_telefonoInput;


@Controller(value = "uif.rs.TelefonoDa_def_create_telefonoController")
@RequestMapping(value = "/application/uif_telefonos", method = RequestMethod.POST, params = "type=uif_da_def_create_telefono")
public class TelefonoDa_def_create_telefonoController extends AbstractObjectCreateController<TelefonoDa_def_create_telefonoInput> {
    public TelefonoDa_def_create_telefonoController() {
        super(TelefonoDa_def_create_telefonoInput.class);
    }
}