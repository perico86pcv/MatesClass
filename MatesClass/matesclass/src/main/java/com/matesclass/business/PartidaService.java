package com.matesclass.business;

import java.io.Serializable;
import java.util.List;

import com.matesclass.persistence.dao.PartidaDAO;
import com.matesclass.persistence.model.Partida;

public class PartidaService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8632621829202080787L;
	
	private PartidaDAO partidaDAO = new PartidaDAO();

	public Partida crearPartida(String nombrePartida, String idUsuario,
			String progreso, String codProgreso) {
		return partidaDAO.crearPartida(nombrePartida, idUsuario, progreso, codProgreso);
	}
	
	public List<Partida> listarPartidas(String idUsuario) {
		return partidaDAO.listarPartidas(idUsuario);
	}
	
	public void eliminarPartida(Long idPartida) {
		partidaDAO.eliminarPartida(idPartida);
	}
	
	public void cambiarPuntuacion(Long idPartida, Long puntos) {
		partidaDAO.cambiarPuntuacion(idPartida, puntos);
	}
	
	public Long cargarPuntuacion(Long idPartida) {
		return partidaDAO.cargarPuntuacion(idPartida);
	}
	
	public void guardarProgreso(Long idPartida, Long puntos, String progreso, String codProgreso) {
		partidaDAO.guardarProgreso(idPartida, puntos, progreso, codProgreso);
	}
}
