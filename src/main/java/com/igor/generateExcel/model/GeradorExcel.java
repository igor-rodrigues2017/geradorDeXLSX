package com.igor.generateExcel.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * Classe responsável por criar um arquivo em xlsx a partir de um String;
 * @author igor
 *
 */
public class GeradorExcel {
	private String entradaDados;
	private String FILE_NAME;
	/**
	 * Construtor recebe a String para ser convertida;
	 * @param entaradaDados
	 */
	public GeradorExcel(String entaradaDados) {
		this.entradaDados = entaradaDados;
	}
	/**
	 * Separa a String recebida e devolve uma List
	 * @return
	 */
	public List<String> dividiEntrada(){
		String[] split = entradaDados.split(Pattern.quote(";"));
		List<String> list = Arrays.asList(split);
		return list;
	}
	/**
	 * Converte a String para xlsx
	 */
	public void converteStringToXLSX() {
		List<String> lista = this.dividiEntrada();
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Dados Debito Automático");
		sheet.setColumnWidth((short)0,(short) 7000);
		sheet.setColumnWidth((short)1,(short) 4200);
		
		Object[][] dados = {
				{"soli.COD_TIPO_PESS_CLIE", lista.get(0)},
				{"soli.NUM_CPF_CNPJ_CLIE_SOLT", lista.get(1)},
				{"soli.COD_SITU-DEBT", lista.get(2)},
				{"soli.DAT_HOR_EFET_DEBT", lista.get(3)},
				{"soli.AGENCIA_SOLT", lista.get(4)},
				{"soli.CONTA_SOLT", lista.get(5)},
				{"soli.DAC10_SOLT", lista.get(6)},
				{"soli.NUM_CTRT" , lista.get(7)},
				{"soli.TPEMPRES_CNTT", lista.get(8)},
				{"soli.CODBANCO_CNTT", lista.get(9)},
				{"soli.AGENCIA_CNTT", lista.get(10)},
				{"soli.CONTA_CNTT", lista.get(11)},
				{"soli.DAC10_CNTT", lista.get(12)},
				{"soli.COD_TIPO_PESS_CLIE", lista.get(13)},
				{"movi.NUM_CPF_CNPJ_CONT_CNTT", lista.get(14)},
				{"movi.COD_SERV", lista.get(15)},
				{"soli.DAT_HOR_SOLI_DEBT", lista.get(16)},
				{"soli.VLR_SOLI_DEBIT", lista.get(17)},
				{"soli.DAT_HOR_EFET_DEBT", lista.get(18)},
				{"soli.VLR_EFEV_DEBIT", lista.get(19)},
				{"soli.COD_MOTI_RETO_EFET_DEBT", lista.get(20)},
				{"movi.IND_OPCA_DEBT_PACI", lista.get(21)},
				{"soli.DAT_HOR_RETO_EFET_DEBT", lista.get(22)},
				{"soli.SEGCLI_CONT_SOLT", lista.get(23)},
				{"soli.COD_TIPO_CPSC_SALD_SOLI", lista.get(24)},
				{"soli.COD_CATE_CONT", lista.get(25)},
				{"movi.NUM_SUB_CRTR", lista.get(26)},
				{"movi.SIG3STM_EMIO", lista.get(27)},
				{"movi.COD_CATE_CONT", lista.get(28)},
				{"soli.VLR_EFEV_DEBIT", lista.get(29)},
				{"soli.COD_MOTI_RETO_SOLI", lista.get(30)},
				{"soli.COD_PROD_CONT_UNVL_SOLT", lista.get(31)},
				{"soli.COD_SUB_PROD_CONT_SOLT", lista.get(32)},
				{"soli.CODMODUL_CONT_SOLT", lista.get(33)}
		};
		System.out.println("Criando Excel");
		lacoDeCriacao(sheet, dados);
		
		try {
			FILE_NAME = "AGENCIA_SOLT" + lista.get(4) + "CONTA_SOLT" + lista.get(5) + ".xlsx";
			FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
			workbook.write(outputStream);
			workbook.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Criado");
	}

	private void lacoDeCriacao(XSSFSheet sheet, Object[][] dados) {
		int rowNum = 0;
		for (Object[] titulo : dados) {
			XSSFRow row = sheet.createRow(rowNum++);
			int colNum = 0;
			for (Object field : titulo) {
				XSSFCell cell = row.createCell(colNum++);
				cell.setCellValue((String) field);
			}
		}
	}
}
