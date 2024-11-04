package com.company;

import java.io.File;

public class cwh111_ADJ2_file_handling {
public static void main (String[]args){

//            Code to create a new file
            /*
            throws IOException {
        File myFile = new File("c");
       myFile.createNewFile();
        System.out.println("Unable to create this file");
 }


//    code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("cwh111filehandling.txt");
            fileWriter.write("This is our first file from this java course\n ok now bye");
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }


//    Reading a file
    File myfile = new File("cwh111filehandling.txt");
    try {
        Scanner sc = new Scanner(myfile);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }catch (FileNotFoundException e){
        e.printStackTrace();
    }
 */

//    deleting a file
    File myfile = new File("this.txt");
    if(myfile.delete()){
        System.out.println("I have deleted :" + myfile.getName() );
    }
    else {
        System.out.println("Some problem occured while deleting the file");
    }

}
}


