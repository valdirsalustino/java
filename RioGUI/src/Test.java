import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Test {


  public static void createBashScript(String rioPath, String bashScriptName) throws IOException {
    System.out.println(" inside createBashScript ") ;

    String str;
    str = "#!/bin/bash\n";

    String myBashFileName = rioPath + "/" + bashScriptName;

    try(
    BufferedWriter writer = new BufferedWriter(new FileWriter(myBashFileName))){
      str += "echo  '-----> Starting bash program.sh'\n";
      str += rioPath+"/toy/ToyMCGenerator "+rioPath+"/toy/ainputs/InputFileFromRioGUI.txt | tee log_rioGUI.txt";
      writer.write(str);
    }

  }

  public static void main(String[] args) {
    // Prints "Hello, World" to the terminal window.

    String rioPath = "/home/valdir/sw/Rio+";

    System.out.println("Hello, World");

    System.out.println("Creating bash program");

    String bashScriptName = "rioGuiBashProgram.sh";

    try {
      new Test().createBashScript(rioPath,bashScriptName);
    } catch (IOException ex){}

    Process proc;

    String makeExecutable = "chmod 755 " +  rioPath +"/"+ bashScriptName;
    try{
      proc = Runtime.getRuntime().exec(makeExecutable);
      proc.waitFor();   
      BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
    }catch (IOException | InterruptedException e){

    } 
  }

}

