package dev.wakanda.produdoro.usuario.domain;

import dev.wakanda.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
public class ConfiguracaoUsuario {

    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesParaPausaLonga;

    public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrao) {
        this.tempoMinutosFoco = configuracaoPadrao.getTempoMinutosFoco();
        this.repeticoesParaPausaLonga = configuracaoPadrao.getRepeticoesParaPausaLonga();
        this.tempoMinutosPausaLonga = configuracaoPadrao.getTempoMinutosPausaLonga();
        this.tempoMinutosPausaCurta = configuracaoPadrao.getTempoMinutosPausaCurta();
    }
}
