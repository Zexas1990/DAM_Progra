
function email(){

    var email;
    var bucle = true;
    var texto = "Introduce un email";
    
    while (bucle){

        email = prompt(texto);

        if (email.indexOf("@") != -1 && email.indexOf(".") != -1){
            alert("Gracias el email: " + email + " es valido");
            break;
        }
        else{
            alert("El emai es invalido, como Clarita");
            texto = "Vuelve a introducir el email";
        }
    }

}