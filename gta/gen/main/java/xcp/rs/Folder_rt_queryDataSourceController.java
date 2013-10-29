package xcp.rs;

import com.emc.xcp.services.datasource.domain.Query;
import com.emc.xcp.services.datasource.realtime.rs.RealtimeController;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xcp.domain.Folder_rt_queryDataSourceOutput;


@Controller(value = "xcp.rs.Folder_rt_queryDataSourceController")
@RequestMapping(value = "/application/xcp_dm_folders", params = "type=xcp_folder_rt_query")
public class Folder_rt_queryDataSourceController extends RealtimeController<Folder_rt_queryDataSourceOutput> {
    public Folder_rt_queryDataSourceController() {
        super(Folder_rt_queryDataSourceOutput.class);
    }

    public Query getQuery(){
        return query;
    }


    @Inject
    @Named(value = "xcp_folder_rt_query")
    private Query query;


}