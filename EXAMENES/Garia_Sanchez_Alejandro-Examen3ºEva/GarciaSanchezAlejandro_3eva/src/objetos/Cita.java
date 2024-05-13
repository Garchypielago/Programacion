package objetos;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Cita implements Serializable, Comparable<Cita>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idCita;
	private String nifPacinete, nifMedico;
	private int numeroSala;
	
	public Cita(int idCita, String nifPacinete, String nifMedico, int numeroSala) {
		super();
		this.idCita = idCita;
		this.nifPacinete = nifPacinete;
		this.nifMedico = nifMedico;
		this.numeroSala = numeroSala;
	}

	public int getIdCita() {
		return idCita;
	}
	
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public String getNifPacinete() {
		return nifPacinete;
	}
	
	public void setNifPacinete(String nifPacinete) {
		this.nifPacinete = nifPacinete;
	}
	
	public String getNifMedico() {
		return nifMedico;
	}

	public void setNifMedico(String nifMedico) {
		this.nifMedico = nifMedico;
	}

	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}

	@Override
	public String toString() {
		return "Cita [idCita=" + idCita + ", nifPacinete=" + nifPacinete + ", nifMedico=" + nifMedico + ", numeroSala="
				+ numeroSala + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		return idCita == other.idCita;
	}

	@Override
	public int compareTo(Cita o) {
		// TODO Auto-generated method stub
		if (idCita > ((Cita)o).getIdCita())
			return 1;
		if (idCita < ((Cita)o).getIdCita())
			return -1;
		return 0;
	}
	
	

}
