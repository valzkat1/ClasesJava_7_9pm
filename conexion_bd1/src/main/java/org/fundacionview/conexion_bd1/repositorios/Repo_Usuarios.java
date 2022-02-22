package org.fundacionview.conexion_bd1.repositorios;

import org.fundacionview.conexion_bd1.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo_Usuarios extends JpaRepository<Usuario, Integer>{

	// C R U D
	
}
