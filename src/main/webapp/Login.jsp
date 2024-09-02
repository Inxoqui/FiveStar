<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<%-- ixones --%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"></link>

<style>
.card {
	width: 350px;
	height: 400px;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	border-radius: 20px
}

img {
	display: flex;
	height: 80px;
	width: 80px;
	border-radius: 50%;
	border: 1px solid black;
	margin: auto;
}

body {
	background-color: #3B3B3A;
}
</style>

</head>
<body>
	<div class="card">
		<article class="card-body">
			<img src="img/logo.jpg">
			<h4 class="card-title text-center mb-4 mt-1">Login</h4>
			<hr>
			<br>
			<form action="efetuar_login.do" method="post" name="form_login"
				onsubmit="return validaForm();">
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i>
							</span>
						</div>
						<input name="login" class="form-control" placeholder="Login"
							type="text">
					</div>
					<!-- input-group.// -->
				</div>
				<!-- form-group// -->
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-lock"></i>
							</span>
						</div>
						<input name="senha" class="form-control" placeholder="Senha"
							type="password">
					</div>
					<!-- input-group.// -->
				</div>
				<!-- form-group// -->
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-block">
						Login</button>
				</div>
				<!-- form-group// -->
				<p class="text-center">
					<a href="#" class="btn">Esqueceu a sua senha?</a>
				</p>
			</form>
		</article>
	</div>
	<!-- card.// -->

	</aside>
	<!-- col.// -->
	</div>
	<!-- row.// -->

	</div>
	<!--container end.//-->

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>