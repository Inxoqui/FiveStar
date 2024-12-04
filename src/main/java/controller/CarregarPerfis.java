package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Perfil;
import model.PerfilDAO;

import java.io.IOException;

public class CarregarPerfis extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CarregarPerfis() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idPerfil = Integer.parseInt(request.getParameter("idPerfil"));
		Perfil perfil = new Perfil();
		PerfilDAO dB = new PerfilDAO();

		
		perfil.setIdPerfil(idPerfil);
		;
		dB.carregarPorID(perfil);

		// SETAR OS ATRIBUTOS DO FUMULÁRIO
		request.setAttribute("idPerfil", perfil.getIdPerfil());
		request.setAttribute("perfil", perfil.getPerfil());

		// ECAMINHAR OS DADOS PARA O DOCUMENTO DE EDITAR
		RequestDispatcher rd = request.getRequestDispatcher("alterarPerfis.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
