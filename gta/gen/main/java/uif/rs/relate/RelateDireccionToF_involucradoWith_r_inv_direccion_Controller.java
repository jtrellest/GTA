package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_direccion.DireccionSourceRelation;
import uif.domain.r_inv_direccion.DireccionToF_involucradoAssociation;
import uif.domain.r_inv_direccion.F_involucradoTargetRelation;
import uif.domain.r_inv_direccion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateDireccionToF_involucradoWith_r_inv_direccion_Controller")
@RequestMapping(value = "/application/uif_direccions/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_direccion")
public class RelateDireccionToF_involucradoWith_r_inv_direccion_Controller extends AbstractRelationshipCreateController<DireccionSourceRelation,F_involucradoTargetRelation,DireccionToF_involucradoAssociation,RelationshipInput> {
    public RelateDireccionToF_involucradoWith_r_inv_direccion_Controller() {
        super(DireccionSourceRelation.class,F_involucradoTargetRelation.class,DireccionToF_involucradoAssociation.class);
    }
}