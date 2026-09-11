package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/health")
public class Application {
    @GET
    public String health() {
        return "学校支持措施跟踪服务入口已启动";
    }
}
