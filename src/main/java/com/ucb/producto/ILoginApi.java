package com.ucb.producto;

import com.ucb.producto.dto.LoginRequestDto;
import com.ucb.producto.dto.LoginResponse;

import com.ucb.producto.dto.ErrorResponse;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

public interface ILoginApi {

    @Tag(name = "Login", description = "Login")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200", description = "Inicio de sesión exitoso",
                            content = {@Content(mediaType = "application/json",
                                    schema = @Schema(implementation = LoginResponse.class))}),
                    @ApiResponse(
                            responseCode = "400", description = "Solicitud incorrecta"),
                    @ApiResponse(
                            responseCode = "401", description = "No autorizado"),
                    @ApiResponse(
                            responseCode = "404", description = "Recurso no encontrado"),
                    @ApiResponse(
                            responseCode = "500", description = "Error interno del servidor",
                            content = {@Content(mediaType = "application/json",
                                    schema = @Schema(implementation = ErrorResponse.class))})
            }
    )
    public ResponseEntity create(LoginRequestDto login);

}