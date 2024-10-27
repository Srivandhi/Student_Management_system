package Student_Management_system;
import java.util.*;
import java.io.*;
class Main
{
    public static void main(String[] args)
     {
        Scanner reader=new Scanner(System.in);
        int n,regno;
        char grade;
        String dept,name;
        System.out.print("Enter number of students = ");
        n=reader.nextInt();
        reader.nextLine();
        try{
            File f=new File("Details.txt");
             f.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        try(BufferedWriter fw=new BufferedWriter(new FileWriter("Details.txt",true)))
        {
            fw.write("NAME     REGNO     DEPARTMENT   GRADE");
        
            for(int i=0;i<n;i++)
            {
                  fw.newLine();
                    System.out.printf("enter Student %d detatils:\n",i+1);

                    System.out.print("Name = ");
                    fw.write(reader.nextLine()+"    ");
                
                    System.out.print("REgno = ");
                    fw.write(reader.nextInt()+"   ");

                    reader.nextLine();

                    System.out.print("Department = ");
                    fw.write(reader.nextLine()+"   ");

                    System.out.print("Grade = ");
                    fw.write(reader.nextLine()+"   ");

                    fw.newLine();
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {    
            reader.close();
        }
        
        
        
    }
}
