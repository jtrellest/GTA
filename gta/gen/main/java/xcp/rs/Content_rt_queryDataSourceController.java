package xcp.rs;

import com.emc.xcp.services.datasource.domain.Query;
import com.emc.xcp.services.datasource.realtime.rs.RealtimeController;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xcp.domain.Content_rt_queryDataSourceOutput;


@Controller(value = "xcp.rs.Content_rt_queryDataSourceController")
@RequestMapping(value = "/application/xcp_dm_documents", params = "type=xcp_content_rt_query")
public class Content_rt_queryDataSourceController extends RealtimeController<Content_rt_queryDataSourceOutput> {
    public Content_rt_queryDataSourceController() {
        super(Content_rt_queryDataSourceOutput.class);
    }

    public Query getQuery(){
        return query;
    }


    @Inject
    @Named(value = "xcp_content_rt_query")
    private Query query;


}