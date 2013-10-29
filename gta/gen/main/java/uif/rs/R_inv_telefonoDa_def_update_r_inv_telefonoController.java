package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_telefonoDa_def_update_r_inv_telefonoInput;


@Controller(value = "uif.rs.R_inv_telefonoDa_def_update_r_inv_telefonoController")
@RequestMapping(value = "/application/relationships/uif_r_inv_telefonos/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_telefono")
public class R_inv_telefonoDa_def_update_r_inv_telefonoController extends AbstractObjectUpdateController<R_inv_telefonoDa_def_update_r_inv_telefonoInput> {
    public R_inv_telefonoDa_def_update_r_inv_telefonoController() {
        super(R_inv_telefonoDa_def_update_r_inv_telefonoInput.class);
    }
}