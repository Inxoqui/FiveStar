<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Servico"%>
<%@ page import="model.ServicoDAO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.sql.*"%>
<%
ArrayList<Servico> lista = (ArrayList<Servico>) request.getAttribute("servico");
%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Perfis</title>

<!-- JS BOOTSTRAP -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
<!--CSS BOOTSTRAP-->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.1/css/all.min.css">

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&icon_names=logout" />

<!-- CSS form -->
<link rel="stylesheet" href="css/tableCss.css">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
			<div class="container-fluid">
				<a class="navbar-brand" href="index.jsp"><img
					src="imagens/logo.jpg"></a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Clientes</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Agendamentos</a></li>
						<li class="nav-link disabled" aria-disabled="true">Serviços</li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Colaboradores</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="perfis.jsp">Perfis</a></li>
						<%
						String usuario = (String) session.getAttribute("usuario");

						if (usuario == null) {
							response.sendRedirect("login.jsp");
						} else {
							out.print("<li class='nav-item'><a class='nav-link active' aria-current='page' href='#'> Bem vindo " + usuario
							+ "</a></li>"
							+ "<li class='nav-item'><a class='nav-link active' aria-current='page' href='deslogar.jsp'> <span class='material-symbols-outlined'> logout </span>  Deslogar "
							+ "</a></li>");
						}
						%>
					</ul>

				</div>
			</div>
		</nav>
	</header>
	
	<section id="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">SERVIÇOS</th>
					<th scope="col">VALOR</th>
					<th scope="col">AÇÕES</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td colspan="3">ADICIONAR SERVIÇO</td>
					<td><a href="inserirServicos.jsp"><i class="fa-solid fa-plus"></i></a></td>
				</tr>
				
				
				<%
				ServicoDAO dB = new ServicoDAO();
				dB.conectar();
				ArrayList<Servico> lista1 = dB.listarServico();
				
				for (Servico s:lista1) {
				%>
				<tr>
					<td><%=s.getidServico()%></td>
					<td><%=s.getNome()%></td>
					<td><%=s.getValor()%></td>
					<td><a
						href="carregar_servico.do?idServico=<%=s.getidServico()%>"><i
							class="fa-solid fa-pen"></i></a> <a
						href="javascript: confirmar(<%=s.getidServico()%>)"><i
							class="fa-solid fa-trash"></i></a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>

	</section>

	<footer class="fixed-bottom">
		<h3>Desenvolvido por Inxoqui Tech todos os diereitos reservados
			&#9400</h3>
	</footer>

	<script type="text/javascript">
		function confirmar(idServico) {
			let resposta = confirm("Tem certeza que deseja excluir este serviço?")

			if (resposta === true) {
				alert("Serviço excluido com sucesso!")
				window.location.href = "excluir_servico.do?idServico=" + idServico
			}
		}
	</script>
</body>
</html>