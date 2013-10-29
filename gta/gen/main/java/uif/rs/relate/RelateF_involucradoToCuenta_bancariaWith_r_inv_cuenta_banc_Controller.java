package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaSourceRelation;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaToF_involucradoAssociation;
import uif.domain.r_inv_cuenta_banc.F_involucradoTargetRelation;
import uif.domain.r_inv_cuenta_banc.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToCuenta_bancariaWith_r_inv_cuenta_banc_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/cuenta_bancarias", method = RequestMethod.POST, params = "type=r_inv_cuenta_banc")
public class RelateF_involucradoToCuenta_bancariaWith_r_inv_cuenta_banc_Controller extends AbstractRelationshipCreateController<F_involucradoTargetRelation,Cuenta_bancariaSourceRelation,Cuenta_bancariaToF_involucradoAssociation,RelationshipInput> {
    public RelateF_involucradoToCuenta_bancariaWith_r_inv_cuenta_banc_Controller() {
        super(F_involucradoTargetRelation.class,Cuenta_bancariaSourceRelation.class,Cuenta_bancariaToF_involucradoAssociation.class);
    }
}