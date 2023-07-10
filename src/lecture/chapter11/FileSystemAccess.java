package lecture.chapter11;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

public class FileSystemAccess {

    public static void main(String[] args) {
        System.out.println("Liste von Laufwerken");
        System.out.println("====================");

        File[] rootList = File.listRoots();

        for(File root : rootList){
            System.out.println("Pfad: " + root.getPath());
            System.out.println("- existiert: " + root.exists());
            System.out.println("- Lesezugriff: " + root.canRead());
            System.out.println("- Schreibzugriff: " + root.canWrite());
            System.out.println("- Datei: " + root.isFile());
            System.out.println("- Verzeichnis: " + root.isDirectory());
            File[] content = root.listFiles();
        }

        System.out.println("Java System Properties");
        System.out.println("======================");

        Properties systemProperties = System.getProperties();

        Set systemPropertiesKeys = systemProperties.keySet();
        for(Object key : systemPropertiesKeys){
            System.out.println(key + " : " + systemProperties.get(key));
        }

        System.out.println("Inhalt user.dir");
        System.out.println("===============");

        File userDir = new File(System.getProperty("user.dir"));

        System.out.println("Name: " + userDir.getName());
        System.out.println("- Pfad: " + userDir.getPath());
        System.out.println("- Existiert: " + userDir.exists());
        System.out.println("- Schreibzugriff: " + userDir.canWrite());
        System.out.println("- Lesezugriff: " + userDir.canRead());
        System.out.println("- Verzeichnis: " + userDir.isDirectory());

        listDirectoryAndContentWithIndentation(userDir, 0);


        System.out.println("Umgang mit Verzeichnissen und Dateien");
        System.out.println("=====================================");

        String pathString = System.getProperty("user.dir") + File.separator + "myDirectory";
        String pathRenamedString = System.getProperty("user.dir") + File.separator + "myRenamedDirectory";

        File myDirectory = new File(pathString);
        File myRenamedDirectory = new File(pathRenamedString);

        System.out.println(myDirectory.getName() + " existiert - " + myDirectory.exists());

        if(!myDirectory.exists()){
            myDirectory.mkdir();
        }

        System.out.println(myDirectory.getName() + " existiert - " + myDirectory.exists());

        if(myDirectory.exists() && !myRenamedDirectory.exists()){
            myDirectory.renameTo(myRenamedDirectory);
        }

        System.out.println(myDirectory.getName() + " existiert - " + myDirectory.exists());
        System.out.println(myRenamedDirectory.getName() + " existiert - " + myRenamedDirectory.exists());

        File myFile = new File(myRenamedDirectory.getPath() + File.separator + "myTextFile.txt");

        if(!myFile.exists()){
            try {
                myFile.createNewFile();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /*
        System.out.println("Einlesen von Daten über System.in (Bytes)");
        System.out.println("=========================================");

        System.out.println("Geben Sie einen Text ein:");

        byte[] input = new byte[255];

        try{
            System.in.read(input, 0, 255);
        }catch(IOException e){
            System.out.println("Fehler bei der Eingabe. " + e.getMessage());
        }

        //System.out.println(input);
        System.out.println(new String(input));
         */

        System.out.println("Einlesen von Daten über System.in (Char)");
        System.out.println("=========================================");

        InputStreamReader systemInReader = new InputStreamReader(System.in);
        BufferedReader systemInBufferedReader = new BufferedReader(systemInReader);

        System.out.println("Bitte einen Text eingeben (mit exit beenden):");

        String inputString = "";
        ArrayList<String> textInput = new ArrayList<>();

        while(true){
            try{
                inputString = systemInBufferedReader.readLine();
                if(inputString.equals("exit")){
                    break;
                }
                textInput.add(inputString);
            }catch (IOException e){
                System.out.println("Fehler bei der Eingabe. " + e.getMessage());
            }
        }

        System.out.println("Eingegebener Text:");
        for(String line : textInput){
            System.out.println(line);
        }

        FileWriter myTextFileWriter = null;

        try{
            myTextFileWriter = new FileWriter(myFile);

            for(String line : textInput){
                myTextFileWriter.write(line + System.getProperty("line.separator"));
            }
        }catch(IOException e){
            System.out.println("Fehler beim schreiben in die Datei");
        }finally{
            try {
                myTextFileWriter.close();
            }catch(IOException e){
                System.out.println("Fehler beim schliessen des Filestreams");
            }
        }

        System.out.println("Auslesen aus Datei:");
        System.out.println("===================");

        try(FileReader myTextFileReader = new FileReader(myFile);
            BufferedReader myTextFileBufferedReader = new BufferedReader(myTextFileReader)){

            String line;
            while((line = myTextFileBufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch(IOException e){
            System.out.println("Fehler bei der Stream-Verarbeitung");
        }

        /*
        // Verzeichnisse aufräumen
        if(myDirectory.exists()){
            myDirectory.delete();
        }

        if(myRenamedDirectory.exists()){
            myRenamedDirectory.delete();
        }


 */
        System.out.println(myDirectory.getName() + " existiert - " + myDirectory.exists());
    }

    private static void listDirectoryAndContentWithIndentation(File currentDirectory, int indentation){
        printlnWithIndentation("+" + currentDirectory.getName() +" - "
                + (currentDirectory.canRead() ? "Lesezugriff" : "Kein Lesezugriff") + "; "
                +(currentDirectory.canWrite() ? "Schreibzugriff" : "Kein Schreibzugriff"), indentation );

        File[] currentDirectoryContent = currentDirectory.listFiles();
        for(File currentFile : currentDirectoryContent){
            if(currentFile.isDirectory()){
                listDirectoryAndContentWithIndentation(currentFile, indentation+1);
            }else if(currentFile.isFile()){
                printlnWithIndentation("-" + currentFile.getName()
                        + " - "+ (currentFile.canRead() ? "Lesezugriff" : "Kein Lesezugriff") + "; "
                        +(currentFile.canWrite() ? "Schreibzugriff" : "Kein Schreibzugriff") + "; "
                        + currentFile.length() + " Byte", indentation+1 );
            }
        }
    }

    private static void printlnWithIndentation(String txt, int indentation){
        String indentationText = "";
        for(int i = 0; i < indentation; i++){
            indentationText += "\t";
        }

        System.out.println(indentationText + txt);
    }
}
