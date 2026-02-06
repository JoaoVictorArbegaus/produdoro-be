package dev.wakanda.produdoro.usuario.application.api;

import dev.wakanda.produdoro.usuario.application.service.UsuarioApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioApi {

    private final UsuarioApplicationService usuarioApplicationService;

    @Override
    public UsuarioCriadoResponse postNovoUsuario(UsuarioNovoRequest usuarioNovo) { //requer objeto usuario novo (email e senha)

        log.info("[start] UsuarioController - postNovoUsario");

        UsuarioCriadoResponse usuarioCriado = usuarioApplicationService.criaNovoUsuario(usuarioNovo);

        log.info("[finish] UsuarioController - postNovoUsario");
        return usuarioCriado;
    }


//    @Override
//    public UsuarioCriadoResponse postNovoUsuario(UsuarioNovoRequest usuarioNovo) {
//        log.info("[start]");
//        return null;
//    }
}
