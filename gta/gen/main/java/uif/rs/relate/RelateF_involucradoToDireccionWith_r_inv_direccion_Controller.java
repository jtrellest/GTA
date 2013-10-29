package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_direccion.DireccionSourceRelation;
import uif.domain.r_inv_direccion.DireccionToF_involucradoAssociation;
import uif.domain.r_inv_direccion.F_involucradoTargetRelation;
import uif.domain.r_inv_direccion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToDireccionWith_r_inv_direccion_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/direccions", method = RequestMethod.POST, params = "type=r_inv_direccion")
public class RelateF_involucradoToDireccionWith_r_inv_direccion_Controller extends AbstractRelationshipCreateController<F_involucradoTargetRelation,DireccionSourceRelation,DireccionToF_involucradoAssociation,RelationshipInput> {
    public RelateF_involucradoToDireccionWith_r_inv_direccion_Controller() {
        super(F_involucradoTargetRelation.class,DireccionSourceRelation.class,DireccionToF_involucradoAssociation.class);
    }
}