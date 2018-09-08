package com.igor.generateExcel.model;

public class TestaGeradorExcel {
	public static void main(String[] args) {
		String entradaDados = "J;\n" + 
				"34666487000168;\n" + 
				"20;\n" + 
				"2018-08-28 15:47:07.877;\n" + 
				"1500;\n" + 
				"0057494;\n" + 
				"0;\n" + 
				"10082567503;\n" + 
				"004;\n" + 
				"341;\n" + 
				"1500;\n" + 
				"0057494;\n" + 
				"0;\n" + 
				"J;\n" + 
				"34666487000168;\n" + 
				"00790261;\n" + 
				"2018-08-28 15:47:00.600;\n" + 
				"505.88;\n" + 
				"2018-08-28 15:47:07.877;\n" + 
				"505.88;\n" + 
				"002;\n" + 
				"N;\n" + 
				"2018-08-28 15:47:07.877;\n" + 
				"D;\n" + 
				"00;\n" + 
				"302;\n" + 
				"00000;\n" + 
				"'SF';\n" + 
				"302;\n" + 
				"505.88;\n" + 
				"002;\n" + 
				"1;\n" + 
				"0;\n" + 
				"' '"; 
		new GeradorExcel(entradaDados).converteStringToXLSX();
	}
}
