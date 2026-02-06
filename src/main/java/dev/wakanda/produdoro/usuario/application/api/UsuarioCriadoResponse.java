package dev.wakanda.produdoro.usuario.application.api;

import dev.wakanda.produdoro.usuario.domain.ConfiguracaoUsuario;
import dev.wakanda.produdoro.usuario.domain.StatusUsuario;
import dev.wakanda.produdoro.usuario.domain.Usuario;
import lombok.Value;

import java.util.UUID;


@Value
public class UsuarioCriadoResponse {
    private final UUID idUsuario;
    private final String email;
    private final ConfiguracaoUsuarioResponse configuracao;
    private final StatusUsuario status;
    private final Integer quantidadePomodoroPausaCurta = 0;

    public UsuarioCriadoResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
        this.configuracao = new ConfiguracaoUsuarioResponse(usuario.getConfiguracao());
        this.status = usuario.getStatus();
    }
}
//DTO de resposta