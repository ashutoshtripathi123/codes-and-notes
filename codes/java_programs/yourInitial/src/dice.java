import java.util.Random;
public class dice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Random r = new Random();
        int dice1,dice2;
        do
        {
	        dice1 = 1+r.nextInt(6);
	        dice2 = 1+r.nextInt(6);
	        System.out.println("###Dice1 = "+dice1+"\n###Dice2 = "+dice2);
	        //System.out.println("Sum = "+(dice1+dice2));
	        Thread.sleep(1000);
        }while(dice1 != dice2);
	}

}
