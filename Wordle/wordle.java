import java.util.Scanner;
import java.util.File;
import java.io.BufferedReader;
import java.util.ArrayList;
public class wordle {
    private static final String ANSWER = FileReader.getInputAsArrayList("wordlewords").get((int)Math.floor(Math.random()*212)).toUppereCase();
    private static String word = ""; 
    static String word2;
    static int finishgame;

    public static void main(String args[])
    {
        dictionary dictionary = new dictionary();
        random r = new Random();
        int num = r.nextInt(dictionary.getSize());
        word = dictionary.getWord(num);
        System.out.println(word);
        
        Scanner sc = new Scanner (System.in);
        

        
    
    
    
        
        int count = 0;
        
        for(int i = 1; i <= 6; i++)
        {
        System.out.println("Put in your 5 letter word");
        word2 = sc.nextLine();
        }
        while(check2(word2.length()) || allowable(word2));
        for(int j = 0; j < word2.length(); j++)
        {
            check(word2.charAt(j));
            count++;
        }
        if(end==5)
        {
            break;
        }
        System.out.println();
        System.out.println("You Win! The word was " + word);
    }
    public static void checknum(char x)
    {
        int num2 = 0;
        

        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i)==x)
            {
                num2=2;
                if(count == i)
                {
                    finishgame++;
                    num2 = 2;
                    break;
                }
            }
        }
        Ssytem.out.println(num2);
    }
    public static boolean checknum2(int num2)
    {
        if(num2 < 5)
        {
            
            return true;
        }
        else{
            return false;
        }
        if(num2 > 5)
        {
            
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean allowable(String word)
    {
        Dict Dict = new Dict();
        for(int i = 0; i < dic.getSize(); i++)
        {
            if(Dict.getSize(); i++)
            {
                if(dict.getWord(i).equalsIgnoreCase(word))
                {
                    return false;
                }
            }
            return true;
        }
    }


       
}
class Dictionary{
     
    private String input[]; 

    public Dictionary(){
        input = load("C://allowable.txt");  
    }
    
    public int getSize(){
        return input.length;
    }
    
    public String getWord(int n){
        return input[n].trim();
    }
    
    private String[] load(String file) {
        File aFile = new File(file);     
        StringBuffer contents = new StringBuffer();
        BufferedReader input = null;
        try {
            input = new BufferedReader( new FileReader(aFile) );
            String line = null; 
            int i = 0;
            while (( line = input.readLine()) != null){
                contents.append(line);
                i++;
                contents.append(System.getProperty("line.separator"));
            }
        }catch (FileNotFoundException ex){
            System.out.println("Can't find the file - are you sure the file is in this location: "+file);
            ex.printStackTrace();
        }catch (IOException ex){
            System.out.println("Input output exception while processing file");
            ex.printStackTrace();
        }finally{
            try {
                if (input!= null) {
                    input.close();
                }
            }catch (IOException ex){
                System.out.println("Input output exception while processing file");
                ex.printStackTrace();
            }
        }
        String[] array = contents.toString().split("\n");
        for(String s: array){
            s.trim();
        }
        return array;
    }

    class Dictionary{
     
        private String input[]; 
    
        public Dictionary(){
            input = load("C://wordlewords.txt");  
        }
        
        public int getSize(){
            return input.length;
        }
        
        public String getWord(int n){
            return input[n].trim();
        }
        
        private String[] load(String file) {
            File aFile = new File(file);     
            StringBuffer contents = new StringBuffer();
            BufferedReader input = null;
            try {
                input = new BufferedReader( new FileReader(aFile) );
                String line = null; 
                int i = 0;
                while (( line = input.readLine()) != null){
                    contents.append(line);
                    i++;
                    contents.append(System.getProperty("line.separator"));
                }
            }catch (FileNotFoundException ex){
                System.out.println("Can't find the file - are you sure the file is in this location: "+file);
                ex.printStackTrace();
            }catch (IOException ex){
                System.out.println("Input output exception while processing file");
                ex.printStackTrace();
            }finally{
                try {
                    if (input!= null) {
                        input.close();
                    }
                }catch (IOException ex){
                    System.out.println("Input output exception while processing file");
                    ex.printStackTrace();
                }
            }
            String[] array = contents.toString().split("\n");
            for(String s: array){
                s.trim();
            }
            return array;
        }
    }
}


    

