 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            font-family: Arial, Helvetica, sans-serif;
        }
table {
                border-collapse: collapse;
                width: 100%;
            }
            th, td {
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even){background-color: #f2f2f2}
            th {
                background-color: #4CAF50;
                color: white;
            }
        /* Style the header */
        header {
            background-color: rgb(4, 100, 92);
            padding: 20px;
            text-align: center;
            font-size: 15px;
            color: black;
        }

        /* Create two columns/boxes that floats next to each other */
        nav {
            float: left;
            width: 20%;
            height: 500px;
            background: rgb(147, 238, 230);
            padding: 20px;
        }

        /* Style the list inside the menu */
        nav ul {
            list-style-type: none;
            padding: 0;
        }

        article {
            float: left;
            padding: 20px;
            width: 80%;
            background-color: #f1f1f1;
            height: 500px;
        }

        /* Clear floats after the columns */
        section:after {
            content: "";
            display: table;
            clear: both;
        }

        /* Style the footer */
        footer {
            background-color: rgb(4, 100, 92);
            padding: 10px;
            text-align: Right;
            color: black;
        }

        /* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
        @media (max-width: 600px) {

            nav,
            article {
                width: 100%;
                height: auto;
            }
        }
    </style>
</head>

<body>
    <header>
        <h2>Admin Login</h2>
    </header>

    
    <section>
        <nav>
            <ul>
                 <br/>
                <li> <a href="list_admin" >List Admin</a></li>
                 <br/>
                <li><a href="list_patient" >List Patient</a></li>
                 <br/>
                <li><a href="list_doctor" >List Doctor</a></li>
                 <br/>
                <li><a href="list_drags" >List Drags</a></li>
                 <br/>
                <li><a href="list_dosage" >List Dosage</a></li>
                 <br/>
                
            </ul>
        </nav>

        <article>
            <h1>Help your patient</h1>
            
            
             <form method="post" name="patient" action="add_patient">

                    Doctor Id:  <br>
                    <input type="text" name="doctorId" placeholder="Drages Name">
                    <br><br>
                    Drags Id :<br>
                    <input type="text" name="dragsId" placeholder="Drages Name">
                    <br><br>
                    Dosage Id :<br>
                    <input type="text" name="dosageId" placeholder="Drages Name">
                    <br><br>
                    Name :<br>
                    <input type="text" name="name" placeholder="Drages Name">
                    <br><br>
                    
                    gender :<br>
                    <input type="text" name="gender" placeholder="Drages Name">
                    <br><br>
                    userName :<br>
                    <input type="text" name="userName" placeholder="Drages Name">
                    <br><br>
                    password :<br>
                    <input type="text" name="password" placeholder="Drages Name">
                    <br><br>
                    <input type="submit" value="Submit">
                </form>      
            
   <br/>  
        </article>
    </section>

    <footer class="footer">
        <section class="navbar">
            <a href="#">career</a>
            <a href="#">Contact us</a>
            <a href="#">Feedback</a>
            
        </section>
    </footer>

</body>

</html>