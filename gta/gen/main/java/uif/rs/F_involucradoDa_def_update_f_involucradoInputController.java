package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.F_involucradoDa_def_update_f_involucradoInput;


@Controller(value = "uif.rs.F_involucradoDa_def_update_f_involucradoInputController")
@RequestMapping(value = "/application/uif_f_involucrados/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_f_involucrado")
public class F_involucradoDa_def_update_f_involucradoInputController extends AbstractObjectController<F_involucradoDa_def_update_f_involucradoInput> {
    public F_involucradoDa_def_update_f_involucradoInputController() {
        super(F_involucradoDa_def_update_f_involucradoInput.class);
    }
}