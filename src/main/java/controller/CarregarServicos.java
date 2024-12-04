package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Servico;
import model.ServicoDAO;

import java.io.IOException;

public class CarregarServicos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CarregarServicos() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServicoDAO dB = new ServicoDAO();
    	Servico s = new Servico();
		
		int idServico = Integer.parseInt(request.getParameter("idServico"));
		s.setidServico(idServico);
		;
		dB.carregarPorID(s);

		/*
		 * TESTE DE RECEBIMENTO System.out.println(p.getIdPro());
		 * System.out.println(p.getNome()); System.out.println(p.getValor());
		 */

		// SETAR OS ATRIBUTOS DO FUMULÁRIO
		request.setAttribute("idServico", s.getidServico());
		request.setAttribute("nome", s.getNome());
		request.setAttribute("valor", s.getValor());

		// ECAMINHAR OS DADOS PARA O DOCUMENTO DE EDITAR
		RequestDispatcher rd = request.getRequestDispatcher("alterarServicos.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
