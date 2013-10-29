package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_telefono.InvolucradoTargetRelation;
import uif.domain.r_inv_telefono.RelationshipInput;
import uif.domain.r_inv_telefono.TelefonoSourceRelation;
import uif.domain.r_inv_telefono.TelefonoToInvolucradoAssociation;


@Controller(value = "uif.rs.relate.RelateInvolucradoToTelefonoWith_r_inv_telefono_Controller")
@RequestMapping(value = "/application/uif_involucrados/{id}/telefonos", method = RequestMethod.POST, params = "type=r_inv_telefono")
public class RelateInvolucradoToTelefonoWith_r_inv_telefono_Controller extends AbstractRelationshipCreateController<InvolucradoTargetRelation,TelefonoSourceRelation,TelefonoToInvolucradoAssociation,RelationshipInput> {
    public RelateInvolucradoToTelefonoWith_r_inv_telefono_Controller() {
        super(InvolucradoTargetRelation.class,TelefonoSourceRelation.class,TelefonoToInvolucradoAssociation.class);
    }
}