package Entidades;

/**
 * @date 07/04/2021
 * @author Jeremy Prieto
 */
public class Transportista {
    private int IdTransportista;
    private String CedTransportista;
    private String NomTransportista;
    private String DirTransportista;
    private String CiuTransportista;
    private String TelTransportista;

    public Transportista() {
    }

    public Transportista(int IdTransportista, String CedTransportista, String NomTransportista, String DirTransportista, String CiuTransportista, String TelTransportista) {
        this.IdTransportista = IdTransportista;
        this.CedTransportista = CedTransportista;
        this.NomTransportista = NomTransportista;
        this.DirTransportista = DirTransportista;
        this.CiuTransportista = CiuTransportista;
        this.TelTransportista = TelTransportista;
    }

    public int getIdTransportista() {
        return IdTransportista;
    }

    public void setIdTransportista(int IdTransportista) {
        this.IdTransportista = IdTransportista;
    }

    public String getCedTransportista() {
        return CedTransportista;
    }

    public void setCedTransportista(String CedTransportista) {
        this.CedTransportista = CedTransportista;
    }

    public String getNomTransportista() {
        return NomTransportista;
    }

    public void setNomTransportista(String NomTransportista) {
        this.NomTransportista = NomTransportista;
    }

    public String getDirTransportista() {
        return DirTransportista;
    }

    public void setDirTransportista(String DirTransportista) {
        this.DirTransportista = DirTransportista;
    }

    public String getCiuTransportista() {
        return CiuTransportista;
    }

    public void setCiuTransportista(String CiuTransportista) {
        this.CiuTransportista = CiuTransportista;
    }

    public String getTelTransportista() {
        return TelTransportista;
    }

    public void setTelTransportista(String TelTransportista) {
        this.TelTransportista = TelTransportista;
    }
    
    
    
    
}
