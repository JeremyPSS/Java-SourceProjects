package Entidades;

/**
 * @date 07/04/2021
 * @author Jeremy Prieto
 */
public class Categoria {
    private int IdCategoria;
    private String Categorias;
    private String Descripcion;

    public Categoria() {
    }

    public Categoria(int IdCategoria, String Categorias, String Descripcion) {
        this.IdCategoria = IdCategoria;
        this.Categorias = Categorias;
        this.Descripcion = Descripcion;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getCategorias() {
        return Categorias;
    }

    public void setCategorias(String Categorias) {
        this.Categorias = Categorias;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
    
}
