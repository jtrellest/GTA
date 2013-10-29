package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_cuenta_bancDa_def_update_r_inv_cuenta_bancInput;


@Controller(value = "uif.rs.R_inv_cuenta_bancDa_def_update_r_inv_cuenta_bancController")
@RequestMapping(value = "/application/relationships/uif_r_inv_cuenta_bancs/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_cuenta_banc")
public class R_inv_cuenta_bancDa_def_update_r_inv_cuenta_bancController extends AbstractObjectUpdateController<R_inv_cuenta_bancDa_def_update_r_inv_cuenta_bancInput> {
    public R_inv_cuenta_bancDa_def_update_r_inv_cuenta_bancController() {
        super(R_inv_cuenta_bancDa_def_update_r_inv_cuenta_bancInput.class);
    }
}