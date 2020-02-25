/*
Escribe una aplicación donde:
1.	Se cree un objeto de tipo ListaMultimedia de tamaño máximo 20.
2.	Se creen tres discos y se añadan a la lista.
3.	Se muestre la lista por pantalla.
4.	Se cree un objeto de tipo Disco, introduciendo el título y el autor de uno de los elementos de la lista. Para el resto de los argumentos se utilizan valores no significativos.

 */
package SEMANA_04;

/**
 *
 * @author Vladimir
 */
public abstract class Disco {
    protected String titulo;
    protected String autor;

    public Disco(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

     public String disco() {
        return "titulo :"+titulo+"\nautor :"+autor;
    }
    
}
