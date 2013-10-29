package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.DireccionDa_def_create_direccionInput;


@Controller(value = "uif.rs.DireccionDa_def_create_direccionController")
@RequestMapping(value = "/application/uif_direccions", method = RequestMethod.POST, params = "type=uif_da_def_create_direccion")
public class DireccionDa_def_create_direccionController extends AbstractObjectCreateController<DireccionDa_def_create_direccionInput> {
    public DireccionDa_def_create_direccionController() {
        super(DireccionDa_def_create_direccionInput.class);
    }
}