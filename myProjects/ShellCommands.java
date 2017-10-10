
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ShellCommands{

  private String executeCommand(String command){
    StringBuffer output = new StringBuffer();
    Process p;

    try{
      p = Runtime.getRuntime().exec(command);
      p.waitFor();

      BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
      String line = "";

      while((line = reader.readLine())!= null){
        output.append(line+"\n");
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return output.toString();
  }

  public static void main(String[] args) {
    /*
    ShellCommands myObj = new ShellCommands(10);
    System.out.println(myObj.mBalance);
    */

    ShellCommands obj = new ShellCommands();

    String domainName = "google.com";

    String output = obj.executeCommand("root -l /home/valdir/Documents/tutorials/hist/hsum.C");

    System.out.println(output);
  }

}
