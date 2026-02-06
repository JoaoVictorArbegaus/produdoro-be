package dev.wakanda.produdoro.usuario.application.api;

import dev.wakanda.produdoro.usuario.domain.ConfiguracaoUsuario;
import dev.wakanda.produdoro.usuario.domain.StatusUsuario;
import lombok.Value;

import java.util.UUID;


@Value
public class UsuarioCriadoResponse {
    private final UUID idUsuario;
    private final String email;
    private final ConfiguracaoUsuarioResponse configuracao;
    private final StatusUsuario status;
    private final Integer quantidadePomodoroPausaCurta = 0;
}
//DTO de resposta