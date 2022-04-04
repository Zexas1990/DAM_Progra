function contraseña(){

    alert("¡BIENVENIDO A NUESTRA PAGINA WEB!");

    var truepass = "1234";
    var pass;
    var texto = "Introduce la contraseña";
    pass = prompt(texto);

    while(pass != truepass){
        
        alert("Contraseña incorrecta");
        pass = prompt(texto);
        
    }

}


function irse(){
    
        alert("¡No se vaya de nuestra pagina!");
    
}

function despedirse(){
    
        alert("¡Hasta luego!");
    
}