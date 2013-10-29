package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaSourceRelation;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaToInvolucradoAssociation;
import uif.domain.r_inv_cuenta_banc.InvolucradoTargetRelation;
import uif.domain.r_inv_cuenta_banc.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateInvolucradoToCuenta_bancariaWith_r_inv_cuenta_banc_Controller")
@RequestMapping(value = "/application/uif_involucrados/{id}/cuenta_bancarias", method = RequestMethod.POST, params = "type=r_inv_cuenta_banc")
public class RelateInvolucradoToCuenta_bancariaWith_r_inv_cuenta_banc_Controller extends AbstractRelationshipCreateController<InvolucradoTargetRelation,Cuenta_bancariaSourceRelation,Cuenta_bancariaToInvolucradoAssociation,RelationshipInput> {
    public RelateInvolucradoToCuenta_bancariaWith_r_inv_cuenta_banc_Controller() {
        super(InvolucradoTargetRelation.class,Cuenta_bancariaSourceRelation.class,Cuenta_bancariaToInvolucradoAssociation.class);
    }
}