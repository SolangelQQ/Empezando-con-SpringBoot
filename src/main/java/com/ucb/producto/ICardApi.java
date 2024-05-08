package com.ucb.producto;

import com.ucb.producto.dto.*;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

public interface ICardApi {

    @Tag(name = "Pagar", description = "Pagar con tarjeta de crédito")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200", description = "Successful",
                            content = {@Content(mediaType = "application/json",
                                    schema = @Schema(implementation = CardResponseDto.class))}),
                    @ApiResponse(
                            responseCode = "400", description = "Solicitud de pago incorrecta"),
                    @ApiResponse(
                            responseCode = "401", description = "Pago no autorizado"),
                    @ApiResponse(
                            responseCode = "403", description = "Pago prohibido"),
                    @ApiResponse(
                            responseCode = "404", description = "Recurso de pago no encontrado"),
                    @ApiResponse(
                            responseCode = "500", description = "Error interno del servidor al procesar el pago",
                            content = {@Content(mediaType = "application/json",
                                    schema = @Schema(implementation = ErrorResponse.class))})
            }
    )

    public ResponseEntity create(CardRequestDto login);

}