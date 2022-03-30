
function Multiplicar(){

    var num1 = prompt("Introduzca un número");
    var num2 = prompt("Introduzca otro número");
    var resultado = num1 * num2;
    
    document.write("<br>");
    document.write("<h1>El resultado de la multiplicación es: " + resultado+ "</h1>");
}




function Mayor(){
    
    var num1 = prompt("Introduzca un número");
    var num2 = prompt("Introduzca otro número");
    
    if(num1 > num2){
        document.write("<br>");
        document.write("<h1> El número " + num1 + " es mayor que " + num2 + "</h1>");
    }
    else if(num1 < num2){
        document.write("<br>");
        document.write("<h1> El número " + num2 + " es mayor que " + num1 + "</h1>");
    }
    else{
        document.write("<br>");
        document.write("<h1>Los números son iguales </h1>");
    }
    
}



function Cabecera(){
    
    var text1 = prompt("Introduzca un texto");
    var num1 = prompt("Introduzca un número");
    
    document.write("<br>");
    document.write("<h"+ num1 + ">" + text1 + "</h"+ num1 + ">");
}





