package com.fincatto.documentofiscal.cte300.classes.enviolote.consulta;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;

/**
 * @author Caio
 * @info Tipo Protocolo de status resultado do processamento da CT-e<br>
 * Dados do protocolo de status
 * */

@Root(name = "infProt")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeProtocoloInfo extends DFBase {

	@Element(name = "tpAmb", required = true)
    private DFAmbiente ambiente;
	
	@Element(name = "verAplic", required = true)
    private String versaoAplicacao;
	
	@Element(name = "chCTe", required = true)
    private String chave;
	
	@Element(name = "dhRecbto", required = true)
    private String dataRecebimento;
	
	@Element(name = "nProt", required = true)
    private String numeroProtocolo;
	
	@Element(name = "digVal", required = true)
    private String validador;
	
	@Element(name = "cStat", required = true)
    private String status;
	
	@Element(name = "xMotivo", required = true)
    private String motivo;
	
	@Attribute(name = "Id", required = false)
    private String id;

	public CTeProtocoloInfo() {
		this.ambiente = null;
		this.versaoAplicacao = null;
		this.chave = null;
		this.dataRecebimento = null;
		this.numeroProtocolo = null;
		this.validador = null;
		this.status = null;
		this.motivo = null;
		this.id = null;
	}

	public DFAmbiente getAmbiente() {
		return ambiente;
	}

	/**
	 * Identificação do Ambiente:<br>
	 * 1 - Produção<br>
	 * 2 - Homologação
	 * */
	public void setAmbiente(DFAmbiente ambiente) {
		this.ambiente = ambiente;
	}

	public String getVersaoAplicacao() {
		return versaoAplicacao;
	}

	/**
	 * Versão do Aplicativo que processou a NF-e
	 * */
	public void setVersaoAplicacao(String versaoAplicacao) {
		this.versaoAplicacao = versaoAplicacao;
	}

	public String getChave() {
		return chave;
	}

	/**
	 * Chaves de acesso da CT-e, compostas por: UF do emitente, AAMM da emissão da NFe, 
	 * CNPJ do emitente, modelo, subsérie e número da CT-e e código numérico+DV.
	 * */
	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getDataRecebimento() {
		return dataRecebimento;
	}

	/**
	 * Data e hora de processamento, no formato AAAA-MM-DDTHH:MM:SS TZD. Deve ser preenchida com data e hora da gravação no Banco em caso de Confirmação. 
	 * Em caso de Rejeição, com data e hora do recebimento do Lote de CT-e enviado.
	 * */
	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getNumeroProtocolo() {
		return numeroProtocolo;
	}

	/**
	 * Número do Protocolo de Status do CT-e. 1 posição tipo de autorizador (1 – Secretaria de Fazenda Estadual,  
	 * 3 - SEFAZ Virtual RS, 5 - SEFAZ Virtual SP ); 2 posições ano; 10 seqüencial no ano.
	 * */
	public void setNumeroProtocolo(String numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public String getValidador() {
		return validador;
	}

	/**
	 * Digest Value da CT-e processado. Utilizado para conferir a integridade do CT-e original.
	 * */
	public void setValidador(String validador) {
		this.validador = validador;
	}

	public String getStatus() {
		return status;
	}

	/**
	 * Código do status do CT-e.
	 * */
	public void setStatus(String status) {
		this.status = status;
	}

	public String getMotivo() {
		return motivo;
	}

	/**
	 * Descrição literal do status do CT-e.
	 * */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getId() {
		return id;
	}

	/**
	 * 
	 * */
	public void setId(String id) {
		this.id = id;
	}
}