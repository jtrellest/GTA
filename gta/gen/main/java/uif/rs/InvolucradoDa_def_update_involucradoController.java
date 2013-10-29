package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.InvolucradoDa_def_update_involucradoInput;


@Controller(value = "uif.rs.InvolucradoDa_def_update_involucradoController")
@RequestMapping(value = "/application/uif_involucrados/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_involucrado")
public class InvolucradoDa_def_update_involucradoController extends AbstractObjectUpdateController<InvolucradoDa_def_update_involucradoInput> {
    public InvolucradoDa_def_update_involucradoController() {
        super(InvolucradoDa_def_update_involucradoInput.class);
    }
}