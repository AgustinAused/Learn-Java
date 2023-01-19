

function validarForm(form) {
    let usuario = form.usuario;
    if(usuario.value === "" ){
        alert("Debe Proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    let password = form.password;
    if(password.value === "" || password.value.length < 6){
        alert("Debe Proporcionar una contraseña mayor de 6 caracteres");
        password.focus();
        password.select();
        return false;
    }
    let tecnologias = form.tecnologias;
    let checkSeleccionado = false;
    for(let i = 0; i < tecnologias.length; i++){
        if (tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado){
        alert("Debe seleccionar una tecnologia");
        return false;
    }

    let generos = form.genero;
    let radioSelecionado = false;
    for(let i = 0; i < generos.length; i++ ){
        if (generos[i].checked){
            radioSelecionado = true;
        }
    }
    if (!radioSelecionado){
        alert("Debe seleccionar un genero");
        return false;
    }
    let ocupacion = form.ocupacion;
    if(ocupacion.value === ""){
        alert("Debe ingresar una ocupacion");
        return false;
    } 

    alert("Fromulado Valido, Enviado datos al servidor");
    return true;
}