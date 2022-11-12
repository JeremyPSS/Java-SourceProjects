package Entidades;

/**
 * @date 05/04/2021
 * @author Jeremy Prieto
 * -----OBJETO----- 
 */
public class Proveedor {
    //No importa si en la tabla de datos no tienen los mismos nombres, basta que sean el mismo tipo de datos;
    private int Codigo;
    private String Cedula;
    private String NomProveedor;
    private String RepProveedor;
    private String DirProveedor;
    private String CiuProveedor;
    private String TelProveedor;
    private String FaxProveedor;

    public Proveedor() {
    }

    public Proveedor(int Codigo, String Cedula, String NomProveedor, String RepProveedor, String DirProveedor, String CiuProveedor, String TelProveedor, String FaxProveedor) {
        this.Codigo = Codigo;
        this.Cedula = Cedula;
        this.NomProveedor = NomProveedor;
        this.RepProveedor = RepProveedor;
        this.DirProveedor = DirProveedor;
        this.CiuProveedor = CiuProveedor;
        this.TelProveedor = TelProveedor;
        this.FaxProveedor = FaxProveedor;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNomProveedor() {
        return NomProveedor;
    }

    public void setNomProveedor(String NomProveedor) {
        this.NomProveedor = NomProveedor;
    }

    public String getRepProveedor() {
        return RepProveedor;
    }

    public void setRepProveedor(String RepProveedor) {
        this.RepProveedor = RepProveedor;
    }

    public String getDirProveedor() {
        return DirProveedor;
    }

    public void setDirProveedor(String DirProveedor) {
        this.DirProveedor = DirProveedor;
    }

    public String getCiuProveedor() {
        return CiuProveedor;
    }

    public void setCiuProveedor(String CiuProveedor) {
        this.CiuProveedor = CiuProveedor;
    }

    public String getTelProveedor() {
        return TelProveedor;
    }

    public void setTelProveedor(String TelProveedor) {
        this.TelProveedor = TelProveedor;
    }

    public String getFaxProveedor() {
        return FaxProveedor;
    }

    public void setFaxProveedor(String FaxProveedor) {
        this.FaxProveedor = FaxProveedor;
    }
    
    
    
    
}
