package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaSourceRelation;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaToF_involucradoAssociation;
import uif.domain.r_inv_cuenta_banc.F_involucradoTargetRelation;
import uif.domain.r_inv_cuenta_banc.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateCuenta_bancariaToF_involucradoWith_r_inv_cuenta_banc_Controller")
@RequestMapping(value = "/application/uif_cuenta_bancarias/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_cuenta_banc")
public class RelateCuenta_bancariaToF_involucradoWith_r_inv_cuenta_banc_Controller extends AbstractRelationshipCreateController<Cuenta_bancariaSourceRelation,F_involucradoTargetRelation,Cuenta_bancariaToF_involucradoAssociation,RelationshipInput> {
    public RelateCuenta_bancariaToF_involucradoWith_r_inv_cuenta_banc_Controller() {
        super(Cuenta_bancariaSourceRelation.class,F_involucradoTargetRelation.class,Cuenta_bancariaToF_involucradoAssociation.class);
    }
}