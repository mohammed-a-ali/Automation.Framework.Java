package data;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {
    public String firstName, lastName, email, password;

    public void jsonReader() throws IOException, ParseException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/data/UserData.json";

        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));

        for (Object jsonOb : jarray)
        {
            JSONObject person = (JSONObject) jsonOb;
            firstName = (String) person.get("firstName");
            System.out.println(firstName);

            lastName = (String) person.get("lastName");
            System.out.println(lastName);

            email = (String) person.get("email");
            System.out.println(email);

            password = (String) person.get("password");
            System.out.println(password);
        }
    }
}
