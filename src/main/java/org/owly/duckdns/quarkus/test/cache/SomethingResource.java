package org.owly.duckdns.quarkus.test.cache;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class SomethingResource {
    @GET
    public String get() {
        return "hello";
    }
}
