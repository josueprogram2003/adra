<%-- 
    Document   : menu_asesor
    Created on : 9 jul. 2021, 18:24:43
    Author     : dreyna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../recursos/css/bootstrap.min.css" />
        <link rel="stylesheet" href="../recursos/css/menu.css">
    </head>
    <body>
  <nav class="navbar navbar-expand-md navbar-light size__nav">
    <div class="container-fluid p-3">
        <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNav"
            aria-controls="navbarNav"
            aria-expanded="false"
            aria-label="Toggle navigation"
            >
            <span class="navbar-toggler-icon"></span>
        </button>
        <div
            class="collapse navbar-collapse nav_container p-2 w-100"
            id="navbarNav"
            >
            <ul class="navbar-nav w-100">
                <li class="nav-item querys__nav border__right">
                    <a
                        class="nav-link text-white h4 d-block w-100 h-100 text-center"
                        aria-current="page"
                        href="#"
                        target="iframe"
                        >Inicio</a
                    >
                </li>
                <li
                    class="nav-item querys__nav border__right cursor"
                    id="area"
                    target=""
                    >
                    <a
                        class="nav-link text-white h4 d-block w-100 h-100 text-center"
                        href="#"
                        id="area"
                        target="iframe"
                        >Area</a
                    >
                </li>
                <li
                    class="
                    nav-item
                    querys__nav
                    d-flex
                    justify-content-center
                    position-relative
                    border__right
                    "
                    >
                    <a
                        class="nav-link text-white h4 position-absolute position-img"
                        href="menu_asesor.jsp"
                        ><img class="img__nav" src="../recursos/assets/img/adra.png" alt=""
                          /></a>
                </li>
                <li class="border__right nav-item querys__nav">
                    <a
                        class="nav-link text-white h4 d-block w-100 h-100 text-center"
                        href="#"
                        target="iframe"
                        >Cursos</a
                    >
                </li>
                <li class="nav-item querys__nav h-100">
                    <div class="nav-link h-100 d-flex justify-content-center">
                        <p class="text-white h4 d-block w-100 h-100 text-center">
                            <%= session.getAttribute("nombres")%>
                        </p>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Contenido Principal -->
<main class="w-100 size_contenido px-2 pt-3 pb-1">
    <div class="h-100 w-100 br__main p-2">
        <iframe
            name="iframe"
            class="w-100 h-100 border-0"
            src="../views/inicio.jsp"
            id="ventana"
            ></iframe>
    </div>
</main>

<footer class="footer__size w-100">
    <p
        class="
        d-flex
        justify-content-end
        align-items-center
        h-100
        text-white
        px-4
        "
        >
        Copyright, ADRA, 2021, todos los derechos reservados
    </p>
</footer>

<!-- Scripts -->
<script src="../recursos/js/jquery.js"></script>
<script src="../recursos/js/bootstrap.min.js"></script>
<script src="../recursos/js/menu.js"></script>
</body>
</html>
