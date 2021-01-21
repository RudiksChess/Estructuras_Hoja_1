
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		int opcion= 0; 

		
		double[] AM = {530,540,550,560,570,580,590,600,610,620,630,640,650,660,670,680,
				690,700,710,720,730,740,750,760,770,780,790,800,810,820,830,840,850,
				860,870,880,890,900,910,920,930,940,950,960,970,980,990,1000,1010,1020,
				1030,1040,1050,1060,1070,1080,1090,1100,1110,1120,1130,1140,1150,1160,
				1170,1180,1190,1200,1210,1220,1230,1240,1250,1260,1270,1280,1290,1300,
				1310,1320,1330,1340,1350,1360,1370,1380,1390,1400,1410,1420,1430,1440,
				1450,1460,1470,1480,1490,1500,1510,1520,1530,1540,1550,1560,1570,1580,1590,1600,1610};
				
		double[] FM = {87.9,88.1,88.3,88.5,88.7,88.9,89.1,89.3,89.5,89.7,89.9,90.1,90.3,90.5,
				90.7,90.9,91.1,91.3,91.5,91.7,91.9,92.1,92.3,92.5,92.7,92.9,93.1,93.3,93.5,
				93.7,93.9,94.1,94.3,94.5,94.7,94.9,95.1,95.3,95.5,95.7,95.9,96.1,96.3,96.5,
				96.7,96.9,97.1,97.3,97.5,97.7,97.9,98.1,98.3,98.5,98.7,98.9,99.1,99.3,99.5,
				99.7,99.9,100.1,100.3,100.5,100.7,100.9,101.1,101.3,101.5,101.7,101.9,102.1,
				102.3,102.5,102.7,102.9,103.1,103.3,103.5,103.7,103.9,104.1,104.3,104.5,104.7,
				104.9,105.1,105.3,105.5,105.7,105.9,106.1,106.3,106.5,106.7,106.9,107.1,107.3,107.5,107.7,107.9};
		
		double[] AM_fav={870,880,890,900,910,920};
		double[] FM_fav= {99.9,100.1,100.3,100.5,100.7,100.9};
		Scanner entrada = new Scanner(System.in);
		Reproductor rAM=  new Reproductor(AM,AM_fav,0);
		Reproductor rFM=  new Reproductor(FM,FM_fav,0);
		
		
		
		while(opcion != 6){
			System.out.println("Que desea hacer?");
			System.out.println("1.Encender");
			System.out.println("2.Apagar");
			int a= entrada.nextInt();
			if (a == 1){
				System.out.println("Seleccione su emisora ");
				System.out.println("1. AM");
				System.out.println("2.FM");
				int dato = entrada.nextInt();
				if (dato == 1){
					System.out.println("###########EMISORA###########");
					System.out.println("###########"+rAM.actual());
					System.out.println("\n MENU:\n 1.siguiente  \n 2.Retroceder     \n3.Guardar  \n 4, Lista de favoritas ");
					int index = entrada.nextInt();
					if(index == 1){
						int b = rAM.continuar();
						System.out.println("Su emisora actual es:"+AM[b]);
						
					}else if(index ==2){
						int x = rAM.retroceder();
						System.out.println("Su emisora actual es:"+ AM[x]);
						
					}else if(index == 3){
						System.out.println("Ingrse el indice en el que desea agregar");
						int indice = entrada.nextInt();
						System.out.println("Ingrse su nueva emisora");
						int nuevo = entrada.nextInt();
						rAM.guardar(indice,nuevo);
						System.out.println("su nueva emisora"+nuevo+"se ha guardado con exito");
						
						
						
						
					}else if( index == 4){
						System.out.println("Sus emisoras favoritas son:"+AM_fav[0]+"\n"+AM_fav[1]+"\n"+AM_fav[2]+"\n"+AM_fav[3]+"\n"+AM_fav[4]+"\n"+AM_fav[5]);
						
						
					}else if( index > 4){
						System.out.println("Dato invalido ");
					}
				}else if (dato == 2){
					System.out.println("###########EMISORA###########");
					System.out.println("###########"+rFM.actual());
					System.out.println("\n MENU:\n 1.siguiente  \n 2.Retroceder    \n3.Guardar  \n 4, Lista de favoritas ");
					int index = entrada.nextInt();
					if(index == 1){
						int c = rFM.continuar();
					System.out.println("Su emisora actual es:"+FM[c]);
						
					}else if(index ==2){
						int d =  rFM.retroceder();
						System.out.println("Su emisora actual es:"+FM[d]);
						
					}else if(index == 3){
						System.out.println("Ingrse el indice en el que desea agregar");
						int indice1 = entrada.nextInt();
						System.out.println("Ingrse su nueva emisora");
						int nuevo1 = entrada.nextInt();
						rAM.guardar(indice1,nuevo1);
						System.out.println("su nueva emisora"+nuevo1+"se ha guardado con exito");
						
					}else if( index == 4){
					System.out.println("Sus emisoras favoritas son:");
					System.out.println("Sus emisoras favoritas son:"+FM_fav[0]+"\n"+FM_fav[1]+"\n"+FM_fav[2]+"\n"+FM_fav[3]+"\n"+FM_fav[4]+"\n"+FM_fav[5]);
							
					}else if( index > 4){
						System.out.println("Dato invalido ");
					}
				
			}else if (dato >2){
				System.out.println("Dato invalido ");
				
			}

			}else if(a == 2){
				System.out.println("¡¡¡¡¡Bye!!!!! ");
				
			}else if( a > 2){
				System.out.println("Dato invalido");
				}
			
			}
			
		}
		
		
		
}
