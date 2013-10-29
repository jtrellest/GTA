package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.DireccionDeleteInput;


@Controller(value = "uif.rs.DireccionDeleteController")
@RequestMapping(value = "/application/uif_direccions/{id}", method = RequestMethod.DELETE)
public class DireccionDeleteController extends AbstractObjectDeleteController<DireccionDeleteInput> {
    public DireccionDeleteController() {
        super(DireccionDeleteInput.class);
    }
}