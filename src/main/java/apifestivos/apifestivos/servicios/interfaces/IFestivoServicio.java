package apifestivos.apifestivos.servicios.interfaces;

import java.util.Date;
import java.util.List;




public interface IFestivoServicio {

    public List<FestivoDto> obtenerFestivos(int año);

    public boolean esFestivo(Date fecha);

    public boolean esFechaValida(String strFecha);

    
} 
