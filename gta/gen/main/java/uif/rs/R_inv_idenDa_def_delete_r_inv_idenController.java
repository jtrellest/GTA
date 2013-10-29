package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_iden.IdentificacionToInvolucradoAssociation;


@Controller(value = "uif.rs.R_inv_idenDa_def_delete_r_inv_idenController")
@RequestMapping(value = "/application/relationships/uif_r_inv_idens/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_iden")
public class R_inv_idenDa_def_delete_r_inv_idenController extends AbstractObjectDeleteController<IdentificacionToInvolucradoAssociation> {
    public R_inv_idenDa_def_delete_r_inv_idenController() {
        super(IdentificacionToInvolucradoAssociation.class);
    }
}