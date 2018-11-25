    import java.util.List;
    import java.util.ArrayList;
     
    class Message{
        String message;
        public Message(String message){
            this.message = message;
        }
     
        public String printMessage(){
            return this.message;
        }
    }
    class MailBox{ 
    	private static MailBox single_instance = null; 
     
    	public String s; 
    	Message myFirstMesage;
     
        public void addMessage(Message message){
    	    System.out.println("Adding message: " + message.printMessage() + "\n");
        	s += message.printMessage();
        	s+="\n";
    	}
     
    	private MailBox(){ 
    	 myFirstMesage = new Message("Welcome message");
      	 s =  myFirstMesage.printMessage();
      	 s +="\n";
    	} 
     
    	public static MailBox getInstance(){ 
    		if (single_instance == null) 
    			single_instance = new MailBox(); 
    		return single_instance; 
    	} 
    } 
    class User{
        public User(){}
     
        public MailBox showMailBox(){
            return MailBox.getInstance();
        }
    }
     
    class Main{ 
    	public static void main(String args[]){ 
    	    Message mySecondMesage = new Message("Second message");
    	    Message myThirdMessage = new Message("Third message");
    	    Message fourthMessage = new Message("Fourth message");
     
    		MailBox x = MailBox.getInstance(); 
             x.addMessage(mySecondMesage);
             x.addMessage(myThirdMessage);
             x.addMessage(fourthMessage);
             x.getInstance();
     
            User user1 = new User();
            MailBox sing1 = user1.showMailBox();
     
            System.out.println("User1 mailbox:" + "\n" + sing1.s );
     
            User user2 = new User();
            MailBox sing2 = user2.showMailBox();
     
            System.out.println("User2 mailbox:" + "\n" + sing2.s );
    	} 
    } 
     