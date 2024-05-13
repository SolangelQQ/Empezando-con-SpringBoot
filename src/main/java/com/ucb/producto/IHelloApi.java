package com.ucb.producto;

import io.swagger.v3.oas.annotations.tags.Tag;

public interface IHelloApi {

    @Tag(name = "Sentry", description = "Fallar para validar funcionamiento Sentry")


    public String index();
}
