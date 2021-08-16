import java.io.*;

class FileHandling{
    public static void main(String[] args) {
      File file = new File("/home/akritd/Java/Assignment.txt");
      
      boolean result;

      try{
          result = file.createNewFile();
          
          if (result){
              System.out.println("Created");
          }
          else{
            System.out.println("File already exists");
          }

        FileWriter write = new FileWriter(file);
        write.write("Java Assignment");
        write.flush();
        write.close();

        FileReader fileRead = new FileReader(file);
        BufferedReader read = new BufferedReader(fileRead);
        String line = read.readLine();
            System.out.println(" line1 is: "+line);

        if(file.exists()){
                System.out.println("File Name: " + file.getName());
               System.out.println("Is this file Writeable: " + file.canWrite());
                System.out.println("is This File Readable: " + file.canRead());
                System.out.println("File Size (in Bytes): " + file.length());
            }    
      }catch(IOException e){
        e.printStackTrace();
      }

    }
}