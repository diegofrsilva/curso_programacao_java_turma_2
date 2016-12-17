package br.com.dextraining.exemplodate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LeituraDate {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Informe data como string: ");
		Scanner scanner = new Scanner(System.in);
		String dataString = scanner.nextLine();
		Date minhaData = format.parse(dataString);

		System.out.println(minhaData);
		scanner.close();
	}
}
