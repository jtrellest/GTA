package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_idenDa_def_update_r_inv_idenInput;


@Controller(value = "uif.rs.R_inv_idenDa_def_update_r_inv_idenController")
@RequestMapping(value = "/application/relationships/uif_r_inv_idens/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_iden")
public class R_inv_idenDa_def_update_r_inv_idenController extends AbstractObjectUpdateController<R_inv_idenDa_def_update_r_inv_idenInput> {
    public R_inv_idenDa_def_update_r_inv_idenController() {
        super(R_inv_idenDa_def_update_r_inv_idenInput.class);
    }
}