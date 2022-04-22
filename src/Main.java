import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

 Ronda ronda = new Ronda();
 ronda.agregarPregunta(new Pregunta("1 + 1",List.of(
         new Respuestas("3",false),
         new Respuestas("3",false),
         new Respuestas("3",false),
         new Respuestas("2",true)
 )));

   ronda.agregarPregunta(new Pregunta("¿Cómo se llama el cangrejo de la película 'La sirenita' de Walt Disney? ", List.of(

                new Respuestas("Alejandro", false),
                new Respuestas("Norberto", false),
                new Respuestas("Galicio", false),
                new Respuestas("Sebastian", true)
 )));


}
}
