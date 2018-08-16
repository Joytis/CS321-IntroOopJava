import java.util.ArrayList;

/**
   A system of voice mail boxes.
*/
public class MailSystem
{
   /**
      Constructs a mail system with a given number of mailboxes
      @param mailboxCount the number of mailboxes
   */
   public MailSystem(int mailboxCount)
   {
      mailboxes = new ArrayList<Mailbox>();

      // Initialize mail boxes.

      for (int i = 0; i < mailboxCount; i++)
      {
         String passcode = "" + (i + 1);
         String greeting = "You have reached mailbox " + (i + 1)
               + ". \nPlease leave a message now.";
         mailboxes.add(new Mailbox(passcode, greeting));
      }
   }

   /**
      Locate a mailbox.
      @param ext the extension number
      @return the mailbox or null if not found
   */
   public Mailbox findMailbox(String ext)
   {
      int i = Integer.parseInt(ext);
      if (1 <= i && i <= mailboxes.size())
         return  mailboxes.get(i - 1);
      else return null;
   }

   public Boolean InitializeSystemMailbox(String ext) 
   {
      currentMailbox = findMailbox(ext);
      return (currentMailbox != null);
   }

   public String getGreeting(){
      if(currentMailbox != null)
      {
         return currentMailbox.getGreeting();
      }
      return null;
   }

   public Boolean checkPasscode(String str) {
      if(currentMailbox != null)
      {
         return currentMailbox.checkPasscode(str);
      }
      return false;
   }

   public void setPasscode(String str) {
      if(currentMailbox != null) {
         currentMailbox.setPasscode(str);
      }
   }

   public void setGreeting(String str) {
      if(currentMailbox != null){
         currentMailbox.setGreeting(str);
      }
   }

   public Message getCurrentMessage() {
      if(currentMailbox != null){
         return currentMailbox.getCurrentMessage();
      }
      return null;
   }
   public void removeCurrentMessage() {
      if(currentMailbox != null){
         currentMailbox.removeCurrentMessage();
      }
   }
   public void saveCurrentMessage() {
      if(currentMailbox != null){
         currentMailbox.saveCurrentMessage();
      }
   }

   public void addMessage(Message m)
   {
      if(currentMailbox != null){
         currentMailbox.addMessage(m);
      }
   }

   private Mailbox currentMailbox;
   private ArrayList<Mailbox> mailboxes;
}
