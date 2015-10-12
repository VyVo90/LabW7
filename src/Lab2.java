import javax.swing.JOptionPane;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int rand;
     boolean again;
     String r = "Rock";
     String p = "Paper";
     String s = "Scissor";
     String user, comp;
     
     rand = (1+(int)(Math.random()*3));
     
     switch(rand){
     case 1:
    	 	comp = r;
    	 	break;
     case 2:
    	 comp = p;
    	 break;
     default:
    	 comp = s;
     }
     
     do 
     { again = false;
     
     user = JOptionPane.showInputDialog("Choose Rock, Paper, Scissor and play the game.") ;
     switch(user.toLowerCase()){
     case "r":
     	user = r;
     	break;
     case "rock":
     	user = r;
     	break;
     case "p":
     	user = p;
     	break;
     case "paper":
     	user = p;
     	break;
     case "s":
    	 user = s;
    	 break;
     case "scissor":
    	 user = s;
    	 break;
     default:
    		JOptionPane.showMessageDialog(null, "Can Not Recognize, try again, please: ");
    		again = true;
    		}
     }
     while (again);
     String win = String.format("You put %s, and computer chose randomly %s. You won!",  user, comp);
     String lose = String.format("You put %s, and computer chose randomly  %s. Sorry! You lose!" + "Please try again!!!", user, comp);
     
     if(user.equals(comp))
    	 JOptionPane.showMessageDialog(null, "Tie!");
     
     switch(user){
     case "Rock":
    	switch(comp){
    	case "Scissor":
    		JOptionPane.showMessageDialog(null, win);
    		break;
    	}
    	break;
    	case "Paper":
    		switch(comp){
    		case "Rock":
    			JOptionPane.showMessageDialog(null, win);
    			break;
     }
    break;
    	case "Scissor":
    		switch(comp){
    		case "Paper":
    			JOptionPane.showMessageDialog(null,win);
    			break;
    		}
    		break;
    	default:
    		JOptionPane.showMessageDialog(null, lose);
    		
    		}
    		 
     
     }
	}
