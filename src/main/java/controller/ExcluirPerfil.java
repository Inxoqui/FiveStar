package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Perfil;
import model.PerfilDAO;

import java.io.IOException;

public class ExcluirPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExcluirPerfil() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Perfil perfil = new Perfil();
		PerfilDAO dB = new PerfilDAO();
		
		// RECEBENDO O ID
		int idPerfil = Integer.parseInt(request.getParameter("idPerfil"));
		perfil.setIdPerfil(idPerfil);

		// SETANDO A VARIAVEL
		perfil.setIdPerfil(idPerfil);

		// EXECUTANDO O MÉTODO DE EXCLUIR
		dB.excluir(perfil);

		response.sendRedirect("perfis.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
