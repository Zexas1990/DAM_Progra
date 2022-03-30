//Rehaz el scripts anterior para que solicite 
// por pantalla el nombre, el apellido y tu 
// edad, en vez de ponérselo directamente en 
// el código. 

//▪ Para finalizar muestra un mensaje de 
// “Muchas Gracias, ¿desea continuar?”. Si 
// pulsa Aceptar, muestra otro mensaje que 
// diga “Esto es todo amigos!!”, si pulsa 
// Cancelar, muestra otro mensaje que diga 
// “Se acabó!”


var nombre = prompt("Introduzca su nombre","Nombre");

var apellido = prompt("Introduzca su apellido","Apellido");

var edad = prompt("Introduzca su edad","Edad");

alert("Muchas gracias");



if(confirm("¿Desea continuar?")){
    alert("Esto es todo amigos");
}
else{
    alert("Se acabo")
};
