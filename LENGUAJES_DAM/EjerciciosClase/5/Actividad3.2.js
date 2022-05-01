function registro() {
    setTimeout(cerrar, 3000) 
    var ventana = window.open("VentanaExtra.html", "Datos")

    function cerrar() {
        ventana.close()
    }
}
