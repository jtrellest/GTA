package uif.rs;

import com.emc.xcp.services.content.rs.AbstractDeleteOperationController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.InvolucradoDa_def_delete_involucradoInput;


@Controller(value = "uif.rs.InvolucradoDa_def_delete_involucradoController")
@RequestMapping(value = "/application/uif_involucrados/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_involucrado")
public class InvolucradoDa_def_delete_involucradoController extends AbstractDeleteOperationController<InvolucradoDa_def_delete_involucradoInput> {
    public InvolucradoDa_def_delete_involucradoController() {
        super(InvolucradoDa_def_delete_involucradoInput.class);
    }
}