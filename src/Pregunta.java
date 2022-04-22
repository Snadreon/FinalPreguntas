import java.util.List;
import java.util.Scanner;

public class Pregunta {
    private static final String letras = "abcdefghijklmnñopqrstuvwxyz";
    private String idPregunta;
    private Categoria categoria;
    private Ronda ronda;
    private String pregunta;
        private List<Respuestas> respuestas;

    public Pregunta( String pregunta, List<Respuestas> respuestas) {

        this.pregunta = pregunta;
        this.respuestas = respuestas;

    }

    public String getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(String idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Ronda getRonda() {
        return ronda;
    }

    public void setRonda(Ronda ronda) {
        this.ronda = ronda;
    }

       public Respuestas getRespuestas() {
        return (Respuestas) respuestas;
    }

    public void setRespuestas(Respuestas respuestas) {
        this.respuestas = (List<Respuestas>) respuestas;
    }

    public void agregarRespuestas (Respuestas respuestas){

        this.respuestas.add(respuestas);
    }
    public boolean respuestaCorrecta (char respuestas){

        int indice = letras.indexOf(respuestas);

        if (indice==-1){

            return false;
        }
        return this.respuestas.get(indice).getEsCorrecta();

    }

    public boolean preguntar(int numero) {
        System.out.println(numero + ". " + this.pregunta);
        int indice = 0;
        for (Respuestas r : this.respuestas) {
            System.out.printf("%c) %s\n", letras.charAt(indice), r.getRespuestas());
            indice++;
        }
        System.out.println("Elige: ");
        Scanner sc = new Scanner(System.in);
        char respuesta = sc.nextLine().charAt(0);
        return this.respuestaCorrecta(respuesta);
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
