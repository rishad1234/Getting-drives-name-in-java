
package searchfilesdemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Search {
    static String[] rootDir;
    static List<String> root;

    public Search() {
        this.rootDir = new String[26];
    }
    /*
        for test purpose only
    */
    public void print(){
        for(int i = 0; i < rootDir.length; i++){
            System.out.println(rootDir[i]);
        }
    }
    /*
        this method set the rootDir array with
        possible drive names with the required 
        punctuation
    */
    public void setRootDir() {
        for(int i = 0; i < rootDir.length; i++){
            Character temp = (char) (65 + i);
            this.rootDir[i] = temp.toString() + ":\\\\";
        }
    }
    /*
        this method returns the drives' name
        as a List
    */
    public static List<String> getDrives(){
        root = new ArrayList<>();
        for(String temp : rootDir){
            File file = new File(temp);
            if(file.isDirectory()){
                root.add(temp);
            }
        }
        return root;
    }
    /*
        for test purpose only
    */
    public void printRoot(){
        for(String temp : root){
            System.out.println(temp.toString());
        }
    }
    
    
}
