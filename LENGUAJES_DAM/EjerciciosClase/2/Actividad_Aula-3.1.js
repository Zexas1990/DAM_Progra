function Contraseña(){

    var truepass = "1234abc456";
    var pass;
    var bucle = true;

    while(bucle){
        pass = prompt("Introduce la contraseña");

        if(pass == truepass){
            document.write("<br>");
            document.write("<h1>Contraseña correcta</h1>");
            bucle = false;
        }
        else{

            alert("Contraseña incorrecta");
        
        }
    }

    


}

function euro1(){

    var euro = prompt("Introduce una cantidad en euros");
    var pesetas = euro * 166.386;
    document.write("<br>");
    document.write("<h1>La cantidad en pesetas es: " + pesetas.toFixed(2) + "</h1>");
    
}

function euro2(){

    var pesetas = prompt("Introduce una cantidad en pesetas");
    var euro = pesetas / 166.386;
    document.write("<br>");
    document.write("<h1>La cantidad en euros es: " + euro.toFixed(2) + "</h1>");
    
}

function tabla(){
    
        var numero = prompt("Introduce un número");
        var i = 1;
        var resultado = 0;

        document.write("<table border = 1>")
        document.write("<tr><td>Tabla del " + numero + "</tr>");
        
        while(i <= 10){
            resultado = i*numero;
            document.write("<tr><td>" + numero + " x " + i + " = " + resultado + "</td></tr>");
            i++;
        }

        document.write("</table>")
    
}

