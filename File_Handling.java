import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        File myfile = new File("demo.txt");

        // 1. Create a new file
        try {
            if (myfile.createNewFile()) {
                System.out.println("File created: " + myfile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Unable to create this file");
        }

        // 2. Write to a File (overwrite mode)
        try {
            FileWriter write_in_file = new FileWriter("demo.txt");
            write_in_file.write("Hello Ji ");
            write_in_file.write("25\n");
            write_in_file.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Unable to write");
        }

        // 3. Append to a File
        try {
            FileWriter append_in_file = new FileWriter("demo.txt", true); // true = append mode
            append_in_file.write("This is appended text.\n");
            append_in_file.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("Unable to append");
        }

        // 4. Read a file
        try {
            Scanner sc = new Scanner(myfile); // ✅ read from file
            System.out.println("Reading file content:");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Unable to read this file");
        }

        // 5. File Information
        if (myfile.exists()) {
            System.out.println("File name: " + myfile.getName());
            System.out.println("Absolute path: " + myfile.getAbsolutePath());
            System.out.println("Writable: " + myfile.canWrite());
            System.out.println("Readable: " + myfile.canRead());
            System.out.println("File size (in bytes): " + myfile.length());
        } else {
            System.out.println("The file does not exist.");
        }

        // 6. Delete a File
        if (myfile.delete()) {
            System.out.println("Deleted the file: " + myfile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
