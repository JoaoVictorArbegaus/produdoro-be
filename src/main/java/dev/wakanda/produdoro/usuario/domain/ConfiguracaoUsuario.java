package dev.wakanda.produdoro.usuario.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder(access = AccessLevel.PACKAGE)
@Getter
public class ConfiguracaoUsuario {

    private Integer tempoMinutosFoco;

    private Integer tempoMinutosPausaCurta;

    private Integer tempoMinutosPausaLonga;

    private Integer repeticoesParaPausaLonga;
}
