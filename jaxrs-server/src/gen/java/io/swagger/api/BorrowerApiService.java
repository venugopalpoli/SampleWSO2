package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Payload;
import io.swagger.model.Payload1;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-02-21T20:04:35.977Z")
public abstract class BorrowerApiService {
    public abstract Response borrowerBorrowerIdDelete(String borrowerId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response borrowerBorrowerIdGet(String borrowerId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response borrowerGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response borrowerPost(Payload1 payload,SecurityContext securityContext) throws NotFoundException;
    public abstract Response borrowerPut(Payload payload,SecurityContext securityContext) throws NotFoundException;
}
