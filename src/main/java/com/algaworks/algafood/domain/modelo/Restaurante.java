package com.algaworks.algafood.domain.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Restaurante {

  @Id
  private Long id;

  private String nome;

  @Column(name="taxa_frete")
  private BigDecimal taxaFrete;

}
