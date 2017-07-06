/**
 * Created by Apache CXF WadlToJava code generator
**/
package org.apache.cxf.systest.jaxrs.codegen.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/V03")
public class SrvSendMoneyMovementsV03 {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/createTransactionByFlap")
    public Response createTransactionByFlap() {
        //TODO: implement
        return null;
    }

    @POST
    @Consumes("application/json")
    @Path("/sendTransactionFlap")
    public void sendTransactionFlap() {
        //TODO: implement
    }

}