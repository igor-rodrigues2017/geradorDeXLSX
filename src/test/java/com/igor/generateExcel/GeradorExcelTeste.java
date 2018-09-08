package com.igor.generateExcel;

import org.junit.Test;

import com.igor.generateExcel.model.GeradorExcel;

public class GeradorExcelTeste {
	
	private final String entradaDados = "J(soli.COD_TIPO_PESS_CLIE);\n" + 
			"34666487000168(soli.NUM_CPF_CNPJ_CLIE_SOLT);\n" + 
			"20(soli.COD_SITU-DEBT);\n" + 
			"2018-08-28 15:47:07.877(soli.DAT_HOR_EFET_DEBT);\n" + 
			"1500(soli.AGENCIA_SOLT);\n" + 
			"0057494(soli.CONTA_SOLT);\n" + 
			"0(soli.DAC10_SOLT);\n" + 
			"10082567503(soli.NUM_CTRT);\n" + 
			"004(soli.TPEMPRES_CNTT);\n" + 
			"341(soli.CODBANCO_CNTT);\n" + 
			"1500(soli.AGENCIA_CNTT);\n" + 
			"0057494(soli.CONTA_CNTT);\n" + 
			"0(soli.DAC10_CNTT);\n" + 
			"J(soli.COD_TIPO_PESS_CLIE);\n" + 
			"34666487000168(movi.NUM_CPF_CNPJ_CONT_CNTT);\n" + 
			"00790261(movi.COD_SERV);\n" + 
			"2018-08-28 15:47:00.600(soli.DAT_HOR_SOLI_DEBT);\n" + 
			"505.88(soli.VLR_SOLI_DEBIT);\n" + 
			"2018-08-28 15:47:07.877(soli.DAT_HOR_EFET_DEBT);\n" + 
			"505.88(soli.VLR_EFEV_DEBIT);\n" + 
			"002(soli.COD_MOTI_RETO_EFET_DEBT);\n" + 
			"N(movi.IND_OPCA_DEBT_PACI);\n" + 
			"2018-08-28 15:47:07.877(soli.DAT_HOR_RETO_EFET_DEBT);\n" + 
			"D(soli.SEGCLI_CONT_SOLT);\n" + 
			"00(soli.COD_TIPO_CPSC_SALD_SOLI);\n" + 
			"302(soli.COD_CATE_CONT)\n" + 
			"00000(movi.NUM_SUB_CRTR);\n" + 
			"'SF'(movi.SIG3STM_EMIO);\n" + 
			"302(movi.COD_CATE_CONT);\n" + 
			"505.88(soli.VLR_EFEV_DEBIT);\n" + 
			"002(soli.COD_MOTI_RETO_SOLI);\n" + 
			"1(soli.COD_PROD_CONT_UNVL_SOLT);\n" + 
			"0(soli.COD_SUB_PROD_CONT_SOLT);\n" + 
			"' '(soli.CODMODUL_CONT_SOLT)"; 
	
	@Test
	public void deveCriarUmExcelApartirDeUmaString() {
		GeradorExcel geradorExcel = new GeradorExcel(entradaDados);
	}
}
