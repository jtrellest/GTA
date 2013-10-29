package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Cuenta_bancariaDa_def_delete_cuenta_bancariaInput;


@Controller(value = "uif.rs.Cuenta_bancariaDa_def_delete_cuenta_bancariaController")
@RequestMapping(value = "/application/uif_cuenta_bancarias/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_cuenta_bancaria")
public class Cuenta_bancariaDa_def_delete_cuenta_bancariaController extends AbstractObjectDeleteController<Cuenta_bancariaDa_def_delete_cuenta_bancariaInput> {
    public Cuenta_bancariaDa_def_delete_cuenta_bancariaController() {
        super(Cuenta_bancariaDa_def_delete_cuenta_bancariaInput.class);
    }
}