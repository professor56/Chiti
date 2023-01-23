package Project;
//importing java util package.
import java.util.*;
public class Robot {
	//string data member name 
	String name;
	Scanner k= new Scanner (System.in);
	Random r=new Random();
	//constructor Robot
	public Robot(String n) {
		this.name=n;
		
	}
	//function calculate
	public void Calculate() {
		
		System.out.println("Enter the number");
		int num =k.nextInt();
		System.out.print("Choose the operator + - * / ");
		String ch=k.next();
		System.out.println();
		System.out.println("Enter the second number ");
		int p=k.nextInt();
		if(ch.equals("+")) {
			int result =num+p;
			System.out.println(num+" + "+p+" = "+result);
			
		}
		else if(ch.equals("-")) {
			int res=num-p;
			System.out.println(num+" - "+p+" = "+res);
			
		}
		else if(ch.equals("*") || ch.equals("x") || ch.equals("X")) {
			int res =num*p;
			System.out.println(num+" * "+p+" = "+res);
		}
		else if(ch.equals("/")) {
			float f=num/p;
			System.out.println(num+" / "+p+" ="+f);
		}
			
	}
	public void On(int num,String n) {
		if(num==11923) {
			System.out.println("Hello aditya sir  my name is : "+n);
			
		}
		else {
			System.out.println("Sorry sir you are not aditya sir ");
			return;
		}
	}
	public void Age(String n) {
		System.out.println("Enter the born year");
		int by=k.nextInt();
		System.out.println("Enter the current year");
		int cy=k.nextInt();
		int res=cy-by;
		System.out.println(n+" age : "+res);
	}
	public void Table() {
		System.out.println("Enter the number");
		int num=k.nextInt();
		System.out.println("How many table you want");
		int table=k.nextInt();
		for(int i=1;i<=table;i++) {
			int re=num*i;
			System.out.println(num+" X "+i+" = "+re);
		}
	}
	public void Drawhalfpymoid(int row,int column) {
		for(int i=0;i<=row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public void Dad() {
		System.out.println("Pradeep Bakshi");
	}
	public void Mom() {
		System.out.println("Taruna Bakshi");
	}
	public void Brother() {
		System.out.println("Vaibhav Bakshi"); 
	}
	public void Rectangle(int row,int column) {
		for (int i=0;i<=row;i++) {
			for(int j=0;j<=column;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public void Triangle(int b) {
		for(int i=1;i<=5;i++) {
			for(int sp=1;sp<=i-1;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=b;j++) {
				System.out.print(b);
			}
			 
			System.out.println();
		}
	}
	public void Alphabet() {
		char ch='A';
		System.out.println("How many alphabet");
		int kp=k.nextInt();
		for(int i=0;i<=kp;i++) {
			for(int j=0;j<=i;j++) {
				int h=(int)(ch);
				System.out.print(ch);
			}
			ch+=1;;
			System.out.println();
		}
		if(kp>26) {
			System.out.println("Invaild Alphabet");
		}
	}
	public void Rock() {
		
		String[] l= {"Rock","Paper","Scissor"};
		int c=r.nextInt(l.length);
		
		int myscore=0;
		int chitiscore=0;
		for(int round=5;round>=0;round--) {
			System.out.println("Round : "+round);
			
			System.out.println("My score : "+myscore);
			System.out.println("Chiti score : "+chitiscore);
			System.out.print("Enter the character : ");
			String in=k.next();
			
			System.out.println("My character : "+in);
			System.out.println("Chiti character : "+l[c]);
			if(in.equals("rock") && c==2) {
				myscore+=100;
			}
			if(in.equals("scissor") && c==1) {
				myscore+=100;
			}
			if(in.equals("paper") && c==0) {
				myscore+=100;
			}
			if(c==0 && in.equals("scissor")) {
				chitiscore+=100;
			}
			if(c==2 && in.equals("paper")) {
				chitiscore+=100;
			}
			if(c==1 && in.equals("rock")) {
				chitiscore+=100;
			}
			if(myscore>chitiscore && round==0) {
				System.out.println("Me: See chiti i won game");
				System.out.println("Chiti: sir i loose game next time i beat you");
				return;
			}
			if(chitiscore>myscore && round==0) {
				System.out.println("Me: Oh no shittttt!!!");
				return;
			}
			
			if(myscore==chitiscore && round==0) {
				System.out.println("Me: game is draw");
				System.out.println("Chiti: Yes game is draw");
				return;
			}

			
		} 
	}
	public void Guessnumber() {
		System.out.println("Guess number between 1 to 100");
		int num=k.nextInt();
		int chitinum=r.nextInt(1,100);
		System.out.println("My number : "+num);
		System.out.println("Chiti number : "+chitinum);
		if(num>=10 && num<=50) {
			System.out.println("Wrong answer!!");
		}
		if(num>=65 && num<=80) {
			System.out.println("Wrong answer");
		}
		if(num==98) {
			System.out.println("Correct answer!!!");
		}
		if(chitinum==98) {
			System.out.println("Correct answer!!!");
		}else {
			System.out.println("Wrong answer");
		}
	}
	public void Passwords(int pin) {
		if(pin==10475) {
		System.out.println("Google : aditya@80");
		System.out.println("Github : aditya7676");
		System.out.println("Instragram : aditya11");
		}else {
			System.out.println("Sorry wrong pin");
			return;
		}
	}


	public static void main(String[] args) {
		boolean b=true;
		String n="Chiti";
		Scanner in=new Scanner(System.in);
		Robot chiti=new Robot(n);
		
	
		System.out.println("Enter the pin");
		int pin=in.nextInt();
		chiti.On(pin, n);
		 
		while(b) {
			System.out.println("Listening......");
			String ip=in.nextLine();
			if(ip.equals("off") || ip.equals("Off")) {
				b=false;
				System.out.println("Ok bye sir!!!!!");
				
			}
			if(ip.equals("Calculate") || ip.equals("chiti do calculation")) {
				chiti.Calculate();
			}
			 if(ip.equals("chiti do age calculate")) {
				 System.out.println("Enter the name");
				 String nn=in.nextLine();
				 chiti.Age(nn);
			 }
			 if(ip.equals("chiti find table")) {
				 chiti.Table();
			 }
			 if(ip.equals("chiti draw half pyramid")) {
				 System.out.println("Enter the row");
				 int row=in.nextInt();
				 System.out.println("Enter the column");
				 int column=in.nextInt();
				 chiti.Drawhalfpymoid(row, column);
			 }
			 if(ip.equals("chiti draw rectangle")) {
				 System.out.println("How many row");
				 int r=in.nextInt();
				 System.out.println("How many column");
				 int col=in.nextInt();
				 chiti.Rectangle(r, col);
			 }
			 if(ip.equals("hi chiti") || ip.equals("namaste chiti") || ip.equals("hello chiti")) {
				 System.out.println("Hello world I am robo chiti version 1.0");
			 }
			 if(ip.equals("how are you chiti")) {
				 System.out.println("I am fine boss");
			 }
			 if(ip.equals("chiti tell me who is prime minister of india")) {
				 System.out.println("Shri.Narendra Damodardas Modi");
			 }
			 if(ip.equals("you like movies chiti")) {
				 System.out.println("Yes RRR KGF2 PUSHPA");
			 }
			 if(ip.equals("chiti draw triangle")) {
				 System.out.println("How many number");
				 int num=in.nextInt();
				 chiti.Triangle(num);
				 
			 }
			 if(ip.equals("chiti tell alphabet")) {
				 chiti.Alphabet();
			 }
			 if(ip.equals("chiti play rock paper scissor")) {
				 chiti.Rock();
			 }
			 if(ip.equals("chiti play guess number")) {
				 chiti.Guessnumber();
			 }
			 
		}
	}

}
