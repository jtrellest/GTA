package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Cuenta_bancariaDa_def_create_cuenta_bancariaInput;


@Controller(value = "uif.rs.Cuenta_bancariaDa_def_create_cuenta_bancariaController")
@RequestMapping(value = "/application/uif_cuenta_bancarias", method = RequestMethod.POST, params = "type=uif_da_def_create_cuenta_bancaria")
public class Cuenta_bancariaDa_def_create_cuenta_bancariaController extends AbstractObjectCreateController<Cuenta_bancariaDa_def_create_cuenta_bancariaInput> {
    public Cuenta_bancariaDa_def_create_cuenta_bancariaController() {
        super(Cuenta_bancariaDa_def_create_cuenta_bancariaInput.class);
    }
}