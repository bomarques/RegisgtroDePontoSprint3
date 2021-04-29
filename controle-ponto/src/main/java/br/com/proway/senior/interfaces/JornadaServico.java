package br.com.proway.senior.interfaces;

import br.com.proway.senior.modelos.Jornada;

import java.time.LocalDateTime;

public interface JornadaServico {
	public boolean registraPonto(int idPessoa, LocalDateTime momentoBatida);
	public boolean fechaJornada(Jornada jornada);
	
}
