package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Perfil;
import model.PerfilDAO;

import java.io.IOException;

public class AlterarPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AlterarPerfil() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Perfil p = new Perfil();
		PerfilDAO dB = new PerfilDAO();

		// RECEBENDO OS DADOS
		int idPerfil = Integer.parseInt(request.getParameter("idPerfil"));
		String perfil = request.getParameter("perfil");

		// SETANDO AS VARIÁVEIS
		p.setIdPerfil(idPerfil);
		p.setPerfil(perfil);

		// EXECUTANDO O MÉTODO ALTERAR
		try {
			dB.alterarPerfil(p);
		} catch (Exception e) {
			System.out.println(e);
		}
		// REDIRECIONANDO PARA A TELA DE SERVIÇOS
		response.sendRedirect("perfis.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
