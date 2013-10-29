package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.DireccionDa_def_delete_direccionInput;


@Controller(value = "uif.rs.DireccionDa_def_delete_direccionController")
@RequestMapping(value = "/application/uif_direccions/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_direccion")
public class DireccionDa_def_delete_direccionController extends AbstractObjectDeleteController<DireccionDa_def_delete_direccionInput> {
    public DireccionDa_def_delete_direccionController() {
        super(DireccionDa_def_delete_direccionInput.class);
    }
}