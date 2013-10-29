package uif.rs;

import com.emc.xcp.services.content.rs.AbstractFolderController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.InvolucradoDa_def_create_involucradoInput;


@Controller(value = "uif.rs.InvolucradoDa_def_create_involucradoController")
@RequestMapping(value = "/application/uif_involucrados", method = RequestMethod.POST, params = "type=uif_da_def_create_involucrado")
public class InvolucradoDa_def_create_involucradoController extends AbstractFolderController<InvolucradoDa_def_create_involucradoInput> {
    public InvolucradoDa_def_create_involucradoController() {
        super(InvolucradoDa_def_create_involucradoInput.class);
    }
}