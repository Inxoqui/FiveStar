package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Servico;
import model.ServicoDAO;

import java.io.IOException;

public class AlterarServico extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AlterarServico() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServicoDAO dB = new ServicoDAO();
		Servico s = new Servico();

		int idServico = Integer.parseInt(request.getParameter("idServico"));
		String nome = request.getParameter("nome");
		double valor = Double.parseDouble(request.getParameter("valor"));

		// SETANDO AS VARIÁVEIS
		s.setidServico(idServico);
		s.setNome(nome);
		s.setValor(valor);

		// EXECUTANDO O MÉTODO ALTERAR
		try {
			dB.alterarServico(s);
		} catch (Exception e) {
			System.out.println(e);
		}
		// REDIRECIONANDO PARA A TELA DE SERVIÇOS
		response.sendRedirect("servicos.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
