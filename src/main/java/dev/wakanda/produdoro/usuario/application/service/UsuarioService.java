package dev.wakanda.produdoro.usuario.application.service;

import dev.wakanda.produdoro.credencial.application.service.CredencialApplicationService;
import dev.wakanda.produdoro.pomodoro.application.service.PomodoroApplicationService;
import dev.wakanda.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import dev.wakanda.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakanda.produdoro.usuario.application.api.UsuarioNovoRequest;
import dev.wakanda.produdoro.usuario.domain.Usuario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioService implements UsuarioApplicationService{

    private final PomodoroApplicationService pomodoroService;
    private final CredencialApplicationService credencialService;
    private final UsuarioReposiroy usuarioRepository;

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo){

        log.info("[start] UsuarioService - criaNovoUsuario");

        ConfiguracaoPadrao configuracaoPadrao = pomodoroService.getConfiguracaoPadrao();

        credencialService.criaNovaCredencial(usuarioNovo);

        Usuario usuario = new Usuario(usuarioNovo, configuracaoPadrao);

        usuarioRepository.salva(usuario);

        log.info("[finish] UsuarioService - criaNovoUsuario");

        return new UsuarioCriadoResponse(usuario);
    }

}
