import java.util.List;

public class Respuestas {


    private Boolean esCorrecta;
    private String respuestas;

    public Respuestas(String respuestas,Boolean esCorrecta ) {
        this.esCorrecta = esCorrecta;
        this.respuestas = respuestas;
    }


    public String getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String respuestas) {
        this.respuestas = respuestas;

    }

    public Boolean getEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(Boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }


}
