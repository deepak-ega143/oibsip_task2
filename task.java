//package GuesingGame;
import javax.swing.*;
public class task {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int GeneratedNum = (int)(Math.random()*100 + 1);
           int userinput=0;
           int attempts=1;
           int score = 0;
           
           
           while(userinput!=GeneratedNum && attempts<=10) {
        	  String output = JOptionPane.showInputDialog(null,"Guess a number between 1 to 100\n in 10 attempts");
        	  userinput=Integer.parseInt(output);
        	  JOptionPane.showMessageDialog(null, " "+guessNum(userinput,GeneratedNum,attempts,score));
        	  attempts++;
        	  score++;
           }
           
	}
	public static String guessNum(int userinput,int generatednum,int attempts,int score) {
		if(userinput<=0 || userinput>100) {
			return "invalid Guess";
		}
		else if(userinput == generatednum) {
			return " correct:\n Number of Guesses:"+attempts+"\n   your score:" + score;
		}
		else if(userinput > generatednum) {
			return "Guess is greater Try Again:\n attempts:"+attempts;
		}
		else if(userinput < generatednum) {
			return "Guess is smaller Try Again:\n attempts:"+attempts;
		}
		else {
			return "your Guess is incorrect\n choose the Number"+attempts;
		}


	}
	}
