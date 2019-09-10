/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validarFormulario(forma)
{
    var usuario = forma.usuario;  //nombre del componente en HTML
    if (usuario=="")
    {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return falseñ
    }
    
    var password = forma.password;
     if (password=="" || password.value.length <8)
    {
        alert("Debe proporcionar una contrasena de al menos 8 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
     var tecnologias = forma.tecnologia;
     var checkSeleccionado = false;
     
     //revisamos que por lo menos un check haya sido seleccionado.
     
     for(i=0; i<tecnologias.length; i++)
     {
         if(tecnologias[i].checked)
         {
             checkSeleccionado = true;
         }
     }
     
     if(!checkSeleccionado)
     {
         alert("Debe seleccionar por lo menos una tecnologia");
         return false;
     }
     
     var genero = forma.genero;
     var seleccionGenero = false;
     
     for(i=0;i<genero.length;i++)
     {
         if (genero[i].checked)
         {
             seleccionGenero = true;
         }
     }
     
     if(!seleccionGenero)
     {
         alert("Debera seleccionar un genero obligatoriamente");
         return false;
     }
     
     var ocupacion = forma.ocupacion;
     if(ocupacion.value=="seleccionar")
     {
         alert("Debera seleccionar una ocupacion");
         return false;
     }
     
     
     alert("Enviando formulario");
     return true;
     
     
}

