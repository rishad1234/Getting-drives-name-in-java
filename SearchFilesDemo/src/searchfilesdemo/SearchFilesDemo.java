
package searchfilesdemo;

import java.util.List;

public class SearchFilesDemo {

    public static void main(String[] args) {
        Search search = new Search();
        search.setRootDir();
        
        List<String> files = search.getDrives();
        System.out.println("");
        
        search.printRoot();
        System.out.println("");
        for(String file: files){
            System.out.println(file);
        }
    }
    
}
