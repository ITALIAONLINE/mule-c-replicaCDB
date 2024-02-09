package cdbPoller;

import org.apache.commons.lang3.StringUtils;

public class Account 
{
	private String TransactionId;
	private String Codice_Customer__c;
	private String Codice_Customer__c_old;
	private String Codice_Sede__c;
	private String IOL_CodiceSede_old;
	private String RecordTypeId;
	private String Evento;
	private String Name;
	private String IOL_AnnoFatturato__c;
	private String Anno_Fondazione__c;
	private String IOL_AnnoRiferimentoDipendenti__c;
	private String IOL_CustomerCountryCod__c;
	private String AnnualRevenue;
	private String BillingCity;
	private String BillingCountry;
	private String BillingCountryCod;
	private String BillingState;
	private String BillingStreet;
	private String IOL_BuonoOrdine__c;
	private String Cap__c;
	private String IOL_CodiceCategoriaMercMassimaSpesa__c;
	private String IOL_Categoria__c;
	private String Cellula__c;
	private String IOL_classificazionePMI__c;
	private String IOL_CodiceAreaElenco__c;
	private String IOL_CodiceCategoriaISTAT__c;
	private String IOL_CodiceCategoriaMerceologica__c;
	private String Codice_Comune_IOL__c;
	private String Codice_Stato_Customer__c;
	private String CodiceFiscale__c;
	private String Codice_Frazione__c;
	private String Codice_IPA__c;
	private String Codice_Provincia_REA__c;
	private String IOL_NumeroREA__c;
	private String Codice_Stato_Sede__c;
	private String IOL_CognomePersonaFisica__c;
	private String Comune_IOL__c;
	private String Coordinate_Anagrafiche__cX;
	private String Coordinate_Anagrafiche__cY;
	private String Coordinate_Manuali__c;
	private String Dato_Fiscale_Estero_Certificato__c;
	private String Denominazione_Alternativa__c;
	private String IOL_CategoriaISTAT__c;
	private String IOL_CategoriaMerceologica__c;
	private String DUG__c;
	private String Email_Arricchimento__c;
	private String Email_Arricchimento_ID__c;
	private String Email_Bozze__c;
	private String Email_Bozze_ID__c;
	private String Email_Commerciale_IOL__c;
	private String Email_Commerciale_IOL_ID__c;
	private String Email_Fatturazione__c;
	private String Email_Fatturazione_ID__c;
	/*private String Email_Fatturazione_Elettronica__c;
	private String Email_Fatturazione_Elettronica_ID__c;*/
	private String Email_Post_Vendita__c;
	private String Email_Post_Vendita_ID__c;
	private String IOL_Email_Arricchimento_PEC__c;
	private String IOL_Email_Bozze_PEC__c;
	private String IOL_Email_Commerciale_IOL_PEC__c;
	private String IOL_Email_Fatturazione_PEC__c;
	//private String IOL_Email_Fatturazione_Elettronica_PEC__c;
	private String IOL_Email_Post_Vendita_PEC__c;
	private String Ente_Pubblico__c;
	private String Fatturazione_Codice_Fiscale__c;
	private String Fatturazione_Elettronica_Obbligatoria__c;
	private String Frazione__c;
	private String IOL_IndirizzoID__c;
	private String Info_Toponimo__c;
	private String Insegna__c;
	private String IOL_MercatoAggregato__c;
	private String Industry;
	private String Nazione__c;
	private String IOL_PotenzialeNIP__c;
	private String IOL_NomePersonaFisica__c;
	private String Note_sul_Recapito_Fattura__c;
	private String Numero_Civico__c;
	private String NumberOfEmployees;
	private String Opec__c;
	private String IOL_OpecConsegnabile__c;
	private String PartitaIva__c;
	private String Profondita_Coordinate_Anagrafiche__c;
	private String Provincia_IOL__c;
	private String IOL_CustomerCessatoRiattivabile__c;
	private String IOL_SedeCessataRiattivabile__c;
	private String Sede_Primaria_OPEC__c;
	private String IOL_SottoareaMercato__c;
	private String IOL_SottoclasseDipendenti__c;
	private String IOL_SottoclasseFatturato__c;
	private String IOL_TipoMercato__c;
	private String Telefono_1_ID__c;
	private String Phone;
	private String Primario1__c;
	private String TipologiaTelefono1__c;
	private String Telefono_2_ID__c;
	private String Telefono2__c;
	private String Primario2__c;
	private String TipologiaTelefono2__c;
	private String Telefono_3_ID__c;
	private String Telefono3__c;
	private String Primario3__c;
	private String TipologiaTelefono3__c;
	private String Telefono_4_ID__c;
	private String Telefono4__c;
	private String Primario4__c;
	private String TipologiaTelefono4__c;
	private String Telefono_5_ID__c;
	private String Telefono5__c;
	private String Primario5__c;
	private String TipologiaTelefono5__c;
	private String Telefono_6_ID__c;
	private String Telefono6__c;
	private String Primario6__c;
	private String TipologiaTelefono6__c;
	private String Telefono_7_ID__c;
	private String Telefono7__c;
	private String Primario7__c;
	private String TipologiaTelefono7__c;
	private String Telefono_8_ID__c;
	private String Telefono8__c;
	private String Primario8__c;
	private String TipologiaTelefono8__c;
	private String Tipologia_Persona_Giuridica__c;
	private String Tipologia_societa_giuridica__c;
	private String Toponimo__c;
	private String Ultima_Posizione_Amminstrativa__c;
	private String Type;
	private String URL_ID_Fanpage__c;
	private String URL_Fanpage__c;
	private String URL_ID_Istituzionale__c;
	private String Website;
	private String URL_ID_Pagine_Bianche__c;
	private String URL_Pagine_Bianche__c;
	private String URL_ID_Pagine_Gialle__c;
	private String URL_Pagine_Gialle__c;
	private String IOL_CodiceIndicatoreClientiSpeciali__c;
	
	private String owner;
	
	private String IOL_GruppoContabilitaCliente__c;
	private String IOL_CategoriaDiAppartenenza__c;
	private String IOL_TipoDiPubblicaAmministrazione__c;
	
	private String IOL_ConsensoVenditaTerzi__c;
	private String IOL_ConsensoProfilazione__c;
	private String IOL_ConsensoTelefono1__c;
	private String IOL_ConsensoTelefono2__c;
	private String IOL_ConsensoTelefono3__c;
	private String IOL_ConsensoTelefono4__c;
	private String IOL_ConsensoTelefono5__c;
	private String IOL_ConsensoTelefono6__c;
	private String IOL_ConsensoTelefono7__c;
	private String IOL_ConsensoTelefono8__c;
	
	private String PrimarioCustomer1__c;
	private String PrimarioCustomer2__c;
	private String PrimarioCustomer3__c;
	private String PrimarioCustomer4__c;
	private String PrimarioCustomer5__c;
	private String PrimarioCustomer6__c;
	private String PrimarioCustomer7__c;
	private String PrimarioCustomer8__c;
	
	private String Email_Fatturazione_CodUns__c;
	private String Email_Post_Vendita_IOL_CodUns__c;
	private String Email_Commerciale_IOL_CodUns__c;
	
	private String IOL_Privato__c;
	
