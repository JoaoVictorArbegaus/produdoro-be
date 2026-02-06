package dev.wakanda.produdoro.usuario.infra;

import dev.wakanda.produdoro.usuario.application.service.UsuarioReposiroy;
import dev.wakanda.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryMongoDB implements UsuarioReposiroy {
    private final UsuarioMongoSpringRepository usuarioMongoRepository;

    @Override
    public Usuario salva(Usuario usuario) {
        return usuarioMongoRepository.save(usuario);
    }
}
