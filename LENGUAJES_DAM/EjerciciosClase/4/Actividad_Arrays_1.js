function Nombres(){

    var nombre;
    var listaNombres = [];
    var regex = /^[a-zA-Z]+$/;
    var valNoVal = true;

    alert ("Escriba los nombres");

while(valNoVal){

    nombre = prompt("Ingrese su nombre");

    if(regex.test(nombre)){
        
        listaNombres.push(nombre);

    }else{
        alert("Solo puede introducir letras");
        
    }

    if(nombre == "Maria"){
        valNoVal = false;
    }

    
}

document.write("<table border=5>")
for (var i = 0; i < listaNombres.length; i++) {
    document.write("<tr><td>" + listaNombres[i] + "</td></tr>")
}
document.write("</table>")





}
