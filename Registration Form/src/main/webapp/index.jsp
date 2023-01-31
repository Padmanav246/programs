<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<style>
body {
	background-color:  #f7f7f7;
}

* {
	margin: 0;
	padding: 0;
}

.manubar {
	background-color: #a15f4b61;;
	text-align: center;
}

.manubar ul {
	display: inline-flex;
	list-style: none;
	color: black;
}

.manubar ul li {
	width: 120px;
	margin: 15px;
	padding: 15px;
	font-size: 20px;
	font-weight: 500;
}

.manubar ul li a {
	text-decoration: none;
	color: aliceblue;
}

.active, .manubar ul li:hover {
	background: #2b1e16;
	border-radius: 5px;
}

.submenu {
	display: none;
}

.manubar ul li:hover .submenu {
	display: block;
	position: absolute;
	background: #2b1e16;
	margin-top: 15px;
	margin-left: -15px;
}

.manubar ul li:hover .submenu ul {
	display: block;
	margin: 10px;
}

.manubar ul li:hover .submenu ul li {
	width: 150px;
	padding: 10px;
	border-bottom: 1px dotted #fff;
	background: transparent;
	border-radius: 2px;
	text-align: center;
}

.manubar ul li:hover .submenu ul li:last-child {
	border-bottom: none;
}

.manubar ul li:hover .submenu ul li:hover {
	color: #b2ff00;
}

#account {
	height: 30px;
}

.body {
	height: 482px;
}

#body {
	width: 100%;
	height: 520px;
}

.choice {
	display: flex;
}

.MagicScroll {
	display: flex;
	justify-content: center;
}

.row {
	display: flex;
	justify-content: center;
	/* text-align: center; */
	margin-left: 40px height: 200p
}

.mb-2 {
	list-style: none;
	text-decoration: none;
}

a {
	text-decoration: none;
	color: black;
	font-size: medium;
}

footer {
	background-color: #c5c5c5;
	padding: 6px;
	margin: 20px;
}
._3fted {
            font-size: 28px;
            font-weight: 700;
        }
        ._2Zn3W {
         margin-top: 20px;
            }
            ._2RZDN{
                display: flex;
                justify-content: space-evenly;
                align-items: center;
                background-color: #2b1e16;
                color: aliceblue;
                height: 343px;
            }
            _2tnu
            {
                background-color: #2b1e16;
                color: aliceblue;
                height: 343px;
            }
</style>
<link type="text/css" rel="stylesheet"
	href="magicscroll/magicscroll.css" />

