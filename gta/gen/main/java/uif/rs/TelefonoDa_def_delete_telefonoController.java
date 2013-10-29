package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.TelefonoDa_def_delete_telefonoInput;


@Controller(value = "uif.rs.TelefonoDa_def_delete_telefonoController")
@RequestMapping(value = "/application/uif_telefonos/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_telefono")
public class TelefonoDa_def_delete_telefonoController extends AbstractObjectDeleteController<TelefonoDa_def_delete_telefonoInput> {
    public TelefonoDa_def_delete_telefonoController() {
        super(TelefonoDa_def_delete_telefonoInput.class);
    }
}