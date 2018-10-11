/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodificador;

/**
 *
 * @author Jean
 */
public class MensajeTipo1 {
    private byte param;
    private byte deviceId;
    private byte analog1;
    private byte analog2;
    private byte fecha;
    private byte estado;
    private byte latitud;
    private byte longitud;
    private byte velocidad;
    private byte rumbo;
    private byte hora;
    private byte altitud;
    
    public MensajeTipo1(){
    }    
    public void setHeader(byte header) {
        this.header = header;
    }

    public void setParam(byte param) {
        this.param = param;
    }

    public void setDeviceId(byte deviceId) {
        this.deviceId = deviceId;
    }

    public void setAnalog1(byte analog1) {
        this.analog1 = analog1;
    }

    public void setAnalog2(byte analog2) {
        this.analog2 = analog2;
    }

    public void setFecha(byte fecha) {
        this.fecha = fecha;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public void setLatitud(byte latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(byte longitud) {
        this.longitud = longitud;
    }

    public void setVelocidad(byte velocidad) {
        this.velocidad = velocidad;
    }

    public void setRumbo(byte rumbo) {
        this.rumbo = rumbo;
    }

    public void setHora(byte hora) {
        this.hora = hora;
    }

    public void setAltitud(byte altitud) {
        this.altitud = altitud;
    }
    
    private byte header;

    public byte getHeader() {
        return header;
    }

    public byte getParam() {
        return param;
    }

    public byte getDeviceId() {
        return deviceId;
    }

    public byte getAnalog1() {
        return analog1;
    }

    public byte getAnalog2() {
        return analog2;
    }

    public byte getFecha() {
        return fecha;
    }

    public byte getEstado() {
        return estado;
    }

    public byte getLatitud() {
        return latitud;
    }

    public byte getLongitud() {
        return longitud;
    }

    public byte getVelocidad() {
        return velocidad;
    }

    public byte getRumbo() {
        return rumbo;
    }

    public byte getHora() {
        return hora;
    }

    public byte getAltitud() {
        return altitud;
    }
    @Override
    public String toString() {
        return "MensajeTipo1{" + "param=" + param + ", deviceId=" + deviceId + ", analog1=" + analog1 + ", analog2=" + analog2 + ", fecha=" + fecha + ", estado=" + estado + ", latitud=" + latitud + ", longitud=" + longitud + ", velocidad=" + velocidad + ", rumbo=" + rumbo + ", hora=" + hora + ", altitud=" + altitud + ", header=" + header + '}';
    }
}
