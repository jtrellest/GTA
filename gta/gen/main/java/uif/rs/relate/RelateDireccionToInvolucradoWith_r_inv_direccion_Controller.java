package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_direccion.DireccionSourceRelation;
import uif.domain.r_inv_direccion.DireccionToInvolucradoAssociation;
import uif.domain.r_inv_direccion.InvolucradoTargetRelation;
import uif.domain.r_inv_direccion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateDireccionToInvolucradoWith_r_inv_direccion_Controller")
@RequestMapping(value = "/application/uif_direccions/{id}/involucrados", method = RequestMethod.POST, params = "type=r_inv_direccion")
public class RelateDireccionToInvolucradoWith_r_inv_direccion_Controller extends AbstractRelationshipCreateController<DireccionSourceRelation,InvolucradoTargetRelation,DireccionToInvolucradoAssociation,RelationshipInput> {
    public RelateDireccionToInvolucradoWith_r_inv_direccion_Controller() {
        super(DireccionSourceRelation.class,InvolucradoTargetRelation.class,DireccionToInvolucradoAssociation.class);
    }
}