package col735ReplicaCDB;

import cdbPoller.CustomerSede;

public class PollResult extends cdbPoller.CustomerSede
{
	private String tipo;
	private String guid;
	private String padre;
	private String packet;
	private String data;
	private String rank;
	
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo( String tipo )
	{
		this.tipo = tipo;
	}
	public String getGuid()
	{
		return guid;
	}
	public void setGuid( String guid )
	{
		this.guid = guid;
	}
	public String getPadre()
	{
		return padre;
	}
	public void setPadre( String padre )
	{
		this.padre = padre;
	}
	public String getPacket()
	{
		return packet;
	}
	public void setPacket( String packet )
	{
		this.packet = packet;
	}
	public String getData()
	{
		return data;
	}
	public void setData( String data )
	{
		this.data = data;
	}
	public String getRank()
	{
		return rank;
	}
	public void setRank( String rank )
	{
		this.rank = rank;
	}
	
	public CustomerSede toCustomerSede()
	{
		CustomerSede cs = new CustomerSede();
		
		cs.annoFatturato = this.annoFatturato;
		cs.annoFondazione = this.annoFondazione;
		cs.annoRiferimentoDipendenti = this.annoRiferimentoDipendenti;
		cs.areaElenco = this.areaElenco;
		cs.buonoOrdine = this.buonoOrdine;
		cs.cap = this.cap;
		cs.categoriaIstat = this.categoriaIstat;
		cs.categoriaMassimaMpesa = this.categoriaMassimaMpesa;
		cs.categoriaMerceologica = this.categoriaMerceologica;
		cs.cellula = this.cellula;
		cs.citta = this.citta;
		cs.civico = this.civico;
		cs.classificazionePMI = this.classificazionePMI;
		cs.codiceCategoriaIstat = this.codiceCategoriaIstat;
		cs.codiceCategoriaMassimaSpesa = this.codiceCategoriaMassimaSpesa;
		cs.codiceCategoriaMerceologica = this.codiceCategoriaMerceologica;
		cs.codiceComune = this.codiceComune;
		cs.codiceFiscale = this.codiceFiscale;
		cs.codiceFiscaleFatturazione = this.codiceFiscaleFatturazione;
		cs.codiceFrazione = this.codiceFrazione;
		cs.codiceNazione = this.codiceNazione;
		cs.codiceNazioneCustomer = this.codiceNazioneCustomer;
		cs.descNazione = this.descNazione;
		cs.codiceProvincia = this.codiceProvincia;
		cs.codiceSede = this.codiceSede;
		cs.codiceSedeOld = this.codiceSedeOld;
		cs.codProvinciaRea = this.codProvinciaRea;
		cs.cognome = this.cognome;
		cs.comune = this.comune;
		cs.coordinateManuali = this.coordinateManuali;
		cs.coordX = this.coordX;
		cs.coordY = this.coordY;
		cs.customerCessatoRiattivabile = this.customerCessatoRiattivabile;
		cs.customerId = this.customerId;
		cs.customerIdOld = this.customerIdOld;
		cs.dataTransazione = this.dataTransazione;
		cs.datoFiscaleEsteroCertificato = this.datoFiscaleEsteroCertificato;
		//cs.denominazioneaAlternativa = this.denominazioneaAlternativa;
		cs.dug = this.dug;
		cs.emailArricchimento = this.emailArricchimento;
		cs.emailArricchimentoId = this.emailArricchimentoId;
		cs.emailArricchimentoPecFlag = this.emailArricchimentoPecFlag;
		cs.emailBozze = this.emailBozze;
		cs.emailBozzeId = this.emailBozzeId;
		cs.emailBozzepecflag = this.emailBozzepecflag;
		cs.emailCommercialeIol = this.emailCommercialeIol;
		cs.emailCommercialeIolId = this.emailCommercialeIolId;
		cs.emailCommercialeiolPecFlag = this.emailCommercialeiolPecFlag;
		cs.emailFatturazione = this.emailFatturazione;
		cs.emailFatturazioneId = this.emailFatturazioneId;
		cs.emailFatturazionePecFlag = this.emailFatturazionePecFlag;
		cs.emailPostvendita = this.emailPostvendita;
		cs.emailPostvenditaId = this.emailPostvenditaId;
		cs.emailPostvenditaPecFlag = this.emailPostvenditaPecFlag;
		cs.entePubblicoFlag = this.entePubblicoFlag;
		cs.evento = this.evento;
		cs.fattelEttronicaObbligatoria = this.fattelEttronicaObbligatoria;
		cs.fatturato = this.fatturato;
		cs.formaGiuridica = this.formaGiuridica;
		cs.frazione = this.frazione;
		cs.idIndirizzo = this.idIndirizzo;
		cs.indirizzo = this.indirizzo;
		cs.industry = this.industry;
		cs.infoToponimo = this.infoToponimo;
		cs.insegna = this.insegna;
		//cs.ipa = this.ipa;
		cs.mercatoAggregato = this.mercatoAggregato;
		cs.nazioneSede = this.nazioneSede;
		cs.nome = this.nome;
		cs.noteRecapitoFattura = this.noteRecapitoFattura;
		cs.numeroDipendenti = this.numeroDipendenti;
		cs.numeroRea = this.numeroRea;
		cs.opec = this.opec;
		cs.opecConsegnabile = this.opecConsegnabile;
		cs.ordCust = this.ordCust;
		cs.ordSede = this.ordSede;
		cs.partitaIva = this.partitaIva;
		cs.potenzialeNIP = this.potenzialeNIP;
		cs.profCoordinateGeografiche = this.profCoordinateGeografiche;
		cs.provincia = this.provincia;
		cs.ragioneSociale = this.ragioneSociale;
		cs.sedeCessataRiattivabile = this.sedeCessataRiattivabile;
		cs.sedePrimariaFlag = this.sedePrimariaFlag;
		cs.sottoAreaMercato = this.sottoAreaMercato;
		cs.sottocClasseDipendenti = this.sottocClasseDipendenti;
		cs.sottocClasseFatturato = this.sottocClasseFatturato;
		cs.stato = this.stato;
		cs.statoCustomer = this.statoCustomer;
		cs.statoOpecCommAttualiz = this.statoOpecCommAttualiz;
		cs.statoSede = this.statoSede;
		cs.telefono1 = this.telefono1;
		cs.telefono1Id = this.telefono1Id;
		cs.telefono1Primario = this.telefono1Primario;
		cs.telefono2 = this.telefono2;
		cs.telefono2Id = this.telefono2Id;
		cs.telefono2Primario = this.telefono2Primario;
		cs.telefono3 = this.telefono3;
		cs.telefono3Id = this.telefono3Id;
		cs.telefono3Primario = this.telefono3Primario;
		cs.telefono4 = this.telefono4;
		cs.telefono4Id = this.telefono4Id;
		cs.telefono4Primario = this.telefono4Primario;
		cs.telefono5 = this.telefono5;
		cs.telefono5Id = this.telefono5Id;
		cs.telefono5Primario = this.telefono5Primario;
		cs.telefono6 = this.telefono6;
		cs.telefono6Id = this.telefono6Id;
		cs.telefono6Primario = this.telefono6Primario;
		cs.telefono7 = this.telefono7;
		cs.telefono7Id = this.telefono7Id;
		cs.telefono7Primario = this.telefono7Primario;
		cs.telefono8 = this.telefono8;
		cs.telefono8Id = this.telefono8Id;
		cs.telefono8Primario = this.telefono8Primario;
		cs.tipoMercato = this.tipoMercato;
		cs.tipoSocGiuridica = this.tipoSocGiuridica;
		cs.tipoSocieta = this.tipoSocieta;
		cs.tipoTelefono1 = this.tipoTelefono1;
		cs.tipoTelefono2 = this.tipoTelefono2;
		cs.tipoTelefono3 = this.tipoTelefono3;
		cs.tipoTelefono4 = this.tipoTelefono4;
		cs.tipoTelefono5 = this.tipoTelefono5;
		cs.tipoTelefono6 = this.tipoTelefono6;
		cs.tipoTelefono7 = this.tipoTelefono7;
		cs.tipoTelefono8 = this.tipoTelefono8;
		cs.toponimo = this.toponimo;
		cs.transactionId = this.transactionId;
		cs.ultimaPosizioneAmministrativa = this.ultimaPosizioneAmministrativa;
		cs.urlFanpage = this.urlFanpage;
		cs.urlFanpageId = this.urlFanpageId;
		cs.urlIstituzionale = this.urlIstituzionale;
		cs.urlIstituzionaleId = this.urlIstituzionaleId;
		cs.urlPagineBianche = this.urlPagineBianche;
		cs.urlPagineBiancheId = this.urlPagineBiancheId;
		cs.UrlPagineGialle = this.UrlPagineGialle;
		cs.UrlPagineGialleId = this.UrlPagineGialleId;
		cs.ClienteSpecialeFlg = this.ClienteSpecialeFlg;
		cs.priorita = this.priorita;
		cs.owner = this.owner;
		cs.padre = this.padre;
		cs.contabilitaCliente = this.contabilitaCliente;
		cs.categoriaAppartenenza = this.categoriaAppartenenza;
		cs.indicatorePA = this.indicatorePA;
		cs.consVTerziFlag = this.consVTerziFlag;
		cs.consProfilazFlag = this.consProfilazFlag;
		cs.tel1ConsFlag = this.tel1ConsFlag;
		cs.tel2ConsFlag = this.tel2ConsFlag;
		cs.tel3ConsFlag = this.tel3ConsFlag;
		cs.tel4ConsFlag = this.tel4ConsFlag;
		cs.tel5ConsFlag = this.tel5ConsFlag;
		cs.tel6ConsFlag = this.tel6ConsFlag;
		cs.tel7ConsFlag = this.tel7ConsFlag;
		cs.tel8ConsFlag = this.tel8ConsFlag;
		
		cs.tel1CustPrimFlag = this.tel1CustPrimFlag;
		cs.tel2CustPrimFlag = this.tel2CustPrimFlag;
		cs.tel3CustPrimFlag = this.tel3CustPrimFlag;
		cs.tel4CustPrimFlag = this.tel4CustPrimFlag;
		cs.tel5CustPrimFlag = this.tel5CustPrimFlag;
		cs.tel6CustPrimFlag = this.tel6CustPrimFlag;
		cs.tel7CustPrimFlag = this.tel7CustPrimFlag;
		cs.tel8CustPrimFlag = this.tel8CustPrimFlag;
		cs.emlFTUnsuscribe = this.emlFTUnsuscribe;
		cs.emlPVUnsuscribe = this.emlPVUnsuscribe;
		cs.emlCSUnsuscribe = this.emlCSUnsuscribe;
		
		cs.custPrivFlag = this.custPrivFlag;
		
		return cs;
	}
	@Override
	public String toString() {
		return "PollResult [tipo=" + tipo + ", guid=" + guid + ", padre=" + padre + ", packet=" + packet + ", data="
				+ data + ", rank=" + rank + ", annoFatturato=" + annoFatturato + ", annoFondazione=" + annoFondazione
				+ ", annoRiferimentoDipendenti=" + annoRiferimentoDipendenti + ", areaElenco=" + areaElenco
				+ ", buonoOrdine=" + buonoOrdine + ", cap=" + cap + ", categoriaIstat=" + categoriaIstat
				+ ", categoriaMassimaMpesa=" + categoriaMassimaMpesa + ", categoriaMerceologica="
				+ categoriaMerceologica + ", cellula=" + cellula + ", citta=" + citta + ", civico=" + civico
				+ ", classificazionePMI=" + classificazionePMI + ", codiceCategoriaIstat=" + codiceCategoriaIstat
				+ ", codiceCategoriaMassimaSpesa=" + codiceCategoriaMassimaSpesa + ", codiceCategoriaMerceologica="
				+ codiceCategoriaMerceologica + ", codiceComune=" + codiceComune + ", codiceFiscale=" + codiceFiscale
				+ ", codiceFiscaleFatturazione=" + codiceFiscaleFatturazione + ", codiceFrazione=" + codiceFrazione
				+ ", codiceNazione=" + codiceNazione + ", codiceNazioneCustomer=" + codiceNazioneCustomer
				+ ", descNazione=" + descNazione + ", codiceProvincia=" + codiceProvincia + ", codiceSede=" + codiceSede
				+ ", codiceSedeOld=" + codiceSedeOld + ", codProvinciaRea=" + codProvinciaRea + ", cognome=" + cognome
				+ ", comune=" + comune + ", coordinateManuali=" + coordinateManuali + ", coordX=" + coordX + ", coordY="
				+ coordY + ", customerCessatoRiattivabile=" + customerCessatoRiattivabile + ", customerId=" + customerId
				+ ", customerIdOld=" + customerIdOld + ", dataTransazione=" + dataTransazione
				+ ", datoFiscaleEsteroCertificato=" + datoFiscaleEsteroCertificato + ", dug=" + dug
				+ ", emailArricchimento=" + emailArricchimento + ", emailArricchimentoId=" + emailArricchimentoId
				+ ", emailArricchimentoPecFlag=" + emailArricchimentoPecFlag + ", emailBozze=" + emailBozze
				+ ", emailBozzeId=" + emailBozzeId + ", emailBozzepecflag=" + emailBozzepecflag
				+ ", emailCommercialeIol=" + emailCommercialeIol + ", emailCommercialeIolId=" + emailCommercialeIolId
				+ ", emailCommercialeiolPecFlag=" + emailCommercialeiolPecFlag + ", emailFatturazione="
				+ emailFatturazione + ", emailFatturazioneId=" + emailFatturazioneId + ", emailFatturazionePecFlag="
				+ emailFatturazionePecFlag + ", emailPostvendita=" + emailPostvendita + ", emailPostvenditaId="
				+ emailPostvenditaId + ", emailPostvenditaPecFlag=" + emailPostvenditaPecFlag + ", entePubblicoFlag="
				+ entePubblicoFlag + ", evento=" + evento + ", fattelEttronicaObbligatoria="
				+ fattelEttronicaObbligatoria + ", fatturato=" + fatturato + ", formaGiuridica=" + formaGiuridica
				+ ", frazione=" + frazione + ", idIndirizzo=" + idIndirizzo + ", indirizzo=" + indirizzo + ", industry="
				+ industry + ", infoToponimo=" + infoToponimo + ", insegna=" + insegna + ", mercatoAggregato="
				+ mercatoAggregato + ", nazioneSede=" + nazioneSede + ", nome=" + nome + ", noteRecapitoFattura="
				+ noteRecapitoFattura + ", numeroDipendenti=" + numeroDipendenti + ", numeroRea=" + numeroRea
				+ ", opec=" + opec + ", opecConsegnabile=" + opecConsegnabile + ", ordCust=" + ordCust + ", ordSede="
				+ ordSede + ", partitaIva=" + partitaIva + ", potenzialeNIP=" + potenzialeNIP
				+ ", profCoordinateGeografiche=" + profCoordinateGeografiche + ", provincia=" + provincia
				+ ", ragioneSociale=" + ragioneSociale + ", sedeCessataRiattivabile=" + sedeCessataRiattivabile
				+ ", sedePrimariaFlag=" + sedePrimariaFlag + ", sottoAreaMercato=" + sottoAreaMercato
				+ ", sottocClasseDipendenti=" + sottocClasseDipendenti + ", sottocClasseFatturato="
				+ sottocClasseFatturato + ", stato=" + stato + ", statoCustomer=" + statoCustomer
				+ ", statoOpecCommAttualiz=" + statoOpecCommAttualiz + ", statoSede=" + statoSede + ", telefono1="
				+ telefono1 + ", telefono1Id=" + telefono1Id + ", telefono1Primario=" + telefono1Primario
				+ ", telefono2=" + telefono2 + ", telefono2Id=" + telefono2Id + ", telefono2Primario="
				+ telefono2Primario + ", telefono3=" + telefono3 + ", telefono3Id=" + telefono3Id
				+ ", telefono3Primario=" + telefono3Primario + ", telefono4=" + telefono4 + ", telefono4Id="
				+ telefono4Id + ", telefono4Primario=" + telefono4Primario + ", telefono5=" + telefono5
				+ ", telefono5Id=" + telefono5Id + ", telefono5Primario=" + telefono5Primario + ", telefono6="
				+ telefono6 + ", telefono6Id=" + telefono6Id + ", telefono6Primario=" + telefono6Primario
				+ ", telefono7=" + telefono7 + ", telefono7Id=" + telefono7Id + ", telefono7Primario="
				+ telefono7Primario + ", telefono8=" + telefono8 + ", telefono8Id=" + telefono8Id
				+ ", telefono8Primario=" + telefono8Primario + ", tipoMercato=" + tipoMercato + ", tipoSocGiuridica="
				+ tipoSocGiuridica + ", tipoSocieta=" + tipoSocieta + ", tipoTelefono1=" + tipoTelefono1
				+ ", tipoTelefono2=" + tipoTelefono2 + ", tipoTelefono3=" + tipoTelefono3 + ", tipoTelefono4="
				+ tipoTelefono4 + ", tipoTelefono5=" + tipoTelefono5 + ", tipoTelefono6=" + tipoTelefono6
				+ ", tipoTelefono7=" + tipoTelefono7 + ", tipoTelefono8=" + tipoTelefono8 + ", toponimo=" + toponimo
				+ ", transactionId=" + transactionId + ", ultimaPosizioneAmministrativa="
				+ ultimaPosizioneAmministrativa + ", urlFanpage=" + urlFanpage + ", urlFanpageId=" + urlFanpageId
				+ ", urlIstituzionale=" + urlIstituzionale + ", urlIstituzionaleId=" + urlIstituzionaleId
				+ ", urlPagineBianche=" + urlPagineBianche + ", urlPagineBiancheId=" + urlPagineBiancheId
				+ ", UrlPagineGialle=" + UrlPagineGialle + ", UrlPagineGialleId=" + UrlPagineGialleId
				+ ", ClienteSpecialeFlg=" + ClienteSpecialeFlg + ", priorita=" + priorita + ", contabilitaCliente="
				+ contabilitaCliente + ", categoriaAppartenenza=" + categoriaAppartenenza + ", indicatorePA="
				+ indicatorePA + ", owner=" + owner + "]";
	}
}
