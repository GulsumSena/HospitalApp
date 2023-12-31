import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner app=new Scanner(System.in);
		
		
		
		while(1==1) { 
			if(GeneralSurgery.getAvailable()==0 && InternalMedicine.getAvailable()==0 && Emergency.getAvailable()==0) {
				System.out.println("TÜM KADROLARIMIZ DOLDU. İLGİNİZ İÇİN TEŞEKKÜR EDERİZ.");
				break;
								
			}else {
				System.out.print("Ad-Soyad: ");
				String adSoyad=app.nextLine();
				
				System.out.print("Branş: ");
				String brans=app.nextLine();
				
				if(brans.equalsIgnoreCase("ACİL TIP")||brans.equalsIgnoreCase("Acil")) {
					Emergency e1=new Emergency(adSoyad, brans);
					e1.addEmergency();
					
				}else if(brans.equalsIgnoreCase("dahiliye")||brans.equalsIgnoreCase("iç hastalıkları")) {
					InternalMedicine m1=new InternalMedicine(adSoyad, brans);
					m1.addInternal();
					
				}else if(brans.equalsIgnoreCase("genel cerrahi")) {
					GeneralSurgery g1=new GeneralSurgery(adSoyad, brans);
					g1.addGeneral();
					
				}else {
					System.out.println("HENÜZ BU ALANDA ALIM YAPMIYORUZ.");
					System.out.println("----------------------------------");
				}
			}
			
		}		
	}
}
