
<%@ page import="Abbah.Ahmed.*" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Interpreter</title>
	
	
</head>
<body>
<style>
  /* Style the form input */
  #interpreter-form input[type="text"] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    background-color: #f8f8f8;
    font-size: 16px;
  }

  /* Style the form button */
  #interpreter-form button[type="submit"] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
  }

  /* Change the button color on hover */
  #interpreter-form button[type="submit"]:hover {
    background-color: #45a049;
  }
</style>

<style>

/* Color of the links BEFORE scroll */
.navbar-scroll .nav-link,
.navbar-scroll .navbar-toggler-icon,
.navbar-scroll .navbar-brand {
  color: #fff;
}

/* Color of the links AFTER scroll */
.navbar-scrolled .nav-link,
.navbar-scrolled .navbar-toggler-icon,
.navbar-scrolled .navbar-brand {
  color: #fff;
}

/* Color of the navbar AFTER scroll */
.navbar-scroll,
.navbar-scrolled {
  background-color: #cbbcb1;
}

.mask-custom {
  backdrop-filter: blur(5px);
  background-color: rgba(255, 255, 255, .15);
}

.navbar-brand {
  font-size: 1.75rem;
  letter-spacing: 3px;
}
#InterpreterDiv {
  position: absolute;
  top: 100px;
  left: 200px;
  background-color: white;
  opacity: 0.9;
  border-radius: 10px; /* adds rounded corners */
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3); /* adds a subtle shadow */
  padding: 20px; /* adds padding inside the div */
}
#result {
  background-color: #333;
  color: #fff;
  padding: 10px;
  font-family: 'Courier New', Courier, monospace;
  overflow-y: scroll;
	opacity:100%;
  height: 200px;
  border-radius:5px;
}

</style>

<header>
  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-light fixed-top mask-custom shadow-0">
    <div class="container">
      <a class="navbar-brand" href="#!"><span style="color: #5e9693;">Library</span><span style="color: #fff;">WebApp</span></a>
      <button class="navbar-toggler" type="button" data-mdb-toggle="collapse"
        data-mdb-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
        aria-label="Toggle navigation">
        <i class="fas fa-bars"></i>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto">
          <li class="nav-item">
            <a class="nav-link" href="#!">Log Out</a>
          </li>
        </ul>
        <ul class="navbar-nav d-flex flex-row">
          <li class="nav-item me-3 me-lg-0">
            <a class="nav-link" href="#!">
              <i class="fas fa-shopping-cart"></i>
            </a>
          </li>
          <li class="nav-item me-3 me-lg-0">
            <a class="nav-link" href="#!">
              <i class="fab fa-twitter"></i>
            </a>
          </li>
          <li class="nav-item me-3 me-lg-0">
            <a class="nav-link" href="#!">
              <i class="fab fa-instagram"></i>
            </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <!-- Navbar -->

  <!--Section: Design Block-->
  <section>
    <!-- Intro -->
    <div id="intro" class="bg-image vh-100" style="
          background-image: url('books.jpg');
        ">
      <div class="mask" style="background-color: rgba(250, 182, 162, 0.15);"></div>
    </div>
    <!-- Intro -->
  </section>
  <!--Section: Design Block-->
</header>
	<div class="container mt-5" id ="InterpreterDiv">
		<h1>Espace Administrateur.</h1>
		<form id="interpreter-form" action="interpreter">
			<div class="form-group d-flex">
  <label for="input" class="mr-2 align-self-center">Enter command:</label>
  <input type="text" name="input" id="input" class="form-control mr-2 align-self-center">
  <button type="submit" class="btn btn-primary align-self-center">Submit</button>
</div>

		</form>
		<div id="result" class="mt-3"></div>
	</div>
	
	<!-- Include jQuery and Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	
	<script>
		// Submit form data using AJAX
		$('#interpreter-form').submit(function(event) {
			event.preventDefault(); // Prevent page refresh on form submission
			var form = $(this);
			var url = form.attr('action');
			const now = new Date();
			$.ajax({
				type: 'GET',
				url: url,
				data: form.serialize(), // Serialize form data for submission
				success: function(result) {
					var result2= result.split("\n");
					Swal.fire({
						  title:result2[0],
						  text: result2[1],
						  icon: result2[2],
						  confirmButtonText: 'OK'
						});
					now.setHours(now.getHours() + 1);
				    $('#result').append('<p>'+now.toLocaleTimeString()+':' + result2[2] + '</p>'); // Append result to #result div

				    var resultDiv = document.getElementById("result");
				    resultDiv.scrollTop = resultDiv.scrollHeight; // Scroll to bottom of #result div
				},
				error: function() {
					alert('Error submitting form!'); 
				}
			});
		});
	</script>
</body>
</html>
