package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Cuenta_bancaria;


@Controller(value = "uif.rs.Cuenta_bancariaController")
@RequestMapping(value = "/application/uif_cuenta_bancarias/{id}")
public class Cuenta_bancariaController extends AbstractObjectController<Cuenta_bancaria> {
    public Cuenta_bancariaController() {
        super(Cuenta_bancaria.class);
    }
}