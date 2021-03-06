package com.lojadegames.lojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@NotNull
	@Size(min= 5, max = 100)
	private String nickname;
	
	@NotNull
	@Size(min= 5, max = 100)
	private String email;
	
	@NotNull
	
	private Double senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSenha() {
		return senha;
	}

	public void setSenha(Double senha) {
		this.senha = senha;
	}
	
	
	
	
}
