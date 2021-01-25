
public class Person implements Prototype1 {

	private int id;  
	   private String name;  
	  
	   private String address;  
	      
	   public Person(){  
	            System.out.println("  Record ");  
	            System.out.println("---------------------------------------------");  
	            System.out.println("pid"+"\t"+"pname"+"\t"+"caddress");  
	      
	}  
	  
	 public  Person(int id, String name,  String address) {  
	          
	        this();  
	        this.id = id;  
	        this.name = name;  
	        this.address = address;  
	    }  
	      
	  public void showRecord(){  
	          
	        System.out.println(id+"\t"+name+"\t"+address);  
	   }  
	  
	    @Override  
	    public Prototype1 getClone() {  
	          
	        return new Person(id,name,address);  
	    }  

}
