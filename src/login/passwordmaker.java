package login;
import java.util.*;
import java.io.*;


class pass implements  Serializable{
          String password;
	      String username; 
	
}



//------------------------------taking username and password ----------------------------
class up  {

	public void setup(String user,String pass) {
		try{
		pass p=new pass();
		p.username=user;
		p.password=pass;
		
		FileOutputStream fout=new FileOutputStream("password.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(p);
		out.flush();
		out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class desup{
	
	String user;
	String pass;
	 public void desUP () {
		try{  
			  //Creating stream to read the object  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("password.txt"));  
			  pass s=(pass)in.readObject();  
			
			String x=s.username;
			String y=s.password;
			//sending username and password
			setup(x,y);
			  //closing the stream  
			  in.close();  
			  }
		      catch(Exception e){System.out.println(e);} 
		//return true;
	}
	public void setup(String u,String p) {
		this.user=u;
		this.pass=p;
	}
	
	public boolean checkup(String u,String p) {
		if(user.equals(u) && pass.equals(p)) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class passwordmaker{
	public static void main(String[] args) {
	  Scanner in=new Scanner(System.in);
//	  pass n=new pass();

	  
	}
}