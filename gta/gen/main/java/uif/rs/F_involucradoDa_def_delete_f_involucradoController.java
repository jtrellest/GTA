package uif.rs;

import com.emc.xcp.services.content.rs.AbstractDeleteOperationController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.F_involucradoDa_def_delete_f_involucradoInput;


@Controller(value = "uif.rs.F_involucradoDa_def_delete_f_involucradoController")
@RequestMapping(value = "/application/uif_f_involucrados/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_f_involucrado")
public class F_involucradoDa_def_delete_f_involucradoController extends AbstractDeleteOperationController<F_involucradoDa_def_delete_f_involucradoInput> {
    public F_involucradoDa_def_delete_f_involucradoController() {
        super(F_involucradoDa_def_delete_f_involucradoInput.class);
    }
}