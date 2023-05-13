<%@ page import="Abbah.Ahmed.Document" %>
<%@ page import="java.util.*" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administrateur</title>
    <!-- ======= Styles ====== -->
    <link rel="stylesheet" href="assets2/css/style.css">
	
	<!-- Include SweetAlert CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sweetalert2@11.0.17/dist/sweetalert2.min.css">

<!-- Include SweetAlert JS -->
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.0.17/dist/sweetalert2.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

</head>

<body>
    <!-- =============== Navigation ================ -->
    <div class="container">
        <div class="navigation">
            <ul>
                <li>
                    <a href="#">
                        <!-- <span class="icon">
                            <ion-icon name="logo-apple"></ion-icon>
                        </span> -->
                        <span class="title">BiblioTech</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="home-outline"></ion-icon>
                        </span>
                        <span class="title">Tableau de Bord</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Clients</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="chatbubble-outline"></ion-icon>
                        </span>
                        <span class="title">Messages</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="help-outline"></ion-icon>
                        </span>
                        <span class="title">Help</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="settings-outline"></ion-icon>
                        </span>
                        <span class="title">Settings</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="lock-closed-outline"></ion-icon>
                        </span>
                        <span class="title">Password</span>
                    </a>
                </li>

                <li>
		<form method="POST">
		  <a href	="logout">
        <span class="icon">
            <ion-icon name="log-out-outline"></ion-icon>
        </span>
        <span class="title">Sign Out</span>
    </a>
		</form>
              

    
</li>

            </ul>
        </div>

        <!-- ========================= Main ==================== -->
        <div class="main">
            <div class="topbar">
                <div class="toggle">
                    <ion-icon name="menu-outline"></ion-icon>
                </div>

                <div class="search">
                    <label>
                    <form action="interpreter" id="interpreter-form">
                    	<input type="text" name="input" id="input" class="form-control mr-2 align-self-center" placeholder="Search here" style="width:700px;">
                    	
                        <ion-icon name="search-outline"></ion-icon>
                        
                    </form>
                    
					

                    <!-- Include jQuery and Bootstrap JS -->
	
	
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
					var result2 = result.split("\n");
					var htmlContent = "";
					for (var i = 0; i < result2.length; i++) {
					  htmlContent += result2[i] + "<br><br>";
					}

					if (result2[0] == "recherche des documents") {
					    Swal.fire({
					        title:result2.length-3 + " R�sultats trouv�",
					        html: htmlContent,
					        icon: result2[2],
					        confirmButtonText: 'OK'
					    });
					} else if(result2[0] == "Document Added !") {
					    Swal.fire({
					        title:result2[0],
					        text: result2[1],
					        icon:result2[2],
					        confirmButtonText: 'OK'
					    });
					} else if(result2[0] == "Document Added !") {
					    Swal.fire({
					        title:result2[0],
					        text: result2[1],
					        icon:result2[2],
					        confirmButtonText: 'OK'
					    });
					} else if(result2[0] == "Client Added !") {
					    Swal.fire({
					        title:result2[0],
					        text: result2[1],
					        icon:result2[2],
					        confirmButtonText: 'OK'
					    });
					}

					now.setHours(now.getHours() + 1);
				    $('#result').append('<p>'+now.toLocaleTimeString()+':' + result2[0] + '</p>'); // Append result to #result div
				    $('#clientTable').append(result2); 
				    var resultDiv = document.getElementById("result");
				    resultDiv.scrollTop = resultDiv.scrollHeight; // Scroll to bottom of #result div
				},
				error: function() {
					alert('Error submitting form!'); 
				}
			});
		});
		
		$(document).ready(function() {
			  $('#show-log').click(function() {
			    $('#result').slideToggle();
			  });
			});


	</script>
      <style>
      #result {
  position: fixed;
  bottom: 0;
  right: 0;
  z-index: 9999;
  display: none;
  width: 300px;
  height: 200px;
  overflow: scroll;
  background-color: #333;
  color: #fff;
  font-family: monospace;
  font-size: 14px;
  padding: 10px;
  border-radius:5px;
}
      
      
      </style>                  
                    </label>
                    <button id="show-log">Show Log</button>

					<div id="result" class="mt-3" style="display:none;"></div>
                </div>

                <div class="user">
 
                </div><div class="user">
 
                </div><div class="user">
 
                </div>	
            </div>

            <!-- ======================= Cards ================== -->
         <div class="cardBox">
                <div class="card">
                    <div>
                        <div class="numbers">10</div>
                        <div class="cardName">Clients</div>
                    </div>

                    <div class="iconBx">
                        <ion-icon name="people-outline"></ion-icon>
                    </div>
                </div>

                <div class="card">
                <div class="user">
<%--  <% System.out.println("Connected Client :"+request.getSession().getAttribute("user")); %>
 --%>                </div>	
                <div class="user">
 
                </div>	
                    <div>
                        <div class="numbers">50</div>
                        <div class="cardName">Documents</div>
                    </div>

                    <div class="iconBx">
                        <ion-icon name="cart-outline"></ion-icon>
                    </div>
                </div>

             
            </div>

            <!-- ================ Order Details List ================= -->
            <div class="details">
                <div class="recentOrders">
                    <div class="cardHeader">
                        <h2>Liste des Documents Ajout�</h2>
                        <a href="#" class="btn">View All</a>
                    </div>

                    <table>
                        <thead>
                            <tr>
                            <td>Document ID</td>
                                <td>Titre</td>
                                <td>Auteur</td>
                                <td>Categorie</td>
                                <td>Synopsis</td>
                            </tr>
                        </thead>

                        <tbody>
                           
                            <%
          List<Document> documents = (List<Document>) request.getAttribute("documents");
          for (Document document : documents) {
        %>
        <tr>
          <td><%= document.getIdDocument() %></td>
          <td><%= document.getTitre() %></td>
          <td><%= document.getAuteur() %></td>
          <td><%= document.getCategorie() %></td>
          <td><%= document.getSynopsis() %></td>
        </tr>
        <% } %>
                        </tbody>
                    </table>
                </div>

                
                
            </div>
        </div>
    </div>

    <!-- =========== Scripts =========  -->
    <script src="assets/js/main.js"></script>

    <!-- ====== ionicons ======= -->
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>

</html>