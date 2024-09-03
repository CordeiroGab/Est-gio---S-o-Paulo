package Quest03;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Dias{
    public int dia;
    public double valor;
}
public class vetor {

    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("faturamento.json")){

            Object obj = jsonParser.parse(reader);
            JSONArray valoresLista = (JSONArray) obj;

            valoresLista.forEach(lista -> leitor((JSONObject)lista));

        } catch (Exception e) {


        }

    }


    private static void leitor(JSONObject leR){
        System.out.println(Integer.parseInt(leR.get("dia").toString()));
        System.out.println(Integer.parseInt(leR.get("valor").toString()));
    }


}




