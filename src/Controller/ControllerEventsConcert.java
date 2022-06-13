package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class ControllerEventsConcert {

    Map<String, String> map = new HashMap<>();

    public void Reader() {
        Scanner sc = new Scanner(System.in);


        String path = "C:\\Users\\Usuário\\Desktop\\Events\\src\\Data";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            File Concert = new File(path);
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
