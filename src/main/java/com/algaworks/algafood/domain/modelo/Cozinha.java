package com.algaworks.algafood.domain.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tab_cozinhas")
@Getter
@Setter
public class Cozinha {

  @Id
  private Long Id;

  @Column(name = "nom_cozinha")
  private String nome;

}
