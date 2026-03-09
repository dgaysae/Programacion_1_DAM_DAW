package unidad08.ejemplos.Data_Input_Output_Stream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ejemplo01 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\datosPersonajes.data";
        
        String[] nombres = {"Cid", "Bilbo", "Luck", "Darth", "James", "Guybrush"};
        String[] apellidos = {"Campeador", "Bolson", "SkyWalker", "Vader", "Bond", "Threepwood"};
        int[] edades = {36, 42, 25, 53, 44, 27};
        float[] alturas = {1.78f, 1.23f, 1.67f, 2.12f, 1.96f, 1.83f};
        boolean[] existieron = {true, false, false, false, false, false};
        
        try (DataOutputStream escritorData = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nombreFichero)));) {

            for(int i = 0; i < nombres.length; i++) {
                escritorData.writeUTF(nombres[i]);
                escritorData.writeUTF(apellidos[i]);
                escritorData.writeInt(edades[i]);
                escritorData.writeFloat(alturas[i]);
                escritorData.writeBoolean(existieron[i]);
            }
            
            System.out.println("Escritura OK");

        } catch (FileNotFoundException e) {
            System.out.println("Error! El fichero no existe. " + e.getMessage());
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error! No se ha podido tratar el fichero. " + e.getMessage());
//            e.printStackTrace();
        }

        System.out.println("*********************************");
        System.out.println("Operación finalizada.");
    }
}
