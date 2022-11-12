package Entidades;

/**
 * @date 07/04/2021
 * @author Jeremy Prieto
 */
public class Local {
    private int IdLocal;
    private String DirLocal;
    private String FaxLocal;
    private String TelLocal;
    private String CiuLocal;

    public Local() {
    }

    public Local(int IdLocal, String DirLocal, String FaxLocal, String TelLocal, String CiuLocal) {
        this.IdLocal = IdLocal;
        this.DirLocal = DirLocal;
        this.FaxLocal = FaxLocal;
        this.TelLocal = TelLocal;
        this.CiuLocal = CiuLocal;
    }

    public int getIdLocal() {
        return IdLocal;
    }

    public void setIdLocal(int IdLocal) {
        this.IdLocal = IdLocal;
    }

    public String getDirLocal() {
        return DirLocal;
    }

    public void setDirLocal(String DirLocal) {
        this.DirLocal = DirLocal;
    }

    public String getFaxLocal() {
        return FaxLocal;
    }

    public void setFaxLocal(String FaxLocal) {
        this.FaxLocal = FaxLocal;
    }

    public String getTelLocal() {
        return TelLocal;
    }

    public void setTelLocal(String TelLocal) {
        this.TelLocal = TelLocal;
    }

    public String getCiuLocal() {
        return CiuLocal;
    }

    public void setCiuLocal(String CiuLocal) {
        this.CiuLocal = CiuLocal;
    }
        
}
