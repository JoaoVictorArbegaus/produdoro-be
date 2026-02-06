package dev.wakanda.produdoro.credencial.application.service;

import dev.wakanda.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.Valid;

public interface CredencialApplicationService {
    void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);
}