</head>
<body>
	<div class="manubar">

		<ul>

			<li id="iteams"><a href="index.jsp">Home</a></li>
			<li id="iteams"><a href="#">Aboutus</a></li>
			<li id="iteams"><a href="#">Services</a></li>
			<li id="iteams"><a href="#">Clints</a></li>
			<li id="iteams"><a href="#">Pricing</a>
				<form action="/Filter" method="post">
					<div class="submenu">
						<ul>

							<li><h3>Select your type</h3> <select name="type" id="type">
									<option value="Veg">veg</option>
									<option value="Nonveg">Nonveg</option>
							</select></li>
							<li><h3>Select your Price Range</h3> <select name="lowest"
								id="lowest">
									<option value="100">100</option>
									<option value="200">200</option>
									<option value="300">300</option>
									<option value="400">400</option>
									<option value="500">500</option>
							</select> <select name="highest" id="highest">
									<option value="200">200</option>
									<option value="200">300</option>
									<option value="200">400</option>
									<option value="200">500</option>
									<option value="200">600+</option>
							</select></li>
							<li><input type="submit" value="Search"></li>
						</ul>
					</div>

				</form></li>

			<li id="iteams"><a href="#">Login</a>
				<div class="submenu">
					<ul>
						<li><a href="Register.jsp">Customer</a></li>
						<li><a href="adminregister.jsp">Admin</a></li>
					</ul>
				</div></li>
			<li id="iteams"><a href="Printorder.jsp"><label> <img
						id="account" src="https://img.icons8.com/bubbles/2x/food-cart.png" /></label>
					<label>Mycart</label></a>
			<li id="iteams"><a href="#"><label> <img
						id="account"
						src="https://img.icons8.com/ios-filled/2x/guest-male.png" /></label> <label>
							<%String name;
							name=(String)session.getAttribute("Userid");%>
							
							<%=name %>
							</label></a>
		</ul>
	</div>
	<div class="MagicScroll" data-options="step: 0; speed: 1000;">

		<img id="body" alt=""
			src="https://images.pexels.com/photos/1640773/pexels-photo-1640773.jpeg?auto=compress&cs=tinysrgb&w=1600">
	</div>
	
		<div id="iteams">
			<jsp:include page="/avalableproducts.jsp" />
		</div>
	<div class="_2tnu-"><div class="_2RZDN"><div class="_2Zn3W"><div class="_1Vw_y"><img class="_2dYjq" width="105" height="199" src="https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_210,h_398/4x_-_No_min_order_x0bxuf"></div><div class="_3fted">No Minimum Order</div><div class="_12i5X">Order in for yourself or for the group, with no restrictions on order value</div></div><div class="_2Zn3W"><div class="_1Vw_y"><img class="_2dYjq" width="112" height="206" src="https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_224,h_412/4x_Live_order_zzotwy"></div><div class="_3fted">Live Order Tracking</div><div class="_12i5X">Know where your order is at all times, from the restaurant to your doorstep</div></div><div class="_2Zn3W"><div class="_1Vw_y"><img class="_2dYjq" width="124" height="188" src="https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_248,h_376/4x_-_Super_fast_delivery_awv7sn"></div><div class="_3fted">Lightning-Fast Delivery</div><div class="_12i5X">Experience Swiggy's superfast delivery for food delivered fresh &amp; on time</div></div></div></div>
	
	<div>
		<footer class="bd-footer py-4 py-md-5 mt-5 bg-body-tertiary">
			<div class="container3">
				<div class="row">
					<div class="col-lg-3 mb-3">
						<a
							class="d-inline-flex align-items-center mb-2 text-body-secondary text-decoration-none"
							href="/" aria-label="Bootstrap"> <span class="fs-5">Myfoods</span>
						</a>
						<ul class="list-unstyled small">
							<li class="mb-2">Order from your favorite restaurants &
								track on the go, with the all-new myfood app.<a
								href="/docs/5.3/about/team/">Bootstrap team</a> with the help of
								<a href="https://github.com/twbs/bootstrap/graphs/contributors">our
									contributors</a>.
							</li>
							<li class="mb-2">licensed <a
								href="https://github.com/twbs/bootstrap/blob/main/LICENSE"
								target="_blank" rel="license noopener">MIT</a>, docs <a
								href="https://creativecommons.org/licenses/by/3.0/"
								target="_blank" rel="license noopener">CC BY 3.0</a>.
							</li>
						</ul>
					</div>
					<div class="col-6 col-lg-2 offset-lg-1 mb-3">
						<h5>Company</h5>
						<ul class="list-unstyled">
							<li class="mb-2"><a href="/">About us</a></li>
							<li class="mb-2"><a href="/docs/5.3/">Team</a></li>
							<li class="mb-2"><a href="/docs/5.3/examples/">Careers</a></li>
							<li class="mb-2"><a href="https://icons.getbootstrap.com/">Corporate</a></li>
							<li class="mb-2"><a href="https://themes.getbootstrap.com/">Instamart</a></li>
							<li class="mb-2"><a href="https://blog.getbootstrap.com/">Genie</a></li>
							<li class="mb-2"><a
								href="https://cottonbureau.com/people/bootstrap">Swag Store</a></li>
						</ul>
					</div>
					<div class="col-6 col-lg-2 mb-3">
						<h5>Contact</h5>
						<ul class="list-unstyled">
							<li class="mb-2"><a href="/docs/5.3/getting-started/">Help
									& Support </a></li>
							<li class="mb-2"><a
								href="/docs/5.3/examples/starter-template/">Partner with us</a></li>
							<li class="mb-2"><a
								href="/docs/5.3/getting-started/webpack/">Ride with us</a></li>
						</ul>
					</div>
					<div class="col-6 col-lg-2 mb-3">
						<h5>Legal</h5>
						<ul class="list-unstyled">
							<li class="mb-2"><a href="https://github.com/twbs/bootstrap">Terms
									& Conditions</a></li>
							<li class="mb-2"><a
								href="https://github.com/twbs/bootstrap/tree/v4-dev">Refund
									& Cancellation</a></li>
							<li class="mb-2"><a href="https://github.com/twbs/icons">Privacy
									Policy</a></li>
							<li class="mb-2"><a href="https://github.com/twbs/rfs">Cookie
									Policy</a></li>
							<li class="mb-2"><a
								href="https://github.com/twbs/bootstrap-npm-starter">Offer
									Terms</a></li>
						</ul>
					</div>
					<div class="col-6 col-lg-2 mb-3">
						<h5>We Are In</h5>
						<ul class="list-unstyled">
							<li class="mb-2"><a
								href="https://github.com/twbs/bootstrap/issues">Tirupati</a></li>
							<li class="mb-2"><a
								href="https://github.com/twbs/bootstrap/discussions">Chandragiri</a></li>
							<li class="mb-2"><a href="https://github.com/sponsors/twbs">Visakhapatnam</a></li>
							<li class="mb-2"><a
								href="https://opencollective.com/bootstrap">Vizianagaram</a></li>
							<li class="mb-2"><a
								href="https://stackoverflow.com/questions/tagged/bootstrap-5">Gaya</a></li>
						</ul>
					</div>
				</div>
			</div>
		</footer>
	</div>
</body>
</html>