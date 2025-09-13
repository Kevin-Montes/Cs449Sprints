package app;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class main{
	static GuiShowcase frame;
	
	public static void main(String[] args) {
		
		try {
			frame =  new GuiShowcase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public double calculateAverageOfThree(int x, int y, int z) {
		x+=y+z;
		return x/3;
		
		
	}
	
	public int getFactorial(int x){
		if(x>0 && x!=1) {
			return x * getFactorial(x-1);
		}
		return 1;
		
	}
	public class GuiShowcase extends JFrame{
		public GuiShowcase() {
		super("GUI");
		
		JRadioButton button1 = new JRadioButton("option 1");
		JRadioButton button2 = new JRadioButton("option 2");
		ButtonGroup options = new ButtonGroup();
		options.add(button1);
		options.add(button2);
		
		
		setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
		
		
	}
}
	

}
	
	
	