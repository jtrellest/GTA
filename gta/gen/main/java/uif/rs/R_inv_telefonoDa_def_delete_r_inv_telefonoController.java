package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_telefono.TelefonoToInvolucradoAssociation;


@Controller(value = "uif.rs.R_inv_telefonoDa_def_delete_r_inv_telefonoController")
@RequestMapping(value = "/application/relationships/uif_r_inv_telefonos/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_telefono")
public class R_inv_telefonoDa_def_delete_r_inv_telefonoController extends AbstractObjectDeleteController<TelefonoToInvolucradoAssociation> {
    public R_inv_telefonoDa_def_delete_r_inv_telefonoController() {
        super(TelefonoToInvolucradoAssociation.class);
    }
}