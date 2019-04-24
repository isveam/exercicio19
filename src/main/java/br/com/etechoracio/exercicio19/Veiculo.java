package br.com.etechoracio.exercicio19;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_veiculo")

public class Veiculo {
	@Id
	@GeneratedValue
	@Column(name="id_veiculo")
	private Long id;
	
	@Column(name="tx_placa")
	private String placa;
	@Column(name="tx_cor")
	private String cor;
	@Column(name="nr_ano")
	private int ano;
}

