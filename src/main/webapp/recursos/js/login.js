$(document).ready(function () {});

$("#limpiar").on("click",function(e){
	e.preventDefault();
	limpiar();
});

const limpiar = () => {
  $("#user").val("");
  $("#pass").val("");
};
