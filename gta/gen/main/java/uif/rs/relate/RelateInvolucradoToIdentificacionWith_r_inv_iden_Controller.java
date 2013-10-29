package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_iden.IdentificacionSourceRelation;
import uif.domain.r_inv_iden.IdentificacionToInvolucradoAssociation;
import uif.domain.r_inv_iden.InvolucradoTargetRelation;
import uif.domain.r_inv_iden.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateInvolucradoToIdentificacionWith_r_inv_iden_Controller")
@RequestMapping(value = "/application/uif_involucrados/{id}/identificacions", method = RequestMethod.POST, params = "type=r_inv_iden")
public class RelateInvolucradoToIdentificacionWith_r_inv_iden_Controller extends AbstractRelationshipCreateController<InvolucradoTargetRelation,IdentificacionSourceRelation,IdentificacionToInvolucradoAssociation,RelationshipInput> {
    public RelateInvolucradoToIdentificacionWith_r_inv_iden_Controller() {
        super(InvolucradoTargetRelation.class,IdentificacionSourceRelation.class,IdentificacionToInvolucradoAssociation.class);
    }
}