$(document).ready(function () {
	listar();
});

function listar (){
	alert("sdsd");
	$.get("pc",function (data) {
		alert(data);
		//let info = JSON.parse(data);
		///console.log(data);	
		//JSON.parse(data);
		
	});	
}

$("#guardar").on("click", function (e) {
  e.preventDefault();
  alert("Agregar");
 	$.get("pc", { "area": $("#nombre").val() , "opc": 1 }, function (data) {
		alert(data);
  });
});



