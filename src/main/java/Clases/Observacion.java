
package Clases;

public class Observacion {
    private String fecha;
    private float tempMax;
    private float tempMin;
    private float precipitacion;
    private float mediaViento;
    private float evapor;
    private String nombreEstacion;

    public Observacion(String fecha, float tempMax, float tempMin, float precipitacion, float mediaViento, float evapor, String nombreEstacion) {
        this.fecha = fecha;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.precipitacion = precipitacion;
        this.mediaViento = mediaViento;
        this.evapor = evapor;
        this.nombreEstacion = nombreEstacion;
    }

    public String getFecha() {
        return fecha;
    }

    public float getTempMax() {
        return tempMax;
    }

    public float getTempMin() {
        return tempMin;
    }

    public float getPrecipitacion() {
        return precipitacion;
    }

    public float getMediaViento() {
        return mediaViento;
    }

    public float getEvapor() {
        return evapor;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }
    
    
}
