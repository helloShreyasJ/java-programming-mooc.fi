import javax.swing.JOptionPane;

public class learningJOptionpane {
    public static void main(String[] args) {
        int lie = 0;
        String name = JOptionPane.showInputDialog("What Is your name?");
        JOptionPane.showMessageDialog(null, "Hi, " + name + "!");

        
        try{
            int age = Integer.valueOf(JOptionPane.showInputDialog("What Is your age?"));
            if(age>100){
                JOptionPane.showMessageDialog(null, "Don't lie to me " + name);
                lie++;
            }
            if(age>=18 && age<100){
                JOptionPane.showMessageDialog(null, age + "? I see, you are an adult.");
            } else if(age<18){
                JOptionPane.showMessageDialog(null, age + "? I see, you are a minor.");
            }
            

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Don't lie to me " + name);
            lie++;
        }

        int height = Integer.valueOf(JOptionPane.showInputDialog("How tall are you, in centimeters?"));
        if(height<120){
            JOptionPane.showMessageDialog(null, "That's gotta be a lie");
            lie++;
            JOptionPane.showMessageDialog(null, "Did you lie to me?");
            String answer = JOptionPane.showInputDialog("Yes or No?");
            if(answer.equals("Yes") || answer.equals("yes")){
                JOptionPane.showMessageDialog(null, "Okay");
                JOptionPane.showMessageDialog(null, "Here's a chance to redeem yourself");
                String saySorry = JOptionPane.showInputDialog("Say Sorry");
                if(saySorry.equals("Sorry") || saySorry.equals("sorry")){
                    JOptionPane.showMessageDialog(null, "It's okay, humans lie. Just don't do It again!");
                    lie--;
                } else{
                    JOptionPane.showMessageDialog(null, "Eat shit");
                    return;
                }
            } else{
                JOptionPane.showMessageDialog(null, "Are you a midget?");
                String answer2 = JOptionPane.showInputDialog("Yes or No");
                if(answer2.equals("Yes") || answer2.equals("yes")){
                    JOptionPane.showMessageDialog(null, "Oh, I'm sorry.");
                } if(answer2.equals("No") || answer2.equals("no")){
                    JOptionPane.showMessageDialog(null, "So you did lie!");
                    JOptionPane.showMessageDialog(null, "Eat shit");
                }
            }
            
        }
        if(height>200){
            JOptionPane.showMessageDialog(null, "That's gotta be a lie");
            lie++;
        } else if(height > 183 && height < 200){
        JOptionPane.showMessageDialog(null, height + "? damn, you're very tall.");
        } else if(height < 183 && height >= 180 ){
            JOptionPane.showMessageDialog(null,"I know you wish you were 6 foot, haha");
        } else if(height>120 && height<180) {
            JOptionPane.showMessageDialog(null, "You're pretty average height ngl");
        }
        if(lie > 1){
            JOptionPane.showMessageDialog(null, "You lied to me " + lie + " times");
            JOptionPane.showMessageDialog(null, "You think you can just get away with that?");
            JOptionPane.showMessageDialog(null, "*Virtually shits on you*");
        }
    }     
}   
