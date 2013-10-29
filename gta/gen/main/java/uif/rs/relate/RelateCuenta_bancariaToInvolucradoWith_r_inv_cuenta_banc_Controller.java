package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaSourceRelation;
import uif.domain.r_inv_cuenta_banc.Cuenta_bancariaToInvolucradoAssociation;
import uif.domain.r_inv_cuenta_banc.InvolucradoTargetRelation;
import uif.domain.r_inv_cuenta_banc.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateCuenta_bancariaToInvolucradoWith_r_inv_cuenta_banc_Controller")
@RequestMapping(value = "/application/uif_cuenta_bancarias/{id}/involucrados", method = RequestMethod.POST, params = "type=r_inv_cuenta_banc")
public class RelateCuenta_bancariaToInvolucradoWith_r_inv_cuenta_banc_Controller extends AbstractRelationshipCreateController<Cuenta_bancariaSourceRelation,InvolucradoTargetRelation,Cuenta_bancariaToInvolucradoAssociation,RelationshipInput> {
    public RelateCuenta_bancariaToInvolucradoWith_r_inv_cuenta_banc_Controller() {
        super(Cuenta_bancariaSourceRelation.class,InvolucradoTargetRelation.class,Cuenta_bancariaToInvolucradoAssociation.class);
    }
}