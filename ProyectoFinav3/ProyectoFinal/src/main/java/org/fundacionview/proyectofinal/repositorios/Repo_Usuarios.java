package org.fundacionview.proyectofinal.repositorios;

import org.fundacionview.proyectofinal.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo_Usuarios extends JpaRepository<Usuario, Integer>{

	@Query(value = "FROM Usuario WHERE username=:user AND clave=:clave")
	public Usuario getLogin(@Param("user")String user,@Param("clave")String clave);
	
}
