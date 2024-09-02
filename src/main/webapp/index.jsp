<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%-- Bootstrap --%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"></link>
<%-- CSS --%>
<link rel="stylesheet" href="css/style.css">
<%-- ixones --%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"></link>

<title>FiveStar</title>
</head>
<body>
	<%-- cabeçalho --%>
	<header>
		<%-- barra de navegação --%>
		<nav class="navbar navbar-dark bg-dark fixed-top">
			<div class="container-fluid">
				<%-- logo --%>
				<a class="navbar-brand" href="#"><img id="logo"
					src="img/logo.jpg"> </a>
				<%-- botão expansilvel --%>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar"
					aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<%--texto do menu --%>
				<div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1"
					id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
					<div class="offcanvas-header">
						<h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Bem
							vindo à Five Star</h5>
						<button type="button" class="btn-close btn-close-white"
							data-bs-dismiss="offcanvas" aria-label="Close"></button>
					</div>
					<div class="offcanvas-body">
						<ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
							<li class="nav-item"><a class="nav-link active" href="main"><i class="fa-regular fa-user"></i> Login</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Serviços</a></li>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#" role="button"
								data-bs-toggle="dropdown" aria-expanded="false"> Contato</a>
								<ul class="dropdown-menu dropdown-menu-dark">
									<li><a class="dropdown-item" href="#"><i
											class="fa-brands fa-instagram"></i> Instagram</a></li>
									<li><a class="dropdown-item" href="#"><i
											class="fa-brands fa-whatsapp"></i> Whatsapp</a></li>
									<li>
								</ul>
					</div>
				</div>
			</div>
		</nav>
	</header>

	<%-- conteudo principal --%>
	<main>
		<%-- carrossel das imagens da barbearia --%>
		<%--<section class="fivestarimages">
			<div id="slidesfivestar" class="carousel slide"
				data-bs-ride="carousel">
				<!--indicadores-->
				<div class="carousel-indicators">
					<button type="button" data-bs-target="#slidesfivestar"
						data-bs-slide-to="0" class="active" aria-current="true"
						aria-label="Slide 1"></button>
					<button type="button" data-bs-target="#slidesfivestar"
						data-bs-slide-to="1" aria-label="Slide 2"></button>
					<button type="button" data-bs-target="#slidesfivestar"
						data-bs-slide-to="2" aria-label="Slide 3"></button>
					<button type="button" data-bs-target="#slidesfivestar"
						data-bs-slide-to="3" aria-label="Slide "4></button>
					<button type="button" data-bs-target="#slidesfivestar"
						data-bs-slide-to="4" aria-label="Slide 5"></button>
				</div>

				<!--imagens-->
				<div class="carousel-inner">
					<div class="carousel-item active c-item">
						<!--imagem-->
						<img src="#" class="d-block w-100 c-img" alt="Slide 1">
						<!--texto slide-->
						<div class="carousel-caption d-none d-md-block">
							<h5>SORTEIO</h5>
							<p>
								Faça qualquer procedimento e ganhe um cupom <br> para o
								sorteio de um <strong>IPHONE 15 PRO MAX</strong>
							</p>
						</div>
					</div>
					<div class="carousel-item c-item">
						<!-- imagem -->
						<img src="#" class="d-block w-100 c-img" alt="Slide 2">
					</div>
					<div class="carousel-item c-item">
						<!-- imagem -->
						<img src="#" class="d-block w-100 c-img" alt="Slide 3">
					</div>
					<div class="carousel-item c-item">
						<!-- imagem -->
						<img src="#" class="d-block w-100 c-img" alt="Slide 4">
					</div>
					<div class="carousel-item c-item">
						<!-- imagem -->
						<img src="#" class="d-block w-100 c-img" alt="Slide 5">
					</div>
				</div>

				<!--btotões-->
				<button class="carousel-control-prev" type="button"
					data-bs-target="#slidesfivestar" data-bs-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Previous</span>
				</button>
				<button class="carousel-control-next" type="button"
					data-bs-target="#slidesfivestar" data-bs-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Next</span>
				</button>
			</div>

			<aside class="sorteio">
				<p>
					Faça qualquer procedimento e ganhe um cupom para o sorteio de um <strong>IPHONE
						15 PRO MAX</strong>
				</p>
			</aside>
		</section>
		 
		 AINDA FALTA RESOLVER!!!!!!!!!!!!!!
		 --%>


		<section class="localizacao">
			<div class="loc">
				<h2>Nossa localização</h2>

				<p>
					Rua 8, 6, Lotes 4, 6, 8 loja, Águas Claras, Brasília-DF - 71908-360
					<a
						href="https://www.google.com/maps/place/Barbearia+Five+Star/@-15.8349904,-48.0171115,17z/data=!3m1!4b1!4m6!3m5!1s0x935a3391bb2b0509:0xf0c29abd349df0!8m2!3d-15.8349956!4d-48.0145366!16s%2Fg%2F11vd7dfq61?entry=ttu"
						target="_blank"> <i class="fas fa-map-marker-alt"></i> Ver no
						mapa
					</a>
				</p>

				<p>
					<strong>Segunda-Feira a Sábado:</strong> 09:00 às 20:00
				</p>
			</div>

			<div class="maps">
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3838.410733727821!2d-48.017116888184944!3d-15.834995584747737!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x935a3391bb2b0509%3A0xf0c29abd349df0!2sBarbearia%20Five%20Star!5e0!3m2!1sen!2sbr!4v1725136117539!5m2!1sen!2sbr"
					width="300" height="300" style="border: 1;" allowfullscreen=""
					loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
			</div>
		</section>

		<%-- quem comos --%>
		<section class="quemSomos">
			<h2>Barbearia Five Star</h2>

			<p>
				<strong>Formas de pagamento: <br></strong> Cartões de
				Crédito/Débito, Pix e Dineheiro.
			</p>

			<p>
				<strong>Facilidades: <br></strong> Bar e lanchonete, Wi-Fi,
				Estacionamento grátis, Atendemos adultos e crianças, Acesso para
				PNE, TV.
			</p>
		</section>


	</main>

	<%-- rodapé --%>
	<footer>

		<p>
			&#9400;Todos os direitos reservardos à <strong>Barbearia
				Five Star</strong>
		</p>


	</footer>
	<%-- JS do Bootstrap --%>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>