	/*public Account( CustomerSede cs )
	{
		if ( cs != null )
		{
			TransactionId = cs.transactionId ;
			Codice_Customer__c = cs.customerId ;
			Codice_Sede__c = cs.codiceSede ;
			RecordTypeId = "S".equalsIgnoreCase(cs.sedePrimariaFlag) ? "Customer" : "Sede";
			Evento = cs.evento;
			owner = cs.owner;
			Name = cs.ragioneSociale ;
			IOL_AnnoFatturato__c = cs.annoFatturato ;
			Anno_Fondazione__c = cs.annoFondazione ;
			IOL_AnnoRiferimentoDipendenti__c = cs.annoRiferimentoDipendenti ;
			AnnualRevenue = cs.fatturato ;
			BillingCity = cs.citta ;
			BillingCountry = cs.nazioneSede ;
			BillingState = cs.codiceProvincia ;
			BillingStreet = cs.indirizzo ;
			IOL_BuonoOrdine__c = cs.buonoOrdine ;
			Cap__c = cs.cap ;
			IOL_CodiceCategoriaMercMassimaSpesa__c = cs.codiceCategoriaMassimaSpesa ;
			IOL_Categoria__c = cs.categoriaMassimaMpesa ;
			Cellula__c = cs.cellula ;
			IOL_classificazionePMI__c = cs.classificazionePMI ;
			IOL_CodiceAreaElenco__c = cs.areaElenco ;
			IOL_CodiceCategoriaISTAT__c = cs.codiceCategoriaIstat ;
			IOL_CodiceCategoriaMerceologica__c = cs.codiceCategoriaMerceologica ;
			Codice_Comune_IOL__c = cs.codiceComune ;
			Codice_Stato_Customer__c = cs.statoCustomer ;
			CodiceFiscale__c = cs.codiceFiscale ;
			Codice_Frazione__c = cs.codiceFrazione ;
			Codice_IPA__c = cs.ipa ;
			Codice_Provincia_REA__c = cs.codProvinciaRea ;
			IOL_NumeroREA__c = cs.numeroRea ;
			Codice_Stato_Sede__c = cs.statoSede ;
			IOL_CognomePersonaFisica__c = cs.cognome ;
			Comune_IOL__c = cs.comune ;
			Coordinate_Anagrafiche__cX = cs.coordX ;
			Coordinate_Anagrafiche__cY = cs.coordY ;
			Coordinate_Manuali__c = cs.coordinateManuali ;
			Dato_Fiscale_Estero_Certificato__c = cs.datoFiscaleEsteroCertificato ;
			Denominazione_Alternativa__c = cs.denominazioneaAlternativa ;
			IOL_CategoriaISTAT__c = cs.categoriaIstat ;
			IOL_CategoriaMerceologica__c = cs.categoriaMerceologica ;
			DUG__c = cs.dug ;
			Email_Arricchimento__c = cs.emailArricchimento ;
			Email_Arricchimento_ID__c = cs.emailArricchimentoId ;
			Email_Bozze__c = cs.emailBozze ;
			Email_Bozze_ID__c = cs.emailBozzeId ;
			Email_Commerciale_IOL__c = cs.emailCommercialeIol ;
			Email_Commerciale_IOL_ID__c = cs.emailCommercialeIolId ;
			Email_Fatturazione__c = cs.emailFatturazione ;
			Email_Fatturazione_ID__c = cs.emailFatturazioneId ;
			Email_Fatturazione_Elettronica__c = cs.emailFattElettronica ;
			Email_Fatturazione_Elettronica_ID__c = cs.emailFattElettronicaId ;
			Email_Post_Vendita__c = cs.emailPostvendita ;
			Email_Post_Vendita_ID__c = cs.emailPostvenditaId ;
			IOL_Email_Arricchimento_PEC__c = cs.emailArricchimentoPecFlag ;
			IOL_Email_Bozze_PEC__c = cs.emailBozzepecflag ;
			IOL_Email_Commerciale_IOL_PEC__c = cs.emailCommercialeiolPecFlag ;
			IOL_Email_Fatturazione_PEC__c = cs.emailFatturazionePecFlag ;
			IOL_Email_Fatturazione_Elettronica_PEC__c = cs.emailFattElettronicaPecFlag ;
			IOL_Email_Post_Vendita_PEC__c = cs.emailPostvenditaPecFlag ;
			Ente_Pubblico__c = cs.entePubblicoFlag ;
			Fatturazione_Codice_Fiscale__c = cs.codiceFiscaleFatturazione ;
			Fatturazione_Elettronica_Obbligatoria__c = cs.fattelEttronicaObbligatoria ;
			Frazione__c = cs.frazione ;
			IOL_IndirizzoID__c = cs.idIndirizzo ;
			Info_Toponimo__c = cs.infoToponimo ;
			Insegna__c = cs.insegna ;
			IOL_MercatoAggregato__c = cs.mercatoAggregato ;
			Industry = cs.industry ;
			Nazione__c = cs.codiceNazione ;
			IOL_PotenzialeNIP__c = cs.potenzialeNIP ;
			IOL_NomePersonaFisica__c = cs.nome ;
			Note_sul_Recapito_Fattura__c = cs.noteRecapitoFattura ;
			Numero_Civico__c = cs.civico ;
			NumberOfEmployees = cs.numeroDipendenti ;
			Opec__c = cs.opec ;
			IOL_OpecConsegnabile__c = cs.opecConsegnabile ;
			PartitaIva__c = cs.partitaIva ;
			Profondita_Coordinate_Anagrafiche__c = cs.profCoordinateGeografiche ;
			Provincia_IOL__c = cs.provincia ;
			IOL_CustomerCessatoRiattivabile__c = cs.customerCessatoRiattivabile ;
			IOL_SedeCessataRiattivabile__c = cs.sedeCessataRiattivabile ;
			Sede_Primaria_OPEC__c = cs.sedePrimariaFlag ;
			IOL_SottoareaMercato__c = cs.sottoAreaMercato ;
			IOL_SottoclasseDipendenti__c = cs.sottocClasseDipendenti ;
			IOL_SottoclasseFatturato__c = cs.sottocClasseFatturato ;
			IOL_TipoMercato__c = cs.tipoMercato ;
			Telefono_1_ID__c = cs.telefono1Id ;
			Phone = cs.telefono1 ;
			Primario1__c = cs.telefono1Primario ;
			TipologiaTelefono1__c = cs.tipoTelefono1 ;
			Telefono_2_ID__c = cs.telefono2Id ;
			Telefono2__c = cs.telefono2 ;
			Primario2__c = cs.telefono2Primario ;
			TipologiaTelefono2__c = cs.tipoTelefono2 ;
			Telefono_3_ID__c = cs.telefono3Id ;
			Telefono3__c = cs.telefono3 ;
			Primario3__c = cs.telefono3Primario ;
			TipologiaTelefono3__c = cs.tipoTelefono3 ;
			Telefono_4_ID__c = cs.telefono4Id ;
			Telefono4__c = cs.telefono4 ;
			Primario4__c = cs.telefono4Primario ;
			TipologiaTelefono4__c = cs.tipoTelefono4 ;
			Telefono_5_ID__c = cs.telefono5Id ;
			Telefono5__c = cs.telefono5 ;
			Primario5__c = cs.telefono5Primario ;
			TipologiaTelefono5__c = cs.tipoTelefono5 ;
			Telefono_6_ID__c = cs.telefono6Id ;
			Telefono6__c = cs.telefono6 ;
			Primario6__c = cs.telefono6Primario ;
			TipologiaTelefono6__c = cs.tipoTelefono6 ;
			Telefono_7_ID__c = cs.telefono7Id ;
			Telefono7__c = cs.telefono7 ;
			Primario7__c = cs.telefono7Primario ;
			TipologiaTelefono7__c = cs.tipoTelefono7 ;
			Telefono_8_ID__c = cs.telefono8Id ;
			Telefono8__c = cs.telefono8 ;
			Primario8__c = cs.telefono8Primario ;
			TipologiaTelefono8__c = cs.tipoTelefono8 ;
			Tipologia_Persona_Giuridica__c = cs.formaGiuridica ;
			Tipologia_societa_giuridica__c = cs.tipoSocGiuridica ;
			Toponimo__c = cs.toponimo ;
			Ultima_Posizione_Amminstrativa__c = cs.ultimaPosizioneAmministrativa ;
			Type = cs.tipoSocieta ;
			URL_ID_Fanpage__c = cs.urlFanpageId ;
			URL_Fanpage__c = cs.urlFanpage ;
			URL_ID_Istituzionale__c = cs.urlIstituzionaleId ;
			Website = cs.urlIstituzionale ;
			URL_ID_Pagine_Bianche__c = cs.urlPagineBiancheId ;
			URL_Pagine_Bianche__c = cs.urlPagineBianche ;
			URL_ID_Pagine_Gialle__c = cs.UrlPagineGialleId ;
			URL_Pagine_Gialle__c = cs.UrlPagineGialle ;
			IOL_CodiceIndicatoreClientiSpeciali__c = cs.ClienteSpecialeFlg ;
		}
	}
	*/
	public String getTransactionId() {
		return TransactionId;
	}
	public String getCodice_Customer__c() {
		return Codice_Customer__c;
	}
	public String getCodice_Sede__c() {
		return Codice_Sede__c;
	}
	public String getRecordTypeId() {
		return RecordTypeId;
	}
	public String getName() {
		return Name;
	}
	public String getIOL_AnnoFatturato__c() {
		return IOL_AnnoFatturato__c;
	}
	public String getAnno_Fondazione__c() {
		return Anno_Fondazione__c;
	}
	public String getIOL_AnnoRiferimentoDipendenti__c() {
		return IOL_AnnoRiferimentoDipendenti__c;
	}
	public String getAnnualRevenue() {
		return AnnualRevenue;
	}
	public String getBillingCity() {
		return BillingCity;
	}
	public String getBillingCountry() {
		return BillingCountry;
	}
	public String getBillingState() {
		return BillingState;
	}
	public String getBillingStreet() {
		return BillingStreet;
	}
	public String getIOL_BuonoOrdine__c() {
		return IOL_BuonoOrdine__c;
	}
	public String getCap__c() {
		return Cap__c;
	}
	public String getIOL_CodiceCategoriaMercMassimaSpesa__c() {
		return IOL_CodiceCategoriaMercMassimaSpesa__c;
	}
	public String getIOL_Categoria__c() {
		return IOL_Categoria__c;
	}
	public String getCellula__c() {
		return Cellula__c;
	}
	public String getIOL_classificazionePMI__c() {
		return IOL_classificazionePMI__c;
	}
	public String getIOL_CodiceAreaElenco__c() {
		return IOL_CodiceAreaElenco__c;
	}
	public String getIOL_CodiceCategoriaISTAT__c() {
		return IOL_CodiceCategoriaISTAT__c;
	}
	public String getIOL_CodiceCategoriaMerceologica__c() {
		return IOL_CodiceCategoriaMerceologica__c;
	}
	public String getCodice_Comune_IOL__c() {
		return Codice_Comune_IOL__c;
	}
	public String getCodice_Stato_Customer__c() {
		return Codice_Stato_Customer__c;
	}
	public String getCodiceFiscale__c() {
		return CodiceFiscale__c;
	}
	public String getCodice_Frazione__c() {
		return Codice_Frazione__c;
	}
	public String getCodice_IPA__c() {
		return Codice_IPA__c;
	}
	public String getCodice_Provincia_REA__c() {
		return Codice_Provincia_REA__c;
	}
	public String getIOL_NumeroREA__c() {
		return IOL_NumeroREA__c;
	}
	public String getCodice_Stato_Sede__c() {
		return Codice_Stato_Sede__c;
	}
	public String getIOL_CognomePersonaFisica__c() {
		return IOL_CognomePersonaFisica__c;
	}
	public String getComune_IOL__c() {
		return Comune_IOL__c;
	}
	public String getCoordinate_Anagrafiche__cX() {
		return (Coordinate_Anagrafiche__cX != null ? Coordinate_Anagrafiche__cX.replace( ',', '.' ) : null );
	}
	public String getCoordinate_Anagrafiche__cY() {
		return (Coordinate_Anagrafiche__cY != null ? Coordinate_Anagrafiche__cY.replace( ',', '.' ) : null );
	}
	public String getCoordinate_Manuali__c() {
		return Coordinate_Manuali__c;
	}
	public String getDato_Fiscale_Estero_Certificato__c() {
		return Dato_Fiscale_Estero_Certificato__c;
	}
	public String getDenominazione_Alternativa__c() {
		return Denominazione_Alternativa__c;
	}
	public String getIOL_CategoriaISTAT__c() {
		return IOL_CategoriaISTAT__c;
	}
	public String getIOL_CategoriaMerceologica__c() {
		return IOL_CategoriaMerceologica__c;
	}
	public String getDUG__c() {
		return DUG__c;
	}
	public String getDug_Toponimo__c ()
	{
		return StringUtils.stripToEmpty( StringUtils.stripToEmpty( DUG__c ) + " " + StringUtils.stripToEmpty( Toponimo__c ) );
	}
	public String getEmail_Arricchimento__c() {
		return Email_Arricchimento__c;
	}
	public String getEmail_Arricchimento_ID__c() {
		return toNull(Email_Arricchimento_ID__c);
	}
	public String getEmail_Bozze__c() {
		return Email_Bozze__c;
	}
	public String getEmail_Bozze_ID__c() {
		return toNull(Email_Bozze_ID__c);
	}
	public String getEmail_Commerciale_IOL__c() {
		return Email_Commerciale_IOL__c;
	}
	public String getEmail_Commerciale_IOL_ID__c() {
		return toNull(Email_Commerciale_IOL_ID__c);
	}
	public String getEmail_Fatturazione__c() {
		return Email_Fatturazione__c;
	}
	public String getEmail_Fatturazione_ID__c() {
		return toNull(Email_Fatturazione_ID__c);
	}
	/*public String getEmail_Fatturazione_Elettronica__c() {
		return Email_Fatturazione_Elettronica__c;
	}
	public String getEmail_Fatturazione_Elettronica_ID__c() {
		return Email_Fatturazione_Elettronica_ID__c;
	}*/
	public String getEmail_Post_Vendita__c() {
		return Email_Post_Vendita__c;
	}
	public String getEmail_Post_Vendita_ID__c() {
		return toNull(Email_Post_Vendita_ID__c);
	}
	public String getIOL_Email_Arricchimento_PEC__c() {
		return IOL_Email_Arricchimento_PEC__c;
	}
	public String getIOL_Email_Bozze_PEC__c() {
		return IOL_Email_Bozze_PEC__c;
	}
	public String getIOL_Email_Commerciale_IOL_PEC__c() {
		return IOL_Email_Commerciale_IOL_PEC__c;
	}
	public String getIOL_Email_Fatturazione_PEC__c() {
		return IOL_Email_Fatturazione_PEC__c;
	}
	/*public String getIOL_Email_Fatturazione_Elettronica_PEC__c() {
		return IOL_Email_Fatturazione_Elettronica_PEC__c;
	}*/
	public String getIOL_Email_Post_Vendita_PEC__c() {
		return IOL_Email_Post_Vendita_PEC__c;
	}
	public String getEnte_Pubblico__c() {
		return Ente_Pubblico__c;
	}
	public String getFatturazione_Codice_Fiscale__c() {
		return Fatturazione_Codice_Fiscale__c;
	}
	public String getFatturazione_Elettronica_Obbligatoria__c() {
		return Fatturazione_Elettronica_Obbligatoria__c;
	}
	public String getFrazione__c() {
		return Frazione__c;
	}
	public String getIOL_IndirizzoID__c() {
		return toNull(IOL_IndirizzoID__c);
	}
	public String getInfo_Toponimo__c() {
		return Info_Toponimo__c;
	}
	public String getInsegna__c() {
		return Insegna__c;
	}
	public String getIOL_MercatoAggregato__c() {
		return IOL_MercatoAggregato__c;
	}
	public String getIndustry() {
		return Industry;
	}
	public String getNazione__c() {
		return Nazione__c;
	}
	public String getIOL_PotenzialeNIP__c() {
		return IOL_PotenzialeNIP__c;
	}
	public String getIOL_NomePersonaFisica__c() {
		return IOL_NomePersonaFisica__c;
	}
	public String getNote_sul_Recapito_Fattura__c() {
		return Note_sul_Recapito_Fattura__c;
	}
	public String getNumero_Civico__c() {
		return Numero_Civico__c;
	}
	public String getNumberOfEmployees() {
		return NumberOfEmployees;
	}
	public String getOpec__c() {
		return Opec__c;
	}
	public String getIOL_OpecConsegnabile__c() {
		return IOL_OpecConsegnabile__c;
	}
	public String getPartitaIva__c() {
		return PartitaIva__c;
	}
	public String getProfondita_Coordinate_Anagrafiche__c() {
		return Profondita_Coordinate_Anagrafiche__c;
	}
	public String getProvincia_IOL__c() {
		return Provincia_IOL__c;
	}
	public String getIOL_CustomerCessatoRiattivabile__c() {
		return IOL_CustomerCessatoRiattivabile__c;
	}
	public String getIOL_SedeCessataRiattivabile__c() {
		return IOL_SedeCessataRiattivabile__c;
	}
	public String getSede_Primaria_OPEC__c() {
		return Sede_Primaria_OPEC__c;
	}
	public String getIOL_SottoareaMercato__c() {
		return IOL_SottoareaMercato__c;
	}
	public String getIOL_SottoclasseDipendenti__c() {
		return IOL_SottoclasseDipendenti__c;
	}
	public String getIOL_SottoclasseFatturato__c() {
		return IOL_SottoclasseFatturato__c;
	}
	public String getIOL_TipoMercato__c() {
		return IOL_TipoMercato__c;
	}
	public String getTelefono_1_ID__c() {
		return toNull(Telefono_1_ID__c);
	}
	public String getPhone() {
		return Phone;
	}
	public String getPrimario1__c() {
		return Primario1__c;
	}
	public String getTipologiaTelefono1__c() {
		return TipologiaTelefono1__c;
	}
	public String getTelefono_2_ID__c() {
		return toNull(Telefono_2_ID__c);
	}
	public String getTelefono2__c() {
		return Telefono2__c;
	}
	public String getPrimario2__c() {
		return Primario2__c;
	}
	public String getTipologiaTelefono2__c() {
		return TipologiaTelefono2__c;
	}
	public String getTelefono_3_ID__c() {
		return toNull(Telefono_3_ID__c);
	}
	public String getTelefono3__c() {
		return Telefono3__c;
	}
	public String getPrimario3__c() {
		return Primario3__c;
	}
	public String getTipologiaTelefono3__c() {
		return TipologiaTelefono3__c;
	}
	public String getTelefono_4_ID__c() {
		return toNull(Telefono_4_ID__c);
	}
	public String getTelefono4__c() {
		return Telefono4__c;
	}
	public String getPrimario4__c() {
		return Primario4__c;
	}
	public String getTipologiaTelefono4__c() {
		return TipologiaTelefono4__c;
	}
	public String getTelefono_5_ID__c() {
		return toNull(Telefono_5_ID__c);
	}
	public String getTelefono5__c() {
		return Telefono5__c;
	}
	public String getPrimario5__c() {
		return Primario5__c;
	}
	public String getTipologiaTelefono5__c() {
		return TipologiaTelefono5__c;
	}
	public String getTelefono_6_ID__c() {
		return toNull(Telefono_6_ID__c);
	}
	public String getTelefono6__c() {
		return Telefono6__c;
	}
	public String getPrimario6__c() {
		return Primario6__c;
	}
	public String getTipologiaTelefono6__c() {
		return TipologiaTelefono6__c;
	}
	public String getTelefono_7_ID__c() {
		return toNull(Telefono_7_ID__c);
	}
	public String getTelefono7__c() {
		return Telefono7__c;
	}
	public String getPrimario7__c() {
		return Primario7__c;
	}
	public String getTipologiaTelefono7__c() {
		return TipologiaTelefono7__c;
	}
	public String getTelefono_8_ID__c() {
		return toNull(Telefono_8_ID__c);
	}
	public String getTelefono8__c() {
		return Telefono8__c;
	}
	public String getPrimario8__c() {
		return Primario8__c;
	}
	public String getTipologiaTelefono8__c() {
		return TipologiaTelefono8__c;
	}
	public String getTipologia_Persona_Giuridica__c() {
		return Tipologia_Persona_Giuridica__c;
	}
	public String getTipologia_societa_giuridica__c() {
		return Tipologia_societa_giuridica__c;
	}
	public String getToponimo__c() {
		return Toponimo__c;
	}
	public String getUltima_Posizione_Amminstrativa__c() {
		return Ultima_Posizione_Amminstrativa__c;
	}
	public String getType() {
		return Type;
	}
	public String getURL_ID_Fanpage__c() {
		return toNull(URL_ID_Fanpage__c);
	}
	public String getURL_Fanpage__c() {
		return URL_Fanpage__c;
	}
	public String getURL_ID_Istituzionale__c() {
		return toNull(URL_ID_Istituzionale__c);
	}
	public String getWebsite() {
		return Website;
	}
	public String getURL_ID_Pagine_Bianche__c() {
		return toNull(URL_ID_Pagine_Bianche__c);
	}
	public String getURL_Pagine_Bianche__c() {
		return URL_Pagine_Bianche__c;
	}
	public String getURL_ID_Pagine_Gialle__c() {
		return toNull(URL_ID_Pagine_Gialle__c);
	}
	public String getURL_Pagine_Gialle__c() {
		return URL_Pagine_Gialle__c;
	}
	public String getIOL_CodiceIndicatoreClientiSpeciali__c() {
		return IOL_CodiceIndicatoreClientiSpeciali__c;
	}

