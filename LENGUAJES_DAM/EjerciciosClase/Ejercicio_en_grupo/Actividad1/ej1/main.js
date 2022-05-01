// longitud del radio y calcule el
// tamaño de la circunferencia, el área del círculo y el volumen de una esfera.
// Acompaña los cálculos con imágenes de circunferencia, círculo y esfera.

function calcularRadio() {

    if (document.getElementById("radio").value != "") {
        r = document.getElementById("radio").value;
        c = 2 * Math.PI * r;
        a = Math.PI * r * r;
        v = (4 / 3) * Math.PI * r * r * r; // es igual a 4/3 por PI por el radio al cubo
        document.getElementById("result01").innerHTML = "<p>"+ Math.round(c) + "" + "cm de circunferencia </p>";
        document.getElementById("result02").innerHTML = "<p>"+ Math.round(a) + "" + "cm del área </p>";
        document.getElementById("result03").innerHTML = "<p>"+ Math.round(v) + "" + "cm del volumen </p>";
        
        if (c > 0) {
            document.getElementById("img01").innerHTML = "<img src='https://i.pinimg.com/originals/37/3e/14/373e1478fe580cc14e6868170d51b36c.png' width='200' height='200'>"; 
        }
        
        if (a > 0) {
            document.getElementById("img02").innerHTML = "<img src='https://www.neurochispas.com/wp-content/uploads/2021/03/formula-de-area-de-un-rectangulo.png' width='200' height='200'>"; 
        }

        if (v > 0) {
            document.getElementById("img03").innerHTML = "<img src='https://www.neurochispas.com/wp-content/uploads/2021/04/formula-del-volumen-de-una-esfera.png' width='200' height='200'>";
    }
}
}

