import java.io.*;
public class Prototype {
public static void main(String[] args) throws IOException {  
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter Person id: ");  
        int pid=Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("Enter Person Name: ");  
        String pname=br.readLine();  
        System.out.print("\n");  
          
  
          
        System.out.print("Enter Person Address: ");  
        String paddress=br.readLine();  
        System.out.print("\n");  
           
        Person p1=new Person(pid,pname,paddress);  
          
        p1.showRecord();  
        System.out.println("\n");  
        Person p2=(Person) p1.getClone();  
        p2.showRecord();  
    }     
}
