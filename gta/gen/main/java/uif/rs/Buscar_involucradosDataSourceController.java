package uif.rs;

import com.emc.xcp.services.datasource.domain.Query;
import com.emc.xcp.services.datasource.search.rs.SearchController;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Buscar_involucradosDataSourceOutput;


@Controller(value = "uif.rs.Buscar_involucradosDataSourceController")
@RequestMapping(value = "/application/uif_involucrados", params = "type=uif_buscar_involucrados")
public class Buscar_involucradosDataSourceController extends SearchController<Buscar_involucradosDataSourceOutput> {
    public Buscar_involucradosDataSourceController() {
        super(Buscar_involucradosDataSourceOutput.class);
    }

    public Query getQuery(){
        return query;
    }


    @Inject
    @Named(value = "uif_buscar_involucrados")
    private Query query;


}