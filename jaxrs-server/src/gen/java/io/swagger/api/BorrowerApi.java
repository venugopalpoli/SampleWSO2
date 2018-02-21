package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BorrowerApiService;
import io.swagger.api.factories.BorrowerApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Payload;
import io.swagger.model.Payload1;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/borrower")


@io.swagger.annotations.Api(description = "the borrower API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-02-21T20:04:35.977Z")
public class BorrowerApi  {
   private final BorrowerApiService delegate;

   public BorrowerApi(@Context ServletConfig servletContext) {
      BorrowerApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BorrowerApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BorrowerApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BorrowerApiServiceFactory.getBorrowerApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    @Path("/{borrowerId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = void.class) })
    public Response borrowerBorrowerIdDelete(@ApiParam(value = "",required=true) @PathParam("borrowerId") String borrowerId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.borrowerBorrowerIdDelete(borrowerId,securityContext);
    }
    @GET
    @Path("/{borrowerId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = void.class) })
    public Response borrowerBorrowerIdGet(@ApiParam(value = "",required=true) @PathParam("borrowerId") String borrowerId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.borrowerBorrowerIdGet(borrowerId,securityContext);
    }
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = void.class) })
    public Response borrowerGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.borrowerGet(securityContext);
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = void.class) })
    public Response borrowerPost(@ApiParam(value = "Request Body" ) Payload1 payload
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.borrowerPost(payload,securityContext);
    }
    @PUT
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = void.class) })
    public Response borrowerPut(@ApiParam(value = "Request Body" ) Payload payload
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.borrowerPut(payload,securityContext);
    }
}
