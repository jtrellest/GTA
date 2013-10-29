package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_direccion.DireccionToInvolucradoAssociation;


@Controller(value = "uif.rs.R_inv_direccionDa_def_delete_r_inv_direccionController")
@RequestMapping(value = "/application/relationships/uif_r_inv_direccions/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_direccion")
public class R_inv_direccionDa_def_delete_r_inv_direccionController extends AbstractObjectDeleteController<DireccionToInvolucradoAssociation> {
    public R_inv_direccionDa_def_delete_r_inv_direccionController() {
        super(DireccionToInvolucradoAssociation.class);
    }
}