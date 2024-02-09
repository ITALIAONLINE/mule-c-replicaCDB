
  CREATE OR REPLACE FORCE VIEW "DBACD1CDB"."VCD0B_RP_SF_SEDECUST" ("TRANSACTIONID", "CUSTOMERID", "CODICESEDE", "EVENTO", "ORDCUST", "ORDSEDE", "DATATRANSAZIONE", "STATO", "CUSTOMERID_OLD", "CODICESEDE_OLD", "RAGIONESOCIALE", "ANNOFATTURATO", "ANNOFONDAZIONE", "ANNORIFERIMENTODIPENDENTI", "FATTURATO", "CITTA", "NAZIONESEDE", "CODICEPROVINCIA", "INDIRIZZO", "BUONOORDINE", "CAP", "CODICECATEGORIAMASSIMASPESA", "CATEGORIAMASSIMASPESA", "CELLULA", "CLASSIFICAZIONEPMI", "AREAELENCO", "CODICECATEGORIAISTAT", "CODICECATEGORIAMERCEOLOGICA", "CODICECOMUNE", "STATOCUSTOMER", "CODICEFISCALE", "CODICEFRAZIONE", "IPA", "CODPROVINCIAREA", "NUMEROREA", "STATOSEDE", "COGNOME", "COMUNE", "COORDX", "COORDY", "COORDINATEMANUALI", "DATOFISCALEESTEROCERTIFICATO", "DENOMINAZIONEALTERNATIVA", "CATEGORIAISTAT", "CATEGORIAMERCEOLOGICA", "DUG", "EMAILARRICCHIMENTO", "EMAILARRICCHIMENTOID", "EMAILBOZZE", "EMAILBOZZEID", "EMAILCOMMERCIALEIOL", "EMAILCOMMERCIALEIOLID", "EMAILFATTURAZIONE", "EMAILFATTURAZIONEID", "EMAILFATTELETTRONICA", "EMAILFATTELETTRONICAID", "EMAILPOSTVENDITA", "EMAILPOSTVENDITAID", "EMAILARRICCHIMENTOPECFLAG", "EMAILBOZZEPECFLAG", "EMAILCOMMERCIALEIOLPECFLAG", "EMAILFATTURAZIONEPECFLAG", "EMAILFATTELETTRONICAPECFLAG", "EMAILPOSTVENDITAPECFLAG", "ENTEPUBBLICOFLAG", "CODICEFISCALEFATTURAZIONE", "FATTELETTRONICAOBBLIGATORIA", "FRAZIONE", "IDINDIRIZZO", "INFOTOPONIMO", "INSEGNA", "MERCATOAGGREGATO", "INDUSTRY", "CODICENAZIONE", "POTENZIALENIP", "NOME", "NOTERECAPITOFATTURA", "CIVICO", "NUMERODIPENDENTI", "OPEC", "OPECCONSEGNABILE", "PARTITAIVA", "PROFCOORDINATEGEOGRAFICHE", "PROVINCIA", "CUSTOMERCESSATORIATTIVABILE", "SEDECESSATARIATTIVABILE", "SEDEPRIMARIAFLAG", "SOTTOAREAMERCATO", "SOTTOCLASSEDIPENDENTI", "SOTTOCLASSEFATTURATO", "STATOOPECCOMMATTUALIZ", "TIPOMERCATO", "TELEFONO1ID", "TELEFONO1", "TELEFONO1PRIMARIO", "TIPOTELEFONO1", "TELEFONO2ID", "TELEFONO2", "TELEFONO2PRIMARIO", "TIPOTELEFONO2", "TELEFONO3ID", "TELEFONO3", "TELEFONO3PRIMARIO", "TIPOTELEFONO3", "TELEFONO4ID", "TELEFONO4", "TELEFONO4PRIMARIO", "TIPOTELEFONO4", "TELEFONO5ID", "TELEFONO5", "TELEFONO5PRIMARIO", "TIPOTELEFONO5", "TELEFONO6ID", "TELEFONO6", "TELEFONO6PRIMARIO", "TIPOTELEFONO6", "TELEFONO7ID", "TELEFONO7", "TELEFONO7PRIMARIO", "TIPOTELEFONO7", "TELEFONO8ID", "TELEFONO8", "TELEFONO8PRIMARIO", "TIPOTELEFONO8", "FORMAGIURIDICA", "TIPOSOCGIURIDICA", "TOPONIMO", "ULTIMAPOSIZIONEAMMINISTRATIVA", "TIPOSOCIETA", "URLFANPAGEID", "URLFANPAGE", "URLISTITUZIONALEID", "URLISTITUZIONALE", "URLPAGINEBIANCHEID", "URLPAGINEBIANCHE", "URLPAGINEGIALLEID", "URLPAGINEGIALLE", "CLIENTESPECIALEFLG", "PRIORITA") AS 
  SELECT TO_CHAR ('' || c.CD0A_RAW_XID_DES || nvl(c.cd0a_prog_trns_des,'000')) AS TransactionId,
          c.CDL0_CUST_COD AS CustomerId,                  --Codice_Customer__c
          s.CDL1_SEDE_COD||CDL1_NVER_SEDE_COD AS CodiceSede,                      --Codice_Sede__c
          c.CD0A_TIPO_EVEN_COD AS Evento,
          TO_CHAR (c.CD0A_RECD_NUM) AS OrdCust,
          TO_CHAR (s.CD0B_RECD_NUM) AS OrdSede,
          TO_CHAR (c.cd0a_strt_trns_tim, 'YYYY-mm-DD HH:MM:SS')
             AS DataTransazione,
          c.cd0a_stat_recd_cod AS Stato,
          c.CDL0_PREC_CUST_COD as CustomerId_Old,
          s.CDL1_PREC_SEDE_COD||CDL1_PREC_NVER_SEDE_COD as CodiceSede_Old,
          DECODE (c.CDL0_RAGI_SOCL_DES,
                  NULL, c.CDL0_NOME_NOM || ' ' || c.CDL0_COGN_COG,
                  c.CDL0_RAGI_SOCL_DES)
             AS RagioneSociale,                                        -- Name
          c.CDL0_ANNO_RIFF_ANN AS AnnoFatturato,        --IOL_AnnoFatturato__c
          c.CDL0_ANNO_FOND_ANN AS AnnoFondazione,         --Anno_Fondazione__c
          c.CDL0_ANNO_RIFD_ANN AS AnnoRiferimentoDipendenti, --IOL_AnnoRiferimentoDipendenti__c
          TO_CHAR (TRUNC (c.CDL0_FATT_PUNT_IMP)) AS Fatturato, --AnnualRevenue
          SUBSTR (s.CDL3_COMN_SEAT_DES, 0, 40) AS Citta,         --BillingCity
          s.CDL3_NAZN_SEAT_DES AS NazioneSede,                --BillingCountry
          s.CDL3_PROV_SEAT_COD AS CodiceProvincia,              --BillingState
             s.CDL3_DUG_DES
          || ' '
          || s.CDL3_TOPN_STRD_DES
          || ' '
          || s.CDL3_CIVC_DES
             AS Indirizzo,                                     --BillingStreet
          DECODE (c.CDL0_BUON_ORDN_FLG,
                  'S', 'true',
                  'N', 'false',
                  'false')
             AS BuonoOrdine,                              --IOL_BuonoOrdine__c
          s.CDL3_CAP_COD AS Cap,                                      --Cap__c
          c.CD81_CATG_MAXS_COD AS CodiceCategoriaMassimaSpesa, --IOL_CodiceCategoriaMercMassimaSpesa__c
          c.CD81_CATG_MAXS_DES AS CategoriaMassimaSpesa,    --IOL_Categoria__c
          s.CDL3_NUCL_COMM_COD AS Cellula,                        --Cellula__c
          c.CDLG_CLASS_PMI_DES AS ClassificazionePMI, --IOL_classificazionePMI__c
          s.CD18_AREA_ELEN_COD AS AreaElenco,        --IOL_CodiceAreaElenco__c
          c.CD82_CATG_ISTA_COD AS CodiceCategoriaISTAT, --IOL_CodiceCategoriaISTAT__c
          c.CD81_CATG_PREV_COD AS CodiceCategoriaMerceologica, --IOL_CodiceCategoriaMerceologica__c
          s.CDL3_COMN_SEAT_COD AS CodiceComune,         --Codice_Comune_IOL__c
          c.CDL0_STAT_COD AS StatoCustomer,         --Codice_Stato_Customer__c
          c.CDL0_CFIS_COD AS CodiceFiscale,                 --CodiceFiscale__c
          s.CDL3_FRAZ_COD AS CodiceFrazione,              --Codice_Frazione__c
          s.CDL1_UNI_ORG_COD AS IPA,                           --Codice_IPA__c
          c.CDFE_CCIAA AS CodProvinciaREA,           --Codice_Provincia_REA__c
          c.CDFE_REA AS NumeroRea,                          --IOL_NumeroREA__c
          s.CDL1_STAT_COD AS StatoSede,                 --Codice_Stato_Sede__c
          c.CDL0_COGN_COG AS Cognome,            --IOL_CognomePersonaFisica__c
          SUBSTR (s.CDL3_COMN_SEAT_DES, 0, 40) AS Comune,      --Comune_IOL__c
          TO_CHAR (s.CDL3_CRDX_VAL) AS CoordX, --Coordinate_Anagrafiche__c (1)
          TO_CHAR (s.CDL3_CRDY_VAL) AS CoordY, --Coordinate_Anagrafiche__c (2)
          DECODE (s.CDD6B_CRD_AUT_FLG,  'S', 'true',  'N', 'false',  'false')
             AS CoordinateManuali,                     --Coordinate_Manuali__c
          --c.CDL0_MRST_CUST_FLG as PreScoring, --Credit_Prescoring__c
          DECODE (c.CDL0_DFES_CERT_FLG,
                  'S', 'true',
                  'N', 'false',
                  'false')
             AS DatoFiscaleEsteroCertificato, --Dato_Fiscale_Estero_Certificato__c
          s.CDL1_DENM_ALTE_DES AS DenominazioneAlternativa, --Denominazione_Alternativa__c
          SUBSTR (c.CD82_CATG_ISTA_DES, 0, 255) AS CategoriaISTAT, --IOL_CategoriaISTAT__c
          c.CD81_CATG_PREV_DES AS CategoriaMerceologica, --IOL_CategoriaMerceologica__c
          s.CDL3_DUG_DES AS DUG,                                      --DUG__c
          m.ar_eml_txt AS EmailArricchimento,         --Email_Arricchimento__c
          m.ar_eml_id AS EmailArricchimentoId,     --Email_Arricchimento_ID__c
          m.bz_eml_txt AS EmailBozze,                         --Email_Bozze__c
          m.bz_eml_id AS EmailBozzeId,                     --Email_Bozze_ID__c
          m.cs_eml_txt AS EmailCommercialeIOL,      --Email_Commerciale_IOL__c
          m.cs_eml_id AS EmailCommercialeIOLId,  --Email_Commerciale_IOL_ID__c
          m.ft_eml_txt AS EmailFatturazione,           --Email_Fatturazione__c
          m.ft_eml_id AS EmailFatturazioneId,       --Email_Fatturazione_ID__c
          m.fe_eml_txt AS EmailFattElettronica, --Email_Fatturazione_Elettronica__c
          m.fe_eml_id AS EmailFattElettronicaId, --Email_Fatturazione_Elettronica_ID__c
          m.pv_eml_txt AS EmailPostVendita,            --Email_Post_Vendita__c
          m.pv_eml_id AS EmailPostVenditaId,        --Email_Post_Vendita_ID__c
          m.ar_pec_flg AS EmailArricchimentoPECFlag, --IOL_Email_Arricchimento_PEC__c
          m.bz_pec_flg AS EmailBozzePECFlag,          --IOL_Email_Bozze_PEC__c
          m.cs_pec_flg AS EmailCommercialeIOLPECFlag, --IOL_Email_Commerciale_IOL_PEC__c
          m.ft_pec_flg AS EmailFatturazionePECFlag, --IOL_Email_Fatturazione_PEC__c
          m.fe_pec_flg AS EmailFattElettronicaPECFlag, --IOL_Email_Fatturazione_Elettronica_PEC__c
          m.pv_pec_flg AS EmailPostVenditaPECFlag, --IOL_Email_Post_Vendita_PEC__c
          DECODE (c.CDL0_ENTE_PUBB_FLG,
                  'S', 'true',
                  'N', 'false',
                  'false')
             AS EntePubblicoFlag,                           --Ente_Pubblico__c
          DECODE (c.CDL0_FATT_CFIS_FLG,
                  'S', 'true',
                  'N', 'false',
                  'false')
             AS CodiceFiscaleFatturazione,    --Fatturazione_Codice_Fiscale__c
          DECODE (c.CDL0_FATT_OBBL_FLG,
                  'S', 'true',
                  'N', 'false',
                  'false')
             AS FattElettronicaObbligatoria, --Fatturazione_Elettronica_Obbligatoria__c
          s.CDL3_FRAZ_SEAT_DES AS Frazione,                      --Frazione__c
          TO_CHAR (s.CDL3_INDI_NUM) AS IdIndirizzo,       --IOL_IndirizzoID__c
          s.CDL3_INFG_TOPN_DES AS InfoToponimo,             --Info_Toponimo__c
          s.CDL1_INSG_DES AS Insegna,                             --Insegna__c
          DECODE (c.CD44_MERC_AGGR_COD, NULL, '0', c.CD44_MERC_AGGR_COD)
             AS MercatoAggregato,                    --IOL_MercatoAggregato__c
          c.CD68_AREA_MERC_COD AS Industry,                         --Industry
          c.CDL0_NAZN_SEAT_COD AS CodiceNazione,                  --Nazione__c
          DECODE (c.CDLH_ATRB_NIP_FLG,  'S', 'SI',  'N', 'NO')
             AS PotenzialeNIP,                          --IOL_PotenzialeNIP__c
          c.CDL0_NOME_NOM AS Nome,                  --IOL_NomePersonaFisica__c
          s.CDL1_RECP_FATT_DES AS NoteRecapitoFattura, --Note_sul_Recapito_Fattura__c
          s.CDL3_CIVC_DES AS Civico,                        --Numero_Civico__c
          TO_CHAR (c.CDL0_NUMR_DIPE_NUM) AS NumeroDipendenti, --NumberOfEmployees
          s.CDL2_PDR_COD AS Opec,                                    --Opec__c
          DECODE (c.CDLH_CONS_FFVV_FLG,
                  'S', 'true',
                  'N', 'false',
                  'false')
             AS OpecConsegnabile,                    --IOL_OpecConsegnabile__c
          c.CDL0_PIVA_COD AS PartitaIva,                       --PartitaIva__c
          DECODE (s.CD46_PROF_CORD_DES,
                  NULL, 'Non definita',
                  s.CD46_PROF_CORD_COD)
             AS ProfCoordinateGeografiche, --Profondita_Coordinate_Anagrafiche__c
          s.CDL3_PROV_SEAT_DES AS Provincia,                --Provincia_IOL__c
          DECODE (c.CD28_STAT_RIAT_FLG,
                  'S', 'true',
                  'N', 'false',
                  'false')
             AS CustomerCessatoRiattivabile, --IOL_CustomerCessatoRiattivabile__c
          DECODE (s.CD28_STAT_RIAT_FLG,
                  'S', 'true',
                  'N', 'false',
                  'false')
             AS SedeCessataRiattivabile,      --IOL_SedeCessataRiattivabile__c
          s.CDL1_PRIM_SEDC_FLG AS SedePrimariaFlag,    --Sede_Primaria_OPEC__c
          DECODE (c.CDAJ_SARE_MERC_COD, NULL, 'X', c.CDAJ_SARE_MERC_COD)
             AS SottoAreaMercato,                    --IOL_SottoareaMercato__c
          c.CD71_STCL_DIPN_DES AS SottoclasseDipendenti, --IOL_SottoclasseDipendenti__c
          c.CD66_STCL_FATT_DES AS SottoclasseFatturato, --IOL_SottoclasseFatturato__c
          --s.CD47_PROS_TYPE_DES as StatoOpecCommAttualiz, --Stato_Opec_Commerciale__Attualizzato__c
          NULL AS STATOOPECCOMMATTUALIZ,
          DECODE (c.CD67_TIPO_MERC_COD, NULL, '0', c.CD67_TIPO_MERC_cod)
             AS TipoMercato,                              --IOL_TipoMercato__c
          TO_CHAR (t.t1_tel_id) AS Telefono1Id,             --Telefono_1_ID__c
          t.t1_tel_numr AS Telefono1,                                  --Phone
          NVL(t.t1_prim_flg, 'false') AS Telefono1Primario,                   --Primario1__c
          t.t1_tel_type AS TipoTelefono1,              --TipologiaTelefono1__c
          TO_CHAR (t.t2_tel_id) AS Telefono2Id,             --Telefono_2_ID__c
          t.t2_tel_numr AS Telefono2,                          --Telefono2__ c
          NVL(t.t2_prim_flg, 'false') AS Telefono2Primario,                   --Primario2__c
          t.t2_tel_type AS TipoTelefono2,              --TipologiaTelefono2__c
          TO_CHAR (t.t3_tel_id) AS Telefono3Id,             --Telefono_3_ID__c
          t.t3_tel_numr AS Telefono3,                          --Telefono3__ c
          NVL(t.t3_prim_flg, 'false') AS Telefono3Primario,                   --Primario3__c
          t.t3_tel_type AS TipoTelefono3,              --TipologiaTelefono3__c
          TO_CHAR (t.t4_tel_id) AS Telefono4Id,             --Telefono_4_ID__c
          t.t4_tel_numr AS Telefono4,                          --Telefono4__ c
          NVL(t.t4_prim_flg, 'false') AS Telefono4Primario,                   --Primario4__c
          t.t4_tel_type AS TipoTelefono4,              --TipologiaTelefono4__c
          TO_CHAR (t.t5_tel_id) AS Telefono5Id,             --Telefono_5_ID__c
          t.t5_tel_numr AS Telefono5,                          --Telefono5__ c
          NVL(t.t5_prim_flg, 'false') AS Telefono5Primario,                   --Primario5__c
          t.t5_tel_type AS TipoTelefono5,              --TipologiaTelefono5__c
          TO_CHAR (t.t6_tel_id) AS Telefono6Id,             --Telefono_6_ID__c
          t.t6_tel_numr AS Telefono6,                          --Telefono6__ c
          NVL(t.t6_prim_flg, 'false') AS Telefono6Primario,                   --Primario6__c
          t.t6_tel_type AS TipoTelefono6,              --TipologiaTelefono6__c
          TO_CHAR (t.t7_tel_id) AS Telefono7Id,             --Telefono_7_ID__c
          t.t7_tel_numr AS Telefono7,                          --Telefono7__ c
          NVL(t.t7_prim_flg, 'false') AS Telefono7Primario,                   --Primario7__c
          t.t7_tel_type AS TipoTelefono7,              --TipologiaTelefono7__c
          TO_CHAR (t.t8_tel_id) AS Telefono8Id,             --Telefono_8_ID__c
          t.t8_tel_numr AS Telefono8,                          --Telefono8__ c
          NVL(t.t8_prim_flg, 'false') AS Telefono8Primario,                   --Primario8__c
          t.t8_tel_type AS TipoTelefono8,              --TipologiaTelefono8__c
          DECODE (c.CDL0_PERS_GIUR_COD,
                  'PF', 'PF',
                  'PG', 'PG',
                  NULL, 'DD',
                  'DD')
             AS FormaGiuridica,               --Tipologia_Persona_Giuridica__c
          c.CD74_TIPO_SOCT_COD AS TipoSocGiuridica, --Tipologia_societa_giuridica__c
          s.CDL3_TOPN_STRD_DES AS Toponimo,                      --Toponimo__c
          s.CDL1_UPA_COD AS UltimaPosizioneAmministrativa, --Ultima_Posizione_Amminstrativa__c
          c.CD74_TIPO_SOCT_DES AS TipoSocieta,                          --Type
          TO_CHAR (c.CDL6_URL_NUM_FNPG) AS UrlFanPageId,   --URL_ID_Fanpage__c
          c.CDL6_URL_DES_FNPG AS UrlFanPage,                  --URL_Fanpage__c
          TO_CHAR (c.CDL6_URL_NUM_ISTZ) AS UrlIstituzionaleId, --URL_ID_Istituzionale__c
          c.CDL6_URL_DES_ISTZ AS UrlIstituzionale,                   --Website
          TO_CHAR (c.CDL6_URL_NUM_PGBI) AS UrlPagineBiancheId, --URL_ID_Pagine_Bianche__c
          c.CDL6_URL_DES_PGBI AS UrlPagineBianche,     --URL_Pagine_Bianche__c
          TO_CHAR (c.CDL6_URL_NUM_PGGI) AS UrlPagineGialleId, --URL_ID_Pagine_Gialle__c
          c.CDL6_URL_DES_PGGI AS UrlPagineGialle,       --URL_Pagine_Gialle__c
          COALESCE (c.CDAG_SPEC_CLNT_COD, 'G') AS ClienteSpecialeFlg, --IOL_CodiceIndicatoreClientiSpeciali__c
          COALESCE(c.CD0A_PRTY_COD, 'H') as Priorita
     FROM tcd0b_rp_sf_sede s
          JOIN tcd0a_rp_sf_customer c
             ON     s.cdl0_cust_cod = c.cdl0_cust_cod
                AND c.cd0a_raw_xid_des = s.cd0b_raw_xid_des
                and nvl(c.cd0a_prog_trns_des,'000') = nvl(s.cd0b_prog_trns_des,'000')
                AND s.cdl1_prim_sedc_flg = 'S'
          LEFT JOIN VCD0D_RP_SF_MAIL m
             ON     m.codicesede = s.cdl1_sede_cod
                AND m.customer = c.cdl0_cust_cod
                and m.transactionid = TO_CHAR ('' || c.CD0A_RAW_XID_DES || nvl(c.cd0a_prog_trns_des,'000'))
          LEFT JOIN VCD0C_RP_SF_TELEFONO t
             ON     t.codicesede = s.cdl1_sede_cod
                AND t.customer = c.cdl0_cust_cod
                and t.transactionid = TO_CHAR ('' || c.CD0A_RAW_XID_DES || nvl(c.cd0a_prog_trns_des,'000'))
   UNION
   SELECT TO_CHAR ('' || s.CD0b_RAW_XID_DES || nvl(s.cd0b_prog_trns_des,'000')) AS TransactionId,
          s.cdl0_cust_cod AS CustomerId,
          s.CDL1_SEDE_COD||CDL1_NVER_SEDE_COD AS CodiceSede,
          s.CD0B_TIPO_EVEN_COD AS Evento,
          NULL AS OrdCust,
          TO_CHAR (s.CD0B_RECD_NUM) AS OrdSede,
          TO_CHAR (s.cd0b_strt_trns_tim, 'YYYY-mm-DD HH:MM:SS')
             AS DataTransazione,
          s.cd0b_stat_recd_cod AS Stato,
           null as CustomerId_Old,
          s.CDL1_PREC_SEDE_COD||CDL1_PREC_NVER_SEDE_COD as CodiceSede_Old,
          NULL AS RagioneSociale,
          NULL AS AnnoFatturato,
          NULL AS AnnoFondazione,
          NULL AS AnnoRiferimentoDipendenti,
          NULL AS Fatturato,
          SUBSTR (s.CDL3_COMN_SEAT_DES, 0, 40) AS Citta,
          s.CDL3_NAZN_SEAT_DES AS NazioneSede,
          s.CDL3_PROV_SEAT_COD AS CodiceProvincia,
             s.CDL3_DUG_DES
          || ' '
          || s.CDL3_TOPN_STRD_DES
          || ' '
          || s.CDL3_CIVC_DES
             AS Indirizzo,
          'false' AS BuonoOrdine,
          s.CDL3_CAP_COD AS Cap,
          NULL AS CodiceCategoriaMassimaSpesa,
          NULL AS CategoriaMassimaSpesa,
          s.CDL3_NUCL_COMM_COD AS Cellula,
          NULL AS ClassificazionePMI,
          s.CD18_AREA_ELEN_COD AS AreaElenco,
          NULL AS CodiceCategoriaISTAT,
          NULL AS CodiceCategoriaMerceologica,
          s.CDL3_COMN_SEAT_COD AS CodiceComune,
          NULL AS StatoCustomer,
          NULL AS CodiceFiscale,
          s.CDL3_FRAZ_COD AS CodiceFrazione,
          s.CDL1_UNI_ORG_COD AS IPA,
          NULL AS CodProvinciaREA,
          NULL AS NumeroRea,
          s.CDL1_STAT_COD AS StatoSede,
          NULL AS Cognome,
          SUBSTR (s.CDL3_COMN_SEAT_DES, 0, 40) AS Comune,
          TO_CHAR (s.CDL3_CRDX_VAL) AS CoordX,
          TO_CHAR (s.CDL3_CRDY_VAL) AS CoordY,
          DECODE (s.CDD6B_CRD_AUT_FLG,  'S', 'true',  'N', 'false',  'false')
             AS CoordinateManuali,
          --null as PreScoring,
          'false' AS DatoFiscaleEsteroCertificato,
          s.CDL1_DENM_ALTE_DES AS DenominazioneAlternativa,
          NULL AS CategoriaISTAT,
          NULL AS CategoriaMerceologica,
          s.CDL3_DUG_DES AS DUG,
          m.ar_eml_txt AS EmailArricchimento,         --Email_Arricchimento__c
          m.ar_eml_id AS EmailArricchimentoId,     --Email_Arricchimento_ID__c
          m.bz_eml_txt AS EmailBozze,                         --Email_Bozze__c
          m.bz_eml_id AS EmailBozzeId,                     --Email_Bozze_ID__c
          m.cs_eml_txt AS EmailCommercialeIOL,      --Email_Commerciale_IOL__c
          m.cs_eml_id AS EmailCommercialeIOLId,  --Email_Commerciale_IOL_ID__c
          m.ft_eml_txt AS EmailFatturazione,           --Email_Fatturazione__c
          m.ft_eml_id AS EmailFatturazioneId,       --Email_Fatturazione_ID__c
          m.fe_eml_txt AS EmailFattElettronica, --Email_Fatturazione_Elettronica__c
          m.fe_eml_id AS EmailFattElettronicaId, --Email_Fatturazione_Elettronica_ID__c
          m.pv_eml_txt AS EmailPostVendita,            --Email_Post_Vendita__c
          m.pv_eml_id AS EmailPostVenditaId,        --Email_Post_Vendita_ID__c
          m.ar_pec_flg AS EmailArricchimentoPECFlag, --IOL_Email_Arricchimento_PEC__c
          m.bz_pec_flg AS EmailBozzePECFlag,          --IOL_Email_Bozze_PEC__c
          m.cs_pec_flg AS EmailCommercialeIOLPECFlag, --IOL_Email_Commerciale_IOL_PEC__c
          m.ft_pec_flg AS EmailFatturazionePECFlag, --IOL_Email_Fatturazione_PEC__c
          m.fe_pec_flg AS EmailFattElettronicaPECFlag, --IOL_Email_Fatturazione_Elettronica_PEC__c
          m.pv_pec_flg AS EmailPostVenditaPECFlag, --IOL_Email_Post_Vendita_PEC__c
          'false' AS EntePubblicoFlag,
          'false' AS CodiceFiscaleFatturazione,
          'false' AS FattElettronicaObbligatoria,
          s.CDL3_FRAZ_SEAT_DES AS Frazione,
          TO_CHAR (s.CDL3_INDI_NUM) AS IdIndirizzo,
          s.CDL3_INFG_TOPN_DES AS InfoToponimo,
          s.CDL1_INSG_DES AS Insegna,
          '0' AS MercatoAggregato,
          NULL AS Industry,
          NULL AS CodiceNazione,
          'NO' AS PotenzialeNIP,
          NULL AS Nome,
          s.CDL1_RECP_FATT_DES AS NoteRecapitoFattura,
          s.CDL3_CIVC_DES AS Civico,
          NULL AS NumeroDipendenti,
          s.CDL2_PDR_COD AS Opec,
          'false' AS OpecConsegnabile,
          NULL AS PartitaIva,
          DECODE (s.CD46_PROF_CORD_DES,
                  NULL, 'Non definita',
                  s.CD46_PROF_CORD_COD)
             AS ProfCoordinateGeografiche,
          s.CDL3_PROV_SEAT_DES AS Provincia,
          'false' AS CustomerCessatoRiattivabile, --IOL_CustomerCessatoRiattivabile__c
          DECODE (s.CD28_STAT_RIAT_FLG,
                  'S', 'true',
                  'N', 'false',
                  'false')
             AS SedeCessataRiattivabile,      --IOL_SedeCessataRiattivabile__c
          s.CDL1_PRIM_SEDC_FLG AS SedePrimariaFlag,
          'X' AS SottoAreaMercato,
          NULL AS SottoclasseDipendenti,
          NULL AS SottoclasseFatturato,
          --s.CD47_PROS_TYPE_DES as StatoOpecCommAttualiz,
          NULL AS STATOOPECCOMMATTUALIZ,
          '0' AS TipoMercato,
          TO_CHAR (t.t1_tel_id) AS Telefono1Id,
          t.t1_tel_numr AS Telefono1,
          NVL(t.t1_prim_flg, 'false') AS Telefono1Primario,
          t.t1_tel_type AS TipoTelefono1,
          TO_CHAR (t.t2_tel_id) AS Telefono2Id,
          t.t2_tel_numr AS Telefono2,
          NVL(t.t2_prim_flg, 'false') AS Telefono2Primario,
          t.t2_tel_type AS TipoTelefono2,
          TO_CHAR (t.t3_tel_id) AS Telefono3Id,
          t.t3_tel_numr AS Telefono3,
          NVL(t.t3_prim_flg, 'false') AS Telefono3Primario,
          t.t3_tel_type AS TipoTelefono3,
          TO_CHAR (t.t4_tel_id) AS Telefono4Id,
          t.t4_tel_numr AS Telefono4,
          NVL(t.t4_prim_flg, 'false') AS Telefono4Primario,
          t.t4_tel_type AS TipoTelefono4,
          TO_CHAR (t.t5_tel_id) AS Telefono5Id,
          t.t5_tel_numr AS Telefono5,
          NVL(t.t5_prim_flg, 'false') AS Telefono5Primario,
          t.t5_tel_type AS TipoTelefono5,
          TO_CHAR (t.t6_tel_id) AS Telefono6Id,
          t.t6_tel_numr AS Telefono6,
          NVL(t.t6_prim_flg, 'false') AS Telefono6Primario,
          t.t6_tel_type AS TipoTelefono6,
          TO_CHAR (t.t7_tel_id) AS Telefono7Id,
          t.t7_tel_numr AS Telefono7,
          NVL(t.t7_prim_flg, 'false') AS Telefono7Primario,
          t.t7_tel_type AS TipoTelefono7,
          TO_CHAR (t.t8_tel_id) AS Telefono8Id,
          t.t8_tel_numr AS Telefono8,
          NVL(t.t8_prim_flg, 'false') AS Telefono8Primario,
          t.t8_tel_type AS TipoTelefono8,
          'DD' AS FormaGiuridica,
          NULL AS TipoSocGiuridica,
          s.CDL3_TOPN_STRD_DES AS Toponimo,
          s.CDL1_UPA_COD AS UltimaPosizioneAmministrativa,
          NULL AS TipoSocieta,
          NULL AS UrlFanPageId,
          NULL AS UrlFanPage,
          NULL AS UrlIstituzionaleId,
          NULL AS UrlIstituzionale,
          NULL AS UrlPagineBiancheId,
          NULL AS UrlPagineBianche,
          NULL AS UrlPagineGialleId,
          NULL AS UrlPagineGialle,
          'G' AS ClienteSpecialeFlg,   --IOL_CodiceIndicatoreClientiSpeciali__c
          COALESCE(s.CD0b_PRTY_COD, 'H')
     FROM tcd0b_rp_sf_sede s
          LEFT JOIN vcd0d_rp_sf_mail m
             ON     s.cdl1_sede_cod = m.codicesede
                AND s.cdl0_cust_cod = m.customer
                and m.transactionid = TO_CHAR ('' || s.CD0b_RAW_XID_DES || nvl(s.cd0b_prog_trns_des,'000'))
          LEFT JOIN VCD0C_RP_SF_TELEFONO t
             ON     t.codicesede = s.cdl1_sede_cod
                AND t.customer = s.cdl0_cust_cod
                and t.transactionid = TO_CHAR ('' || s.CD0b_RAW_XID_DES || nvl(s.cd0b_prog_trns_des,'000'))
    WHERE s.cdl1_prim_sedc_flg = 'N';
 
