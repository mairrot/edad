package edad;

import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nu,su,in,con;
		Scanner scan = new Scanner(System.in);
		System.out.println("la edad de cuantos alumnos desea ingresar?");
		in=scan.nextInt();
		su=0;
		con=0;
		do {
			nu=scan.nextInt();
			System.out.println("la edad del alumno es: " + nu);
			su=su+nu;
			con=con+1;
		}
		while (con<in);
		System.out.println("el promedio es: " + su/5);
	}

}
