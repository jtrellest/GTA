package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaToInvolucradoAssociation;


@Controller(value = "uif.rs.R_inv_cuenta_bancDa_def_delete_r_inv_cuenta_bancController")
@RequestMapping(value = "/application/relationships/uif_r_inv_cuenta_bancs/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_cuenta_banc")
public class R_inv_cuenta_bancDa_def_delete_r_inv_cuenta_bancController extends AbstractObjectDeleteController<Cuenta_bancariaToInvolucradoAssociation> {
    public R_inv_cuenta_bancDa_def_delete_r_inv_cuenta_bancController() {
        super(Cuenta_bancariaToInvolucradoAssociation.class);
    }
}