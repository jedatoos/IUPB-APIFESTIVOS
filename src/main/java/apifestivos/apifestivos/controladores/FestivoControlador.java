package apifestivos.apifestivos.controladores;

import java.sql.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import apifestivos.apifestivos.servicios.interfaces.IFestivoServicio;

@RestController
@RequestMapping("/festivos") 
public class FestivoControlador {
    @Autowired
    private IFestivoServicio servicio;

    @CrossOrigin(origins = "*")
     @RequestMapping(value = "/verificar/{año}/{mes}/{dia}", method = RequestMethod.GET)
    public String verificarFestivo(@PathVariable int año, @PathVariable int mes, @PathVariable int dia){
        if(servicio.esFechaValida(String.valueOf(año) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia))){
            Date fecha=new Date(año - 1990, mes -1, dia);
            return servicio.esFestivo(fecha) ? "Es Festivo" : "No es Festivo";
        }else{
            return "Fecha No valida";
        }
    }
}
