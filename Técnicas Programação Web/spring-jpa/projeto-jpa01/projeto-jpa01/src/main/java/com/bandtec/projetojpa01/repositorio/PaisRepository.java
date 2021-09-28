package com.bandtec.projetojpa01.repositorio;


import com.bandtec.projetojpa01.dominio.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

//EM tempo de execução o Spring criará uma classe que implementa esta interface.

/*
Ela conterá os métodos de acesso ao banco para a entidade Pais
As instruções SQL serão apropriadas para o banco H2, pois foi o driver que indicamos para o projeto.
*/

// No extends Jparepository<T1, T2>
// T1 -> Tipo de classe de entidade
//T2 -> Tipo da PK da Entidade
public interface PaisRepository extends JpaRepository<Pais, Integer> {

}
