package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Perfil;
import model.PerfilDAO;

import java.io.IOException;

public class InserirPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InserirPerfil() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRIANDO OS OBJETOS
		Perfil perfil = new Perfil();
		PerfilDAO dB = new PerfilDAO();
		
		perfil.setPerfil(request.getParameter("perfil"));
		try {
			dB.inserirPerfil(perfil);
		} catch (Exception e) {
			System.out.println(e);
		}

		response.sendRedirect("perfis.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
