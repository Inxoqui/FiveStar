
<%
//TERMINANDO A SESSÃO
session.invalidate();

//REDIRECIONANDO
response.sendRedirect("login.jsp");
%>