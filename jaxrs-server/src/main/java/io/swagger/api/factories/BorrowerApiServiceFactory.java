package io.swagger.api.factories;

import io.swagger.api.BorrowerApiService;
import io.swagger.api.impl.BorrowerApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-02-21T20:04:35.977Z")
public class BorrowerApiServiceFactory {
    private final static BorrowerApiService service = new BorrowerApiServiceImpl();

    public static BorrowerApiService getBorrowerApi() {
        return service;
    }
}
