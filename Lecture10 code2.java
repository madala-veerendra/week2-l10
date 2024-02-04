//Dynamic poly:Overriding
abstract class Doctor{
    abstract void treatPatient();
}
class Physician extends Doctor{
    void treatPatient(){
        System.out.println("Hi! I am Physician \n I Treat patients using medicines");
    }
}
class Surgeon extends Doctor {
	 void treatPatient() {
		 System.out.println("Hi! I am Surgeon \n I Treat by doing surgery");
	 }
}
class Dentist extends Doctor {
	void treatPatient() {
		System.out.println("Hi! I am Dentist \n I treat Teeth");
	}    
}
public class L10C2 {
    public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Press 1 for Physician\nPress 2 for Surgeon\nPress 3 for Dentist");
		Doctor doc = null;
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			doc = new Physician();
		break;
		case 2:
			doc = new Surgeon();
			break;
		case 3:
			doc = new Dentist();
			break;
		default:
                        System.out.println("A Oh! Invalid Choice");
                        break;
		}
		if (choice<0 || choice>3){
                    System.exit(0);
                }
                else {
                    doc.treatPatient();
                }
	}
}
