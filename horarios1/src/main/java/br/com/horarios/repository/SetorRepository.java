package br.com.horarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.horarios.entity.SetorEntity;

@Repository
public interface SetorRepository extends JpaRepository<SetorEntity, Long>
{

}
