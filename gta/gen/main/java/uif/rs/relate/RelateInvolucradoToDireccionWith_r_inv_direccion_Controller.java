package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_direccion.DireccionSourceRelation;
import uif.domain.r_inv_direccion.DireccionToInvolucradoAssociation;
import uif.domain.r_inv_direccion.InvolucradoTargetRelation;
import uif.domain.r_inv_direccion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateInvolucradoToDireccionWith_r_inv_direccion_Controller")
@RequestMapping(value = "/application/uif_involucrados/{id}/direccions", method = RequestMethod.POST, params = "type=r_inv_direccion")
public class RelateInvolucradoToDireccionWith_r_inv_direccion_Controller extends AbstractRelationshipCreateController<InvolucradoTargetRelation,DireccionSourceRelation,DireccionToInvolucradoAssociation,RelationshipInput> {
    public RelateInvolucradoToDireccionWith_r_inv_direccion_Controller() {
        super(InvolucradoTargetRelation.class,DireccionSourceRelation.class,DireccionToInvolucradoAssociation.class);
    }
}