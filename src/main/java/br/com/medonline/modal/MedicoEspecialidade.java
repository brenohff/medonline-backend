package br.com.medonline.modal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.medonline.modal.MedicoEspecialidade.MedicoEspecialidadePK;

@Entity
@Table(name = "MEDICO_ESPECIALIDADE")
@IdClass(value = MedicoEspecialidadePK.class)
@JsonInclude(value = Include.NON_NULL)
public class MedicoEspecialidade implements Serializable {
	private static final long serialVersionUID = -7827770715331111934L;

	@Id
	private long idMedico;
	@Id
	private long idEspecialidade;

	public long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(long idMedico) {
		this.idMedico = idMedico;
	}

	public long getIdEspecialidade() {
		return idEspecialidade;
	}

	public void setIdEspecialidade(long idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}

	public class MedicoEspecialidadePK implements Serializable {
		private static final long serialVersionUID = -9030561001640080707L;

		private long idMedico;
		private long idEspecialidade;

		public long getIdMedico() {
			return idMedico;
		}

		public void setIdMedico(long idMedico) {
			this.idMedico = idMedico;
		}

		public long getIdEspecialidade() {
			return idEspecialidade;
		}

		public void setIdEspecialidade(long idEspecialidade) {
			this.idEspecialidade = idEspecialidade;
		}

	}

}
