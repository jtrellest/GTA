package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Cuenta_bancariaDeleteInput;


@Controller(value = "uif.rs.Cuenta_bancariaDeleteController")
@RequestMapping(value = "/application/uif_cuenta_bancarias/{id}", method = RequestMethod.DELETE)
public class Cuenta_bancariaDeleteController extends AbstractObjectDeleteController<Cuenta_bancariaDeleteInput> {
    public Cuenta_bancariaDeleteController() {
        super(Cuenta_bancariaDeleteInput.class);
    }
}