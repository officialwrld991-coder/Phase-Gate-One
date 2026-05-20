        public class LikeSystemApp {
        

        public static String [] getNames (String [] names) {
        
        String [] name = {"Alex", "Jacob", "Mark", "Max"};
        
        String [] likes = new String [names.length];
        
        int index = 0;
        
        for (int count = 0; count < name.length; count++) {

        likes[index] = name[count];
        
        index += 1;
        
        }
        
        return likes;

        }
        
        

        }
        
        
        
