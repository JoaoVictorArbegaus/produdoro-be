package dev.wakanda.produdoro.usuario.application.service;

import dev.wakanda.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakanda.produdoro.usuario.application.api.UsuarioNovoRequest;

public interface usuarioApplicationService {
    UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo);
}