	public String getEvento() {
		return Evento;
	}

	public void setEvento(String evento) {
		Evento = evento;
	}

	public String getOwner() {
		return owner;
	}
	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}
	public void setCodice_Customer__c(String codice_Customer__c) {
		Codice_Customer__c = codice_Customer__c;
	}
	public void setCodice_Sede__c(String codice_Sede__c) {
		Codice_Sede__c = codice_Sede__c;
	}
	public void setRecordTypeId(String recordTypeId) {
		RecordTypeId = recordTypeId;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setIOL_AnnoFatturato__c(String iOL_AnnoFatturato__c) {
		IOL_AnnoFatturato__c = iOL_AnnoFatturato__c;
	}
	public void setAnno_Fondazione__c(String anno_Fondazione__c) {
		Anno_Fondazione__c = anno_Fondazione__c;
	}
	public void setIOL_AnnoRiferimentoDipendenti__c(String iOL_AnnoRiferimentoDipendenti__c) {
		IOL_AnnoRiferimentoDipendenti__c = iOL_AnnoRiferimentoDipendenti__c;
	}
	public void setAnnualRevenue(String annualRevenue) {
		AnnualRevenue = annualRevenue;
	}
	public void setBillingCity(String billingCity) {
		BillingCity = billingCity;
	}
	public void setBillingCountry(String billingCountry) {
		BillingCountry = billingCountry;
	}
	public void setBillingState(String billingState) {
		BillingState = billingState;
	}
	public void setBillingStreet(String billingStreet) {
		BillingStreet = billingStreet;
	}
	public void setIOL_BuonoOrdine__c(String iOL_BuonoOrdine__c) {
		IOL_BuonoOrdine__c = iOL_BuonoOrdine__c;
	}
	public void setCap__c(String cap__c) {
		Cap__c = cap__c;
	}
	public void setIOL_CodiceCategoriaMercMassimaSpesa__c(String iOL_CodiceCategoriaMercMassimaSpesa__c) {
		IOL_CodiceCategoriaMercMassimaSpesa__c = iOL_CodiceCategoriaMercMassimaSpesa__c;
	}
	public void setIOL_Categoria__c(String iOL_Categoria__c) {
		IOL_Categoria__c = iOL_Categoria__c;
	}
	public void setCellula__c(String cellula__c) {
		Cellula__c = cellula__c;
	}
	public void setIOL_classificazionePMI__c(String iOL_classificazionePMI__c) {
		IOL_classificazionePMI__c = iOL_classificazionePMI__c;
	}
	public void setIOL_CodiceAreaElenco__c(String iOL_CodiceAreaElenco__c) {
		IOL_CodiceAreaElenco__c = iOL_CodiceAreaElenco__c;
	}
	public void setIOL_CodiceCategoriaISTAT__c(String iOL_CodiceCategoriaISTAT__c) {
		IOL_CodiceCategoriaISTAT__c = iOL_CodiceCategoriaISTAT__c;
	}
	public void setIOL_CodiceCategoriaMerceologica__c(String iOL_CodiceCategoriaMerceologica__c) {
		IOL_CodiceCategoriaMerceologica__c = iOL_CodiceCategoriaMerceologica__c;
	}
	public void setCodice_Comune_IOL__c(String codice_Comune_IOL__c) {
		Codice_Comune_IOL__c = codice_Comune_IOL__c;
	}
	public void setCodice_Stato_Customer__c(String codice_Stato_Customer__c) {
		Codice_Stato_Customer__c = codice_Stato_Customer__c;
	}
	public void setCodiceFiscale__c(String codiceFiscale__c) {
		CodiceFiscale__c = codiceFiscale__c;
	}
	public void setCodice_Frazione__c(String codice_Frazione__c) {
		Codice_Frazione__c = codice_Frazione__c;
	}
	public void setCodice_IPA__c(String codice_IPA__c) {
		Codice_IPA__c = codice_IPA__c;
	}
	public void setCodice_Provincia_REA__c(String codice_Provincia_REA__c) {
		Codice_Provincia_REA__c = codice_Provincia_REA__c;
	}
	public void setIOL_NumeroREA__c(String iOL_NumeroREA__c) {
		IOL_NumeroREA__c = iOL_NumeroREA__c;
	}
	public void setCodice_Stato_Sede__c(String codice_Stato_Sede__c) {
		Codice_Stato_Sede__c = codice_Stato_Sede__c;
	}
	public void setIOL_CognomePersonaFisica__c(String iOL_CognomePersonaFisica__c) {
		IOL_CognomePersonaFisica__c = iOL_CognomePersonaFisica__c;
	}
	public void setComune_IOL__c(String comune_IOL__c) {
		Comune_IOL__c = comune_IOL__c;
	}
	public void setCoordinate_Anagrafiche__cX(String coordinate_Anagrafiche__cX) {
		Coordinate_Anagrafiche__cX = coordinate_Anagrafiche__cX;
	}
	public void setCoordinate_Anagrafiche__cY(String coordinate_Anagrafiche__cY) {
		Coordinate_Anagrafiche__cY = coordinate_Anagrafiche__cY;
	}
	public void setCoordinate_Manuali__c(String coordinate_Manuali__c) {
		Coordinate_Manuali__c = coordinate_Manuali__c;
	}
	public void setDato_Fiscale_Estero_Certificato__c(String dato_Fiscale_Estero_Certificato__c) {
		Dato_Fiscale_Estero_Certificato__c = dato_Fiscale_Estero_Certificato__c;
	}
	public void setDenominazione_Alternativa__c(String denominazione_Alternativa__c) {
		Denominazione_Alternativa__c = denominazione_Alternativa__c;
	}
	public void setIOL_CategoriaISTAT__c(String iOL_CategoriaISTAT__c) {
		IOL_CategoriaISTAT__c = iOL_CategoriaISTAT__c;
	}
	public void setIOL_CategoriaMerceologica__c(String iOL_CategoriaMerceologica__c) {
		IOL_CategoriaMerceologica__c = iOL_CategoriaMerceologica__c;
	}
	public void setDUG__c(String dUG__c) {
		DUG__c = dUG__c;
	}
	public void setEmail_Arricchimento__c(String email_Arricchimento__c) {
		Email_Arricchimento__c = email_Arricchimento__c;
	}
	public void setEmail_Arricchimento_ID__c(String email_Arricchimento_ID__c) {
		Email_Arricchimento_ID__c = email_Arricchimento_ID__c;
	}
	public void setEmail_Bozze__c(String email_Bozze__c) {
		Email_Bozze__c = email_Bozze__c;
	}
	public void setEmail_Bozze_ID__c(String email_Bozze_ID__c) {
		Email_Bozze_ID__c = email_Bozze_ID__c;
	}
	public void setEmail_Commerciale_IOL__c(String email_Commerciale_IOL__c) {
		Email_Commerciale_IOL__c = email_Commerciale_IOL__c;
	}
	public void setEmail_Commerciale_IOL_ID__c(String email_Commerciale_IOL_ID__c) {
		Email_Commerciale_IOL_ID__c = email_Commerciale_IOL_ID__c;
	}
	public void setEmail_Fatturazione__c(String email_Fatturazione__c) {
		Email_Fatturazione__c = email_Fatturazione__c;
	}
	public void setEmail_Fatturazione_ID__c(String email_Fatturazione_ID__c) {
		Email_Fatturazione_ID__c = email_Fatturazione_ID__c;
	}
	/*public void setEmail_Fatturazione_Elettronica__c(String email_Fatturazione_Elettronica__c) {
		Email_Fatturazione_Elettronica__c = email_Fatturazione_Elettronica__c;
	}
	public void setEmail_Fatturazione_Elettronica_ID__c(String email_Fatturazione_Elettronica_ID__c) {
		Email_Fatturazione_Elettronica_ID__c = email_Fatturazione_Elettronica_ID__c;
	}*/
	public void setEmail_Post_Vendita__c(String email_Post_Vendita__c) {
		Email_Post_Vendita__c = email_Post_Vendita__c;
	}
	public void setEmail_Post_Vendita_ID__c(String email_Post_Vendita_ID__c) {
		Email_Post_Vendita_ID__c = email_Post_Vendita_ID__c;
	}
	public void setIOL_Email_Arricchimento_PEC__c(String iOL_Email_Arricchimento_PEC__c) {
		IOL_Email_Arricchimento_PEC__c = iOL_Email_Arricchimento_PEC__c;
	}
	public void setIOL_Email_Bozze_PEC__c(String iOL_Email_Bozze_PEC__c) {
		IOL_Email_Bozze_PEC__c = iOL_Email_Bozze_PEC__c;
	}
	public void setIOL_Email_Commerciale_IOL_PEC__c(String iOL_Email_Commerciale_IOL_PEC__c) {
		IOL_Email_Commerciale_IOL_PEC__c = iOL_Email_Commerciale_IOL_PEC__c;
	}
	public void setIOL_Email_Fatturazione_PEC__c(String iOL_Email_Fatturazione_PEC__c) {
		IOL_Email_Fatturazione_PEC__c = iOL_Email_Fatturazione_PEC__c;
	}
	/*public void setIOL_Email_Fatturazione_Elettronica_PEC__c(String iOL_Email_Fatturazione_Elettronica_PEC__c) {
		IOL_Email_Fatturazione_Elettronica_PEC__c = iOL_Email_Fatturazione_Elettronica_PEC__c;
	}*/
	public void setIOL_Email_Post_Vendita_PEC__c(String iOL_Email_Post_Vendita_PEC__c) {
		IOL_Email_Post_Vendita_PEC__c = iOL_Email_Post_Vendita_PEC__c;
	}
	public void setEnte_Pubblico__c(String ente_Pubblico__c) {
		Ente_Pubblico__c = ente_Pubblico__c;
	}
	public void setFatturazione_Codice_Fiscale__c(String fatturazione_Codice_Fiscale__c) {
		Fatturazione_Codice_Fiscale__c = fatturazione_Codice_Fiscale__c;
	}
	public void setFatturazione_Elettronica_Obbligatoria__c(String fatturazione_Elettronica_Obbligatoria__c) {
		Fatturazione_Elettronica_Obbligatoria__c = fatturazione_Elettronica_Obbligatoria__c;
	}
	public void setFrazione__c(String frazione__c) {
		Frazione__c = frazione__c;
	}
	public void setIOL_IndirizzoID__c(String iOL_IndirizzoID__c) {
		IOL_IndirizzoID__c = iOL_IndirizzoID__c;
	}
	public void setInfo_Toponimo__c(String info_Toponimo__c) {
		Info_Toponimo__c = info_Toponimo__c;
	}
	public void setInsegna__c(String insegna__c) {
		Insegna__c = insegna__c;
	}
	public void setIOL_MercatoAggregato__c(String iOL_MercatoAggregato__c) {
		IOL_MercatoAggregato__c = iOL_MercatoAggregato__c;
	}
	public void setIndustry(String industry) {
		Industry = industry;
	}
	public void setNazione__c(String nazione__c) {
		Nazione__c = nazione__c;
	}
	public void setIOL_PotenzialeNIP__c(String iOL_PotenzialeNIP__c) {
		IOL_PotenzialeNIP__c = iOL_PotenzialeNIP__c;
	}
	public void setIOL_NomePersonaFisica__c(String iOL_NomePersonaFisica__c) {
		IOL_NomePersonaFisica__c = iOL_NomePersonaFisica__c;
	}
	public void setNote_sul_Recapito_Fattura__c(String note_sul_Recapito_Fattura__c) {
		Note_sul_Recapito_Fattura__c = note_sul_Recapito_Fattura__c;
	}
	public void setNumero_Civico__c(String numero_Civico__c) {
		Numero_Civico__c = numero_Civico__c;
	}
	public void setNumberOfEmployees(String numberOfEmployees) {
		NumberOfEmployees = numberOfEmployees;
	}
	public void setOpec__c(String opec__c) {
		Opec__c = opec__c;
	}
	public void setIOL_OpecConsegnabile__c(String iOL_OpecConsegnabile__c) {
		IOL_OpecConsegnabile__c = iOL_OpecConsegnabile__c;
	}
	public void setPartitaIva__c(String partitaIva__c) {
		PartitaIva__c = partitaIva__c;
	}
	public void setProfondita_Coordinate_Anagrafiche__c(String profondita_Coordinate_Anagrafiche__c) {
		Profondita_Coordinate_Anagrafiche__c = profondita_Coordinate_Anagrafiche__c;
	}
	public void setProvincia_IOL__c(String provincia_IOL__c) {
		Provincia_IOL__c = provincia_IOL__c;
	}
	public void setIOL_CustomerCessatoRiattivabile__c(String iOL_CustomerCessatoRiattivabile__c) {
		IOL_CustomerCessatoRiattivabile__c = iOL_CustomerCessatoRiattivabile__c;
	}
	public void setIOL_SedeCessataRiattivabile__c(String iOL_SedeCessataRiattivabile__c) {
		IOL_SedeCessataRiattivabile__c = iOL_SedeCessataRiattivabile__c;
	}
	public void setSede_Primaria_OPEC__c(String sede_Primaria_OPEC__c) {
		Sede_Primaria_OPEC__c = sede_Primaria_OPEC__c;
	}
	public void setIOL_SottoareaMercato__c(String iOL_SottoareaMercato__c) {
		IOL_SottoareaMercato__c = iOL_SottoareaMercato__c;
	}
	public void setIOL_SottoclasseDipendenti__c(String iOL_SottoclasseDipendenti__c) {
		IOL_SottoclasseDipendenti__c = iOL_SottoclasseDipendenti__c;
	}
	public void setIOL_SottoclasseFatturato__c(String iOL_SottoclasseFatturato__c) {
		IOL_SottoclasseFatturato__c = iOL_SottoclasseFatturato__c;
	}
	public void setIOL_TipoMercato__c(String iOL_TipoMercato__c) {
		IOL_TipoMercato__c = iOL_TipoMercato__c;
	}
	public void setTelefono_1_ID__c(String telefono_1_ID__c) {
		Telefono_1_ID__c = telefono_1_ID__c;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public void setPrimario1__c(String primario1__c) {
		Primario1__c = primario1__c;
	}
	public void setTipologiaTelefono1__c(String tipologiaTelefono1__c) {
		TipologiaTelefono1__c = tipologiaTelefono1__c;
	}
	public void setTelefono_2_ID__c(String telefono_2_ID__c) {
		Telefono_2_ID__c = telefono_2_ID__c;
	}
	public void setTelefono2__c(String telefono2__c) {
		Telefono2__c = telefono2__c;
	}
	public void setPrimario2__c(String primario2__c) {
		Primario2__c = primario2__c;
	}
	public void setTipologiaTelefono2__c(String tipologiaTelefono2__c) {
		TipologiaTelefono2__c = tipologiaTelefono2__c;
	}
	public void setTelefono_3_ID__c(String telefono_3_ID__c) {
		Telefono_3_ID__c = telefono_3_ID__c;
	}
	public void setTelefono3__c(String telefono3__c) {
		Telefono3__c = telefono3__c;
	}
	public void setPrimario3__c(String primario3__c) {
		Primario3__c = primario3__c;
	}
	public void setTipologiaTelefono3__c(String tipologiaTelefono3__c) {
		TipologiaTelefono3__c = tipologiaTelefono3__c;
	}
	public void setTelefono_4_ID__c(String telefono_4_ID__c) {
		Telefono_4_ID__c = telefono_4_ID__c;
	}
	public void setTelefono4__c(String telefono4__c) {
		Telefono4__c = telefono4__c;
	}
	public void setPrimario4__c(String primario4__c) {
		Primario4__c = primario4__c;
	}
	public void setTipologiaTelefono4__c(String tipologiaTelefono4__c) {
		TipologiaTelefono4__c = tipologiaTelefono4__c;
	}
	public void setTelefono_5_ID__c(String telefono_5_ID__c) {
		Telefono_5_ID__c = telefono_5_ID__c;
	}
	public void setTelefono5__c(String telefono5__c) {
		Telefono5__c = telefono5__c;
	}
	public void setPrimario5__c(String primario5__c) {
		Primario5__c = primario5__c;
	}
	public void setTipologiaTelefono5__c(String tipologiaTelefono5__c) {
		TipologiaTelefono5__c = tipologiaTelefono5__c;
	}
	public void setTelefono_6_ID__c(String telefono_6_ID__c) {
		Telefono_6_ID__c = telefono_6_ID__c;
	}
	public void setTelefono6__c(String telefono6__c) {
		Telefono6__c = telefono6__c;
	}
	public void setPrimario6__c(String primario6__c) {
		Primario6__c = primario6__c;
	}
	public void setTipologiaTelefono6__c(String tipologiaTelefono6__c) {
		TipologiaTelefono6__c = tipologiaTelefono6__c;
	}
	public void setTelefono_7_ID__c(String telefono_7_ID__c) {
		Telefono_7_ID__c = telefono_7_ID__c;
	}
	public void setTelefono7__c(String telefono7__c) {
		Telefono7__c = telefono7__c;
	}
	public void setPrimario7__c(String primario7__c) {
		Primario7__c = primario7__c;
	}
	public void setTipologiaTelefono7__c(String tipologiaTelefono7__c) {
		TipologiaTelefono7__c = tipologiaTelefono7__c;
	}
	public void setTelefono_8_ID__c(String telefono_8_ID__c) {
		Telefono_8_ID__c = telefono_8_ID__c;
	}
	public void setTelefono8__c(String telefono8__c) {
		Telefono8__c = telefono8__c;
	}
	public void setPrimario8__c(String primario8__c) {
		Primario8__c = primario8__c;
	}
	public void setTipologiaTelefono8__c(String tipologiaTelefono8__c) {
		TipologiaTelefono8__c = tipologiaTelefono8__c;
	}
	public void setTipologia_Persona_Giuridica__c(String tipologia_Persona_Giuridica__c) {
		Tipologia_Persona_Giuridica__c = tipologia_Persona_Giuridica__c;
	}
	public void setTipologia_societa_giuridica__c(String tipologia_societa_giuridica__c) {
		Tipologia_societa_giuridica__c = tipologia_societa_giuridica__c;
	}
	public void setToponimo__c(String toponimo__c) {
		Toponimo__c = toponimo__c;
	}
	public void setUltima_Posizione_Amminstrativa__c(String ultima_Posizione_Amminstrativa__c) {
		Ultima_Posizione_Amminstrativa__c = ultima_Posizione_Amminstrativa__c;
	}
	public void setType(String type) {
		Type = type;
	}
	public void setURL_ID_Fanpage__c(String uRL_ID_Fanpage__c) {
		URL_ID_Fanpage__c = uRL_ID_Fanpage__c;
	}
	public void setURL_Fanpage__c(String uRL_Fanpage__c) {
		URL_Fanpage__c = uRL_Fanpage__c;
	}
	public void setURL_ID_Istituzionale__c(String uRL_ID_Istituzionale__c) {
		URL_ID_Istituzionale__c = uRL_ID_Istituzionale__c;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public void setURL_ID_Pagine_Bianche__c(String uRL_ID_Pagine_Bianche__c) {
		URL_ID_Pagine_Bianche__c = uRL_ID_Pagine_Bianche__c;
	}
	public void setURL_Pagine_Bianche__c(String uRL_Pagine_Bianche__c) {
		URL_Pagine_Bianche__c = uRL_Pagine_Bianche__c;
	}
	public void setURL_ID_Pagine_Gialle__c(String uRL_ID_Pagine_Gialle__c) {
		URL_ID_Pagine_Gialle__c = uRL_ID_Pagine_Gialle__c;
	}
	public void setURL_Pagine_Gialle__c(String uRL_Pagine_Gialle__c) {
		URL_Pagine_Gialle__c = uRL_Pagine_Gialle__c;
	}
	public void setIOL_CodiceIndicatoreClientiSpeciali__c(String iOL_CodiceIndicatoreClientiSpeciali__c) {
		IOL_CodiceIndicatoreClientiSpeciali__c = iOL_CodiceIndicatoreClientiSpeciali__c;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Account [TransactionId=" + TransactionId + ", Codice_Customer__c=" + Codice_Customer__c
				+ ", Codice_Sede__c=" + Codice_Sede__c + ", RecordTypeId=" + RecordTypeId + ", Evento=" + Evento
				+ ", Name=" + Name + ", IOL_AnnoFatturato__c=" + IOL_AnnoFatturato__c + ", Anno_Fondazione__c="
				+ Anno_Fondazione__c + ", IOL_AnnoRiferimentoDipendenti__c=" + IOL_AnnoRiferimentoDipendenti__c
				+ ", IOL_CustomerCountryCod__c="+IOL_CustomerCountryCod__c 
				+ ", AnnualRevenue=" + AnnualRevenue + ", BillingCity=" + BillingCity + ", BillingCountry="
				+ BillingCountry + ", BillingState=" + BillingState + ", BillingStreet=" + BillingStreet
				+ ", IOL_BuonoOrdine__c=" + IOL_BuonoOrdine__c + ", Cap__c=" + Cap__c
				+ ", IOL_CodiceCategoriaMercMassimaSpesa__c=" + IOL_CodiceCategoriaMercMassimaSpesa__c
				+ ", IOL_Categoria__c=" + IOL_Categoria__c + ", Cellula__c=" + Cellula__c
				+ ", IOL_classificazionePMI__c=" + IOL_classificazionePMI__c + ", IOL_CodiceAreaElenco__c="
				+ IOL_CodiceAreaElenco__c + ", IOL_CodiceCategoriaISTAT__c=" + IOL_CodiceCategoriaISTAT__c
				+ ", IOL_CodiceCategoriaMerceologica__c=" + IOL_CodiceCategoriaMerceologica__c
				+ ", Codice_Comune_IOL__c=" + Codice_Comune_IOL__c + ", Codice_Stato_Customer__c="
				+ Codice_Stato_Customer__c + ", CodiceFiscale__c=" + CodiceFiscale__c + ", Codice_Frazione__c="
				+ Codice_Frazione__c + ", Codice_IPA__c=" + Codice_IPA__c + ", Codice_Provincia_REA__c="
				+ Codice_Provincia_REA__c + ", IOL_NumeroREA__c=" + IOL_NumeroREA__c + ", Codice_Stato_Sede__c="
				+ Codice_Stato_Sede__c + ", IOL_CognomePersonaFisica__c=" + IOL_CognomePersonaFisica__c
				+ ", Comune_IOL__c=" + Comune_IOL__c + ", Coordinate_Anagrafiche__cX=" + Coordinate_Anagrafiche__cX
				+ ", Coordinate_Anagrafiche__cY=" + Coordinate_Anagrafiche__cY + ", Coordinate_Manuali__c="
				+ Coordinate_Manuali__c + ", Dato_Fiscale_Estero_Certificato__c=" + Dato_Fiscale_Estero_Certificato__c
				+ ", Denominazione_Alternativa__c=" + Denominazione_Alternativa__c + ", IOL_CategoriaISTAT__c="
				+ IOL_CategoriaISTAT__c + ", IOL_CategoriaMerceologica__c=" + IOL_CategoriaMerceologica__c + ", DUG__c="
				+ DUG__c + ", Dug_Toponimo__c=" + getDug_Toponimo__c() +  ", Email_Arricchimento__c=" + Email_Arricchimento__c + ", Email_Arricchimento_ID__c="
				+ Email_Arricchimento_ID__c + ", Email_Bozze__c=" + Email_Bozze__c + ", Email_Bozze_ID__c="
				+ Email_Bozze_ID__c + ", Email_Commerciale_IOL__c=" + Email_Commerciale_IOL__c
				+ ", Email_Commerciale_IOL_ID__c=" + Email_Commerciale_IOL_ID__c + ", Email_Fatturazione__c="
				+ Email_Fatturazione__c + ", Email_Fatturazione_ID__c=" + Email_Fatturazione_ID__c
				/*+ ", Email_Fatturazione_Elettronica__c=" + Email_Fatturazione_Elettronica__c
				+ ", Email_Fatturazione_Elettronica_ID__c=" + Email_Fatturazione_Elettronica_ID__c*/
				+ ", Email_Post_Vendita__c=" + Email_Post_Vendita__c + ", Email_Post_Vendita_ID__c="
				+ Email_Post_Vendita_ID__c + ", IOL_Email_Arricchimento_PEC__c=" + IOL_Email_Arricchimento_PEC__c
				+ ", IOL_Email_Bozze_PEC__c=" + IOL_Email_Bozze_PEC__c + ", IOL_Email_Commerciale_IOL_PEC__c="
				+ IOL_Email_Commerciale_IOL_PEC__c + ", IOL_Email_Fatturazione_PEC__c=" + IOL_Email_Fatturazione_PEC__c
				//+ ", IOL_Email_Fatturazione_Elettronica_PEC__c=" + IOL_Email_Fatturazione_Elettronica_PEC__c
				+ ", IOL_Email_Post_Vendita_PEC__c=" + IOL_Email_Post_Vendita_PEC__c + ", Ente_Pubblico__c="
				+ Ente_Pubblico__c + ", Fatturazione_Codice_Fiscale__c=" + Fatturazione_Codice_Fiscale__c
				+ ", Fatturazione_Elettronica_Obbligatoria__c=" + Fatturazione_Elettronica_Obbligatoria__c
				+ ", Frazione__c=" + Frazione__c + ", IOL_IndirizzoID__c=" + IOL_IndirizzoID__c + ", Info_Toponimo__c="
				+ Info_Toponimo__c + ", Insegna__c=" + Insegna__c + ", IOL_MercatoAggregato__c="
				+ IOL_MercatoAggregato__c + ", Industry=" + Industry + ", Nazione__c=" + Nazione__c
				+ ", IOL_PotenzialeNIP__c=" + IOL_PotenzialeNIP__c + ", IOL_NomePersonaFisica__c="
				+ IOL_NomePersonaFisica__c + ", Note_sul_Recapito_Fattura__c=" + Note_sul_Recapito_Fattura__c
				+ ", Numero_Civico__c=" + Numero_Civico__c + ", NumberOfEmployees=" + NumberOfEmployees + ", Opec__c="
				+ Opec__c + ", IOL_OpecConsegnabile__c=" + IOL_OpecConsegnabile__c + ", PartitaIva__c=" + PartitaIva__c
				+ ", Profondita_Coordinate_Anagrafiche__c=" + Profondita_Coordinate_Anagrafiche__c
				+ ", Provincia_IOL__c=" + Provincia_IOL__c + ", IOL_CustomerCessatoRiattivabile__c="
				+ IOL_CustomerCessatoRiattivabile__c + ", IOL_SedeCessataRiattivabile__c="
				+ IOL_SedeCessataRiattivabile__c + ", Sede_Primaria_OPEC__c=" + Sede_Primaria_OPEC__c
				+ ", IOL_SottoareaMercato__c=" + IOL_SottoareaMercato__c + ", IOL_SottoclasseDipendenti__c="
				+ IOL_SottoclasseDipendenti__c + ", IOL_SottoclasseFatturato__c=" + IOL_SottoclasseFatturato__c
				+ ", IOL_TipoMercato__c=" + IOL_TipoMercato__c + ", Telefono_1_ID__c=" + Telefono_1_ID__c + ", Phone="
				+ Phone + ", Primario1__c=" + Primario1__c + ", TipologiaTelefono1__c=" + TipologiaTelefono1__c
				+ ", Telefono_2_ID__c=" + Telefono_2_ID__c + ", Telefono2__c=" + Telefono2__c + ", Primario2__c="
				+ Primario2__c + ", TipologiaTelefono2__c=" + TipologiaTelefono2__c + ", Telefono_3_ID__c="
				+ Telefono_3_ID__c + ", Telefono3__c=" + Telefono3__c + ", Primario3__c=" + Primario3__c
				+ ", TipologiaTelefono3__c=" + TipologiaTelefono3__c + ", Telefono_4_ID__c=" + Telefono_4_ID__c
				+ ", Telefono4__c=" + Telefono4__c + ", Primario4__c=" + Primario4__c + ", TipologiaTelefono4__c="
				+ TipologiaTelefono4__c + ", Telefono_5_ID__c=" + Telefono_5_ID__c + ", Telefono5__c=" + Telefono5__c
				+ ", Primario5__c=" + Primario5__c + ", TipologiaTelefono5__c=" + TipologiaTelefono5__c
				+ ", Telefono_6_ID__c=" + Telefono_6_ID__c + ", Telefono6__c=" + Telefono6__c + ", Primario6__c="
				+ Primario6__c + ", TipologiaTelefono6__c=" + TipologiaTelefono6__c + ", Telefono_7_ID__c="
				+ Telefono_7_ID__c + ", Telefono7__c=" + Telefono7__c + ", Primario7__c=" + Primario7__c
				+ ", TipologiaTelefono7__c=" + TipologiaTelefono7__c + ", Telefono_8_ID__c=" + Telefono_8_ID__c
				+ ", Telefono8__c=" + Telefono8__c + ", Primario8__c=" + Primario8__c + ", TipologiaTelefono8__c="
				+ TipologiaTelefono8__c + ", Tipologia_Persona_Giuridica__c=" + Tipologia_Persona_Giuridica__c
				+ ", Tipologia_societa_giuridica__c=" + Tipologia_societa_giuridica__c + ", Toponimo__c=" + Toponimo__c
				+ ", Ultima_Posizione_Amminstrativa__c=" + Ultima_Posizione_Amminstrativa__c + ", Type=" + Type
				+ ", URL_ID_Fanpage__c=" + URL_ID_Fanpage__c + ", URL_Fanpage__c=" + URL_Fanpage__c
				+ ", URL_ID_Istituzionale__c=" + URL_ID_Istituzionale__c + ", Website=" + Website
				+ ", URL_ID_Pagine_Bianche__c=" + URL_ID_Pagine_Bianche__c + ", URL_Pagine_Bianche__c="
				+ URL_Pagine_Bianche__c + ", URL_ID_Pagine_Gialle__c=" + URL_ID_Pagine_Gialle__c
				+ ", URL_Pagine_Gialle__c=" + URL_Pagine_Gialle__c + ", IOL_CodiceIndicatoreClientiSpeciali__c="
				+ IOL_CodiceIndicatoreClientiSpeciali__c + ", owner=" + owner + "]";
	}
	public String getCodice_Customer__c_old()
	{
		return Codice_Customer__c_old;
	}
	public void setCodice_Customer__c_old( String codice_Customer__c_old )
	{
		Codice_Customer__c_old = codice_Customer__c_old;
	}
	public String getIOL_CodiceSede_old()
	{
		return IOL_CodiceSede_old;
	}
	public void setIOL_CodiceSede_old( String iOL_CodiceSede_old )
	{
		IOL_CodiceSede_old = iOL_CodiceSede_old;
	}
	public String getBillingCountryCod()
	{
		return BillingCountryCod;
	}
	public void setBillingCountryCod( String billingCountryCod )
	{
		BillingCountryCod = billingCountryCod;
	}
	public String getIOL_CustomerCountryCod__c()
	{
		return IOL_CustomerCountryCod__c;
	}
	public void setIOL_CustomerCountryCod__c( String iOL_CustomerCountryCod__c )
	{
		IOL_CustomerCountryCod__c = iOL_CustomerCountryCod__c;
	}
	
	public String getIOL_GruppoContabilitaCliente__c() {
		return IOL_GruppoContabilitaCliente__c;
	}
	public void setIOL_GruppoContabilitaCliente__c(String iOL_GruppoContabilitaCliente__c) {
		IOL_GruppoContabilitaCliente__c = iOL_GruppoContabilitaCliente__c;
	}
	public String getIOL_CategoriaDiAppartenenza__c() {
		return IOL_CategoriaDiAppartenenza__c;
	}
	public void setIOL_CategoriaDiAppartenenza__c(String iOL_CategoriaDiAppartenenza__c) {
		IOL_CategoriaDiAppartenenza__c = iOL_CategoriaDiAppartenenza__c;
	}
	public String getIOL_TipoDiPubblicaAmministrazione__c() {
		return IOL_TipoDiPubblicaAmministrazione__c;
	}
	public void setIOL_TipoDiPubblicaAmministrazione__c(String iOL_TipoDiPubblicaAmministrazione__c) {
		IOL_TipoDiPubblicaAmministrazione__c = iOL_TipoDiPubblicaAmministrazione__c;
	}
	private String toNull(String input)
	{
		return ( "".equalsIgnoreCase( input )?null:input );
	}
	public String getIOL_ConsensoVenditaTerzi__c() {
		return IOL_ConsensoVenditaTerzi__c;
	}
	public void setIOL_ConsensoVenditaTerzi__c(String iOL_ConsensoVenditaTerzi__c) {
		IOL_ConsensoVenditaTerzi__c = iOL_ConsensoVenditaTerzi__c;
	}
	public String getIOL_ConsensoProfilazione__c() {
		return IOL_ConsensoProfilazione__c;
	}
	public void setIOL_ConsensoProfilazione__c(String iOL_ConsensoProfilazione__c) {
		IOL_ConsensoProfilazione__c = iOL_ConsensoProfilazione__c;
	}
	public String getIOL_ConsensoTelefono1__c() {
		return IOL_ConsensoTelefono1__c;
	}
	public void setIOL_ConsensoTelefono1__c(String iOL_ConsensoTelefono1__c) {
		IOL_ConsensoTelefono1__c = iOL_ConsensoTelefono1__c;
	}
	public String getIOL_ConsensoTelefono2__c() {
		return IOL_ConsensoTelefono2__c;
	}
	public void setIOL_ConsensoTelefono2__c(String iOL_ConsensoTelefono2__c) {
		IOL_ConsensoTelefono2__c = iOL_ConsensoTelefono2__c;
	}
	public String getIOL_ConsensoTelefono3__c() {
		return IOL_ConsensoTelefono3__c;
	}
	public void setIOL_ConsensoTelefono3__c(String iOL_ConsensoTelefono3__c) {
		IOL_ConsensoTelefono3__c = iOL_ConsensoTelefono3__c;
	}
	public String getIOL_ConsensoTelefono4__c() {
		return IOL_ConsensoTelefono4__c;
	}
	public void setIOL_ConsensoTelefono4__c(String iOL_ConsensoTelefono4__c) {
		IOL_ConsensoTelefono4__c = iOL_ConsensoTelefono4__c;
	}
	public String getIOL_ConsensoTelefono5__c() {
		return IOL_ConsensoTelefono5__c;
	}
	public void setIOL_ConsensoTelefono5__c(String iOL_ConsensoTelefono5__c) {
		IOL_ConsensoTelefono5__c = iOL_ConsensoTelefono5__c;
	}
	public String getIOL_ConsensoTelefono6__c() {
		return IOL_ConsensoTelefono6__c;
	}
	public void setIOL_ConsensoTelefono6__c(String iOL_ConsensoTelefono6__c) {
		IOL_ConsensoTelefono6__c = iOL_ConsensoTelefono6__c;
	}
	public String getIOL_ConsensoTelefono7__c() {
		return IOL_ConsensoTelefono7__c;
	}
	public void setIOL_ConsensoTelefono7__c(String iOL_ConsensoTelefono7__c) {
		IOL_ConsensoTelefono7__c = iOL_ConsensoTelefono7__c;
	}
	public String getIOL_ConsensoTelefono8__c() {
		return IOL_ConsensoTelefono8__c;
	}
	public void setIOL_ConsensoTelefono8__c(String iOL_ConsensoTelefono8__c) {
		IOL_ConsensoTelefono8__c = iOL_ConsensoTelefono8__c;
	}
	public String getPrimarioCustomer1__c() {
		return PrimarioCustomer1__c;
	}
	public void setPrimarioCustomer1__c(String primarioCustomer1__c) {
		PrimarioCustomer1__c = primarioCustomer1__c;
	}
	public String getPrimarioCustomer2__c() {
		return PrimarioCustomer2__c;
	}
	public void setPrimarioCustomer2__c(String primarioCustomer2__c) {
		PrimarioCustomer2__c = primarioCustomer2__c;
	}
	public String getPrimarioCustomer3__c() {
		return PrimarioCustomer3__c;
	}
	public void setPrimarioCustomer3__c(String primarioCustomer3__c) {
		PrimarioCustomer3__c = primarioCustomer3__c;
	}
	public String getPrimarioCustomer4__c() {
		return PrimarioCustomer4__c;
	}
	public void setPrimarioCustomer4__c(String primarioCustomer4__c) {
		PrimarioCustomer4__c = primarioCustomer4__c;
	}
	public String getPrimarioCustomer5__c() {
		return PrimarioCustomer5__c;
	}
	public void setPrimarioCustomer5__c(String primarioCustomer5__c) {
		PrimarioCustomer5__c = primarioCustomer5__c;
	}
	public String getPrimarioCustomer6__c() {
		return PrimarioCustomer6__c;
	}
	public void setPrimarioCustomer6__c(String primarioCustomer6__c) {
		PrimarioCustomer6__c = primarioCustomer6__c;
	}
	public String getPrimarioCustomer7__c() {
		return PrimarioCustomer7__c;
	}
	public void setPrimarioCustomer7__c(String primarioCustomer7__c) {
		PrimarioCustomer7__c = primarioCustomer7__c;
	}
	public String getPrimarioCustomer8__c() {
		return PrimarioCustomer8__c;
	}
	public void setPrimarioCustomer8__c(String primarioCustomer8__c) {
		PrimarioCustomer8__c = primarioCustomer8__c;
	}
	public String getEmail_Fatturazione_CodUns__c() {
		return Email_Fatturazione_CodUns__c;
	}
	public void setEmail_Fatturazione_CodUns__c(String email_Fatturazione_CodUns__c) {
		Email_Fatturazione_CodUns__c = email_Fatturazione_CodUns__c;
	}
	public String getEmail_Post_Vendita_IOL_CodUns__c() {
		return Email_Post_Vendita_IOL_CodUns__c;
	}
	public void setEmail_Post_Vendita_IOL_CodUns__c(String email_Post_Vendita_IOL_CodUns__c) {
		Email_Post_Vendita_IOL_CodUns__c = email_Post_Vendita_IOL_CodUns__c;
	}
	public String getEmail_Commerciale_IOL_CodUns__c() {
		return Email_Commerciale_IOL_CodUns__c;
	}
	public void setEmail_Commerciale_IOL_CodUns__c(String email_Commerciale_IOL_CodUns__c) {
		Email_Commerciale_IOL_CodUns__c = email_Commerciale_IOL_CodUns__c;
	}
	public String getIOL_Privato__c() {
		return IOL_Privato__c;
	}
	public void setIOL_Privato__c(String iOL_Privato__c) {
		IOL_Privato__c = iOL_Privato__c;
	}
}
