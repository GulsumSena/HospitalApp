import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GeneralSurgery extends Doctor{
	
	private static int available=1;
	private static int day=15;
	
	public GeneralSurgery (String name, String branche) {
		super(name, branche);
	}
		
	public static int getAvailable() {
		return available;
	}

	public static int getDay() {
		return day;
	}

	public void addGeneral() {
		Scanner acl=new Scanner(System.in);
		
		System.out.println();
		System.out.println("GENEL CERRAHİ");
		System.out.println("BOŞ KADRO SAYISI: "+available);
		System.out.println();
		
			if(super.getBranche().equalsIgnoreCase("genel cerrahi")) {
				if(available>=1) {
					System.out.println("Sayın "+super.getName()+" aramıza hoşgeldiniz.");
					available--;
					
					LocalDate ld1=LocalDate.of(2024, 1, day);
					DateTimeFormatter dtr=DateTimeFormatter.ofPattern("dd.MM.yyyy");
					
					String newld1=ld1.format(dtr);
					
					System.out.println("GÖRÜŞME TARİHİ: "+newld1);
					System.out.println("BOŞ KALAN GÖRÜŞME KONTENJANI: "+available);
					System.out.println();
					day++;
					System.out.println("-------------------------------");
					
				}else if(available<1) {
					System.out.println("GENEL CERRAHİ KADROLARI DOLU");
					System.out.println();
					System.out.println("-------------------------------");
				}
				
			}else {
				System.out.println("Sayın "+super.getName()+", Uzmanlık alanınız buraya uygun değil.");
				System.out.println();
				System.out.println("-------------------------------");
			}
		}
		
	}
