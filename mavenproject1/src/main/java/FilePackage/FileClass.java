
package FilePackage;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File myfile  = new File("G:/001. UIU/3rd Semester/Java_All_Project/mavenproject1/src/main/java/FilePackage/person");
        System.out.println("Folder created: "+ myfile.getName());
        System.out.println(myfile.getAbsolutePath());
    }
}
