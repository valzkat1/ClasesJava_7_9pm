package org.fundacionview.proyectofinal.repositorios;

import org.fundacionview.proyectofinal.modelos.archivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo_archivos extends JpaRepository<archivos, Integer>{

}
