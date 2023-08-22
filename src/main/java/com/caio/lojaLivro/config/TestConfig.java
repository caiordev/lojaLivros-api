package com.caio.lojaLivro.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.caio.lojaLivro.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;

	// quando startar a aplicação, o perfil 'test' subirá o metodo
	// instanciaBaseDeDados
	@Bean
	//public void instanciaBaseDeDados() {
	void instanciaBaseDeDados() {
		this.dbService.instanciaBaseDeDados();
	}
}
