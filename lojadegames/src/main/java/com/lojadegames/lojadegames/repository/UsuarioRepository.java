package com.lojadegames.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojadegames.lojadegames.model.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository <Usuario, Long>{
	List <Usuario> findAllByNicknameContainingIgnoreCase(String nickname);
	List <Usuario> findAllByEmailContainingIgnoreCase(String email);
	
	


}
