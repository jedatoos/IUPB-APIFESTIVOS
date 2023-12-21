package apifestivos.apifestivos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apifestivos.apifestivos.entidades.Tipo;

public interface TpoRepositorio extends JpaRepository<Tipo, Integer> {
    
}
