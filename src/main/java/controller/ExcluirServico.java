package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Servico;
import model.ServicoDAO;

import java.io.IOException;

public class ExcluirServico extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExcluirServico() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServicoDAO dB = new ServicoDAO();
    	Servico s = new Servico();
		
		// RECEBENDO O ID
		int idServico = Integer.parseInt(request.getParameter("idServico"));
		s.setidServico(idServico);

		// SETANDO A VARIAVEL
		s.setidServico(idServico);

		// EXECUTANDO O MÉTODO DE EXCLUIR
		dB.excluir(s);

		response.sendRedirect("servicos.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
