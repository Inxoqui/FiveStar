package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Servico;
import model.ServicoDAO;


public class InserirServico extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public InserirServico() {
        super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServicoDAO dB = new ServicoDAO();
    	Servico s = new Servico();
    	
    	s.setNome(request.getParameter("nome"));
		double valor = Double.parseDouble(request.getParameter("valor"));
		s.setValor(valor);

		try {
			dB.inserirServico(s);
		} catch (Exception e) {
			System.out.println(e);
		}

		response.sendRedirect("servicos.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
