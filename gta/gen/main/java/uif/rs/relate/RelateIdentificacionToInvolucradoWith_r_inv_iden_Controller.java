package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_iden.IdentificacionSourceRelation;
import uif.domain.r_inv_iden.IdentificacionToInvolucradoAssociation;
import uif.domain.r_inv_iden.InvolucradoTargetRelation;
import uif.domain.r_inv_iden.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateIdentificacionToInvolucradoWith_r_inv_iden_Controller")
@RequestMapping(value = "/application/uif_identificacions/{id}/involucrados", method = RequestMethod.POST, params = "type=r_inv_iden")
public class RelateIdentificacionToInvolucradoWith_r_inv_iden_Controller extends AbstractRelationshipCreateController<IdentificacionSourceRelation,InvolucradoTargetRelation,IdentificacionToInvolucradoAssociation,RelationshipInput> {
    public RelateIdentificacionToInvolucradoWith_r_inv_iden_Controller() {
        super(IdentificacionSourceRelation.class,InvolucradoTargetRelation.class,IdentificacionToInvolucradoAssociation.class);
    }
}