package dev.wakanda.produdoro.usuario.application.service;

import dev.wakanda.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakanda.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.Valid;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UsuarioService implements UsuarioApplicationService{

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo){
        return new UsuarioCriadoResponse(null,null,null,null);
    }
}
