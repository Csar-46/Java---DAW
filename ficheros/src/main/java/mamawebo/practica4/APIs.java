package mamawebo.practica4;

import com.google.gson.Gson;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APIs {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {

            String apiUrl = "https://opentdb.com/api.php?amount=1&category=18";

            URL url = new URL(apiUrl);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                json.append(line);
            }
            in.close();

            Gson gson = new Gson();
            Pregunta pre = gson.fromJson(json.toString(), Pregunta.class);

            System.out.print("Responde a la siguiente pregunta: ");
            for (Respuesta r : pre.getResults()) {
                System.out.println( r.question);
                for (String incorrecta : r.incorrect_answers) {
                    System.out.println("- " + incorrecta);
                }
                System.out.println("- " + r.correct_answer);

                System.out.print("Introduce tu respuesta: ");
                String respuesta = entrada.nextLine();

                if (respuesta.equals(r.correct_answer)) System.out.println("SIUUUUU, CORRECTO");
                else System.out.println("Cagaste wey");

            }

        } catch (Exception e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
