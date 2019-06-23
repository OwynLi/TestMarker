
import java.util.Scanner;
import java.io.*;

public class marker{

   
    String[] answer=new String[9];
    public void mark(){
        File f=new File("quiz.csv"); 
        try{
            Scanner input=new Scanner(f);
                while(input.hasNext()){
                String str=input.nextLine();
                String[] ans=str.split(",");
                if(ans[0].equals("Answer Key")){
                    for(int i=0; i<ans.length; i++){
                        answer[i]=ans[i];
                    }
                }else{
                    for(int i=1; i<ans.length; i++){
                        if(ans[i].equals(answer[i])){
                            System.out.println("Question"+i+"Correct");
                        } else{
                            System.out.println("Question"+i+"Wrong"); 
                            
                        }
                    }
                }
            }
        }    
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        
    }

}