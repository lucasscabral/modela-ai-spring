package com.modela_ai.api.model;

import com.modela_ai.api.dto.carsDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class cars {

  public cars(carsDTO cars) {
    this.anoModelo = cars.anoModelo();
    this.dataFabricacao = cars.dataFabricacao();
    this.fabricante = cars.fabricante();
    this.modelo = cars.modelo();
    this.valor = cars.valor();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 80, nullable = false)
  private String modelo;

  @Column(length = 80, nullable = false)
  private String fabricante;

  @Column(length = 10, nullable = false)
  private String dataFabricacao;

  @Column(nullable = false)
  private Double valor;

  @Column(length = 4, nullable = false)
  private int anoModelo;
}
