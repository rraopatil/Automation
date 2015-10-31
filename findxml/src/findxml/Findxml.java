package findxml;

import java.io.File;
 
public class Findxml {
 
    static final String DIR_PTH = "//10.0.23.54/xfer/TRANSFERED";
    static final String FILE_NAME = "DSACCH10292015.xml";
 
    public static void main(String[] args) {
        try {
        	Findxml searchFile = new Findxml();
            searchFile.seach_file(new File(DIR_PTH), FILE_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void seach_file(File file, String file_to_search) {
        try {
            if (file_to_search != null && !file_to_search.isEmpty()) {
                if (file != null) {
                    if (file.isDirectory()) {
                        //do you have permission to read this directory?    
                        if (file.canRead()) {
//                            System.out.println("Searching in : "+file.getAbsoluteFile());
                            for (File sub_directory : file.listFiles()) {
                                if (sub_directory.isDirectory()) {
                                    seach_file(sub_directory, file_to_search);
                                } else {
                                    if (file_to_search.equalsIgnoreCase(sub_directory.getName().toLowerCase())) {
                                        System.out.println("File Found @ : " + sub_directory.getAbsoluteFile().toString());
                                    }
                                }
                            }
                        } else {
                            System.out.println(file.getAbsoluteFile() + " Permission Denied");
                        }
                    } else {
                        System.out.println(file.getAbsoluteFile() + " is not a directory!");
                    }
                } else {
                    file = new File("/");
                    seach_file(file, file_to_search);
                }
            } else {
                System.out.println("The file given to search ");
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}