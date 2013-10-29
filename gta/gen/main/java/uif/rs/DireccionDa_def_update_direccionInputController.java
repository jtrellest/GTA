package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.DireccionDa_def_update_direccionInput;


@Controller(value = "uif.rs.DireccionDa_def_update_direccionInputController")
@RequestMapping(value = "/application/uif_direccions/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_direccion")
public class DireccionDa_def_update_direccionInputController extends AbstractObjectController<DireccionDa_def_update_direccionInput> {
    public DireccionDa_def_update_direccionInputController() {
        super(DireccionDa_def_update_direccionInput.class);
    }
}