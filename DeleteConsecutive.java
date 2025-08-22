// Java program to delete consecutive 
// same words from an array using 
// Brute Force Method
import java.util.*;

class DeleteConsecutive {
    
    // Function to remove consecutive same words
    static int removeConsecutiveSame(String[] arr) {
        
        // Convert array to list for easier manipulation
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        int i = 0;
        
        while (i < list.size() - 1) {
            
            // If two consecutive words are the same
            if (list.get(i).equals(list.get(i + 1))) {
                
                // Remove both from list
                list.remove(i);
                list.remove(i);
                
                // Move back one step to recheck
                if (i > 0) {
                    i--;
                }
            } else {
                
                // Move to the next element
                i++;
            }
        }
        // Return the remaining number of words
        return list.size();
    }

    // Driver code
    public static void main(String[] args) {
        
        String[] arr = {"gfg", "for", "geeks", 
                        "geeks", "for"};

        System.out.println(removeConsecutiveSame(arr));
    }
}