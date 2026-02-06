package dev.wakanda.produdoro.usuario.application.api;

import dev.wakanda.produdoro.usuario.domain.ConfiguracaoUsuario;
import lombok.Value;

@Value
public class ConfiguracaoUsuarioResponse {

    private final Integer tempoMinutosFoco;
    private final Integer tempoMinutosPausaCurta;
    private final Integer tempoMinutosPausaLonga;
    private final Integer repeticoesParaPausaLonga;

    public ConfiguracaoUsuarioResponse(ConfiguracaoUsuario configuracao) {
        this.tempoMinutosFoco = configuracao.getTempoMinutosFoco();
        this.repeticoesParaPausaLonga = configuracao.getRepeticoesParaPausaLonga();
        this.tempoMinutosPausaLonga = configuracao.getTempoMinutosPausaLonga();
        this.tempoMinutosPausaCurta = configuracao.getTempoMinutosPausaCurta();
    }
}
