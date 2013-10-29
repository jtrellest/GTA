package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_direccionDa_def_update_r_inv_direccionInput;


@Controller(value = "uif.rs.R_inv_direccionDa_def_update_r_inv_direccionController")
@RequestMapping(value = "/application/relationships/uif_r_inv_direccions/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_direccion")
public class R_inv_direccionDa_def_update_r_inv_direccionController extends AbstractObjectUpdateController<R_inv_direccionDa_def_update_r_inv_direccionInput> {
    public R_inv_direccionDa_def_update_r_inv_direccionController() {
        super(R_inv_direccionDa_def_update_r_inv_direccionInput.class);
    }
}