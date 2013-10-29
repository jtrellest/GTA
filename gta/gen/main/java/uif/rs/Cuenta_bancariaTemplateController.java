package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Cuenta_bancaria;


@Controller(value = "uif.rs.Cuenta_bancariaTemplateController")
@RequestMapping(value = "/application/uif_cuenta_bancarias/template")
public class Cuenta_bancariaTemplateController extends AbstractObjectTemplateController<Cuenta_bancaria> {
    public Cuenta_bancariaTemplateController() {
        super(Cuenta_bancaria.class);
    }
}