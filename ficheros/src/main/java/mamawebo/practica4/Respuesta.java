package mamawebo.practica4;
import lombok.Getter;
import java.util.ArrayList;

@Getter
public class Respuesta {

    public String type;
    public String difficulty;
    public String category;
    public String question;
    public String correct_answer;
    public ArrayList<String> incorrect_answers;

}


