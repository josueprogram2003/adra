<%-- 
    Document   : index
    Created on : 9 jul. 2021, 18:17:40
    Author     : dreyna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css" />
        <link rel="stylesheet" href="recursos/css/style.css" />
    </head>
    <body>
        <div class="container-fluid h-100">
            <section class="row h-100">
                <!-- Imagen 7 columnas -->
                <article
                    class="col d-none d-md-flex align-items-center justify-content-center"
                    >
                    <img class="w-100" src="recursos/assets/img/login_ayuda_Adra.png" alt="" />
                </article>
                <!-- Login 5 columnas -->
                <article
                    class="
                    col-12 col-sm-12 col-md-7 col-lg-6 col-xl-5
                    d-flex
                    justify-content-center
                    align-items-center
                    "
                    >
                    <div class="w-75">
                        <!-- Imagen del login -->
                        <div class="d-flex justify-content-center img__login">
                            <img src="recursos/assets/img/adra.png" alt="" />
                        </div>
                        <!-- Formulario -->
                        <form class="container-fluid color_adra pb-3 pd__top" method="post" action="cuenta">
                            <div class="row">
                                <!-- Cabezera -->
                                <div class="col-12 mb-3">
                                    <header class="h6 text-center text-white">
                                        Programa de capacitaciones
                                    </header>
                                    <p class="h2 text-center text-white">2021</p>
                                </div>
                            </div>
                            <!-- Campos -->
                            <div class="row pl-5 pr-5 mb-5">
                                <div class="col-12 input-group">
                                    <input
                                        type="text"
                                        class="
                                        form-control
                                        rounded-0
                                        color_adra
                                        border__b
                                        icon__user__login
                                        "
                                        placeholder="Usuario"
                                        id="user"
                                        name="user"
                                        aria-label="Username"
                                        />
                                </div>

                                <div class="col-12 input-group mb-4">
                                    <input
                                        type="password"
                                        class="
                                        form-control
                                        rounded-0
                                        color_adra
                                        border__b
                                        icon__lock__login
                                        "
                                        placeholder="password"
                                        id="pass"
                                        name="pass"
                                        />
                                </div>
                                <!-- boton -->
                                <div class="col-12 mb-2 d-flex justify-content-center">
                                    <input
                                        class="btn bg_btn text-white w-75"
                                        type="submit"
                                        value="Iniciar Sesión">

                                </div>

                                <div class="col-12 mb-2 text-center">
                                    <a class="text-white" href="./recursos/html/crear_user.html"
                                       >¿No tienes una cuenta? Creala aqui</a
                                    >
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-12 w-100 d-flex flex-row justify-content-end">
                                    <div class="size__card mr-3">
                                        <img
                                            class="size__img"
                                            src="./recursos/assets/img/facebook.png"
                                            alt=""
                                            />
                                    </div>
                                    <div class="mr-3 size__card">
                                        <img
                                            class="size__img"
                                            src="./recursos/assets/img/youtube.png"
                                            alt=""
                                            />
                                    </div>
                                    <div class="size__card mr-3">
                                        <img
                                            class="size__img"
                                            src="./recursos/assets/img/email.png"
                                            alt=""
                                            />
                                    </div>
                                    <div class="size__card mr-3">
                                        <img
                                            class="size__img"
                                            src="./recursos/assets/img/instagram.png"
                                            alt=""
                                            />
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </article>
            </section>
        </div>
        <script src="recursos/js/jquery.js"></script>
        <script src="recursos/js/bootstrap.min.js"></script>
        <script src="recursos/js/login.js"></script>
    </body>
</html>
