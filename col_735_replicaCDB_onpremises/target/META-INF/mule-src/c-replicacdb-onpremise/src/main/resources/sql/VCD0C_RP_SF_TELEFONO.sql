
  CREATE OR REPLACE FORCE VIEW "DBACD1CDB"."VCD0C_RP_SF_TELEFONO" ("TRANSACTIONID", "CUSTOMER", "CODICESEDE", "ORDNUM", "T1_TEL_ID", "T1_TEL_NUMR", "T1_TEL_TYPE", "T1_PRIM_FLG", "T2_TEL_ID", "T2_TEL_NUMR", "T2_TEL_TYPE", "T2_PRIM_FLG", "T3_TEL_ID", "T3_TEL_NUMR", "T3_TEL_TYPE", "T3_PRIM_FLG", "T4_TEL_ID", "T4_TEL_NUMR", "T4_TEL_TYPE", "T4_PRIM_FLG", "T5_TEL_ID", "T5_TEL_NUMR", "T5_TEL_TYPE", "T5_PRIM_FLG", "T6_TEL_ID", "T6_TEL_NUMR", "T6_TEL_TYPE", "T6_PRIM_FLG", "T7_TEL_ID", "T7_TEL_NUMR", "T7_TEL_TYPE", "T7_PRIM_FLG", "T8_TEL_ID", "T8_TEL_NUMR", "T8_TEL_TYPE", "T8_PRIM_FLG") AS 
  WITH telefoni
        AS (SELECT DENSE_RANK ()
                   OVER (PARTITION BY CD0C_RAW_XID_DES || nvl(cd0c_prog_trns_des,'000'), CDL1_SEDE_COD
                         ORDER BY CD0C_RECD_NUM)
                      AS n,
                   CD0C_RAW_XID_DES || nvl(cd0c_prog_trns_des,'000') as CD0C_RAW_XID_DES,
                   CDL0_CUST_COD,
                   CDL1_SEDE_COD,
                   CD0C_RECD_NUM,
                   CDL4_TELE_NUM,
                   CDL4_TELF_PREF_COD,
                   CDL4_TELF_NUMR_COD,
                   CDL4_FISS_FLG,
                   CDL4_CELL_FLG,
                   CDL4_FAX_FLG,
                   CDL4_CENT_FLG,
                   CD62_TIPO_VERD_COD,
                   CD62_TIPO_VERD_DES,
                   DECODE (CDMC_PRIM_TELS_FLG,
                           'S', 'true',
                           'N', 'false',
                           null, 'false')
                      AS CDMC_PRIM_TELS_FLG,
                   CDL4_PUBBL_FLG,
                   CDMC_ORDINE,
                   CDMC_IND_POTN_NUM,
                   CD97_FONT_CREA_COD,
                   CDL4_CREA_TIM
              FROM tcd0c_rp_sf_telefono)
   SELECT t1.CD0C_RAW_XID_DES AS TransactionId,
          t1.CDL0_CUST_COD AS Customer,
          t1.CDL1_SEDE_COD AS CodiceSede,
          t1.CD0C_RECD_NUM AS OrdNum,
          t1.CDL4_TELE_NUM AS t1_TEL_ID,
          t1.CDL4_TELF_PREF_COD || t1.CDL4_TELF_NUMR_COD AS t1_TEL_NUMR,
          CASE
             WHEN t1.CDL4_CELL_FLG = 'S'
             THEN
                'Mobile'
             WHEN t1.CDL4_FAX_FLG = 'S'
             THEN
                'Fax'
             WHEN     t1.CD62_TIPO_VERD_COD IS NOT NULL
                  AND t1.CD62_TIPO_VERD_COD >= 1
             THEN
                'Numero Verde'
             WHEN t1.CDL4_FISS_FLG = 'S' OR t1.CDL4_CENT_FLG = 'S'
             THEN
                'Fisso'
          END
             AS t1_TEL_TYPE,
          CASE
             WHEN t1.CDL1_SEDE_COD IS NOT NULL
             THEN
                NVL (t1.CDMC_PRIM_TELS_FLG, 'false')
             ELSE
                'false'
          END
             AS t1_PRIM_FLG,
          t2.CDL4_TELE_NUM AS t2_TEL_ID,
          t2.CDL4_TELF_PREF_COD || t2.CDL4_TELF_NUMR_COD AS t2_TEL_NUMR,
          CASE
             WHEN t2.CDL4_CELL_FLG = 'S'
             THEN
                'Mobile'
             WHEN t2.CDL4_FAX_FLG = 'S'
             THEN
                'Fax'
             WHEN     t2.CD62_TIPO_VERD_COD IS NOT NULL
                  AND t2.CD62_TIPO_VERD_COD >= 1
             THEN
                'Numero Verde'
             WHEN t2.CDL4_FISS_FLG = 'S' OR t2.CDL4_CENT_FLG = 'S'
             THEN
                'Fisso'
          END
             AS t2_TEL_TYPE,
          CASE
             WHEN t2.CDL1_SEDE_COD IS NOT NULL
             THEN
                NVL (t2.CDMC_PRIM_TELS_FLG, 'false')
             ELSE
                'false'
          END
             AS t2_PRIM_FLG,
          t3.CDL4_TELE_NUM AS t3_TEL_ID,
          t3.CDL4_TELF_PREF_COD || t3.CDL4_TELF_NUMR_COD AS t3_TEL_NUMR,
          CASE
             WHEN t3.CDL4_CELL_FLG = 'S'
             THEN
                'Mobile'
             WHEN t3.CDL4_FAX_FLG = 'S'
             THEN
                'Fax'
             WHEN     t3.CD62_TIPO_VERD_COD IS NOT NULL
                  AND t3.CD62_TIPO_VERD_COD >= 1
             THEN
                'Numero Verde'
             WHEN t3.CDL4_FISS_FLG = 'S' OR t3.CDL4_CENT_FLG = 'S'
             THEN
                'Fisso'
          END
             AS t3_TEL_TYPE,
          CASE
             WHEN t3.CDL1_SEDE_COD IS NOT NULL
             THEN
                NVL (t3.CDMC_PRIM_TELS_FLG, 'false')
             ELSE
                'false'
          END
             AS t3_PRIM_FLG,
          t4.CDL4_TELE_NUM AS t4_TEL_ID,
          t4.CDL4_TELF_PREF_COD || t4.CDL4_TELF_NUMR_COD AS t4_TEL_NUMR,
          CASE
             WHEN t4.CDL4_CELL_FLG = 'S'
             THEN
                'Mobile'
             WHEN t4.CDL4_FAX_FLG = 'S'
             THEN
                'Fax'
             WHEN     t4.CD62_TIPO_VERD_COD IS NOT NULL
                  AND t4.CD62_TIPO_VERD_COD >= 1
             THEN
                'Numero Verde'
             WHEN t4.CDL4_FISS_FLG = 'S' OR t4.CDL4_CENT_FLG = 'S'
             THEN
                'Fisso'
          END
             AS t4_TEL_TYPE,
          CASE
             WHEN t4.CDL1_SEDE_COD IS NOT NULL
             THEN
                NVL (t4.CDMC_PRIM_TELS_FLG, 'false')
             ELSE
                'false'
          END
             AS t4_PRIM_FLG,
          t5.CDL4_TELE_NUM AS t5_TEL_ID,
          t5.CDL4_TELF_PREF_COD || t5.CDL4_TELF_NUMR_COD AS t5_TEL_NUMR,
          CASE
             WHEN t5.CDL4_CELL_FLG = 'S'
             THEN
                'Mobile'
             WHEN t5.CDL4_FAX_FLG = 'S'
             THEN
                'Fax'
             WHEN     t5.CD62_TIPO_VERD_COD IS NOT NULL
                  AND t5.CD62_TIPO_VERD_COD >= 1
             THEN
                'Numero Verde'
             WHEN t5.CDL4_FISS_FLG = 'S' OR t5.CDL4_CENT_FLG = 'S'
             THEN
                'Fisso'
          END
             AS t5_TEL_TYPE,
          CASE
             WHEN t5.CDL1_SEDE_COD IS NOT NULL
             THEN
                NVL (t5.CDMC_PRIM_TELS_FLG, 'false')
             ELSE
                'false'
          END
             AS t5_PRIM_FLG,
          t6.CDL4_TELE_NUM AS t6_TEL_ID,
          t6.CDL4_TELF_PREF_COD || t6.CDL4_TELF_NUMR_COD AS t6_TEL_NUMR,
          CASE
             WHEN t6.CDL4_CELL_FLG = 'S'
             THEN
                'Mobile'
             WHEN t6.CDL4_FAX_FLG = 'S'
             THEN
                'Fax'
             WHEN     t6.CD62_TIPO_VERD_COD IS NOT NULL
                  AND t6.CD62_TIPO_VERD_COD >= 1
             THEN
                'Numero Verde'
             WHEN t6.CDL4_FISS_FLG = 'S' OR t6.CDL4_CENT_FLG = 'S'
             THEN
                'Fisso'
          END
             AS t6_TEL_TYPE,
          CASE
             WHEN t6.CDL1_SEDE_COD IS NOT NULL
             THEN
                NVL (t6.CDMC_PRIM_TELS_FLG, 'false')
             ELSE
                'false'
          END
             AS t6_PRIM_FLG,
          t7.CDL4_TELE_NUM AS t7_TEL_ID,
          t7.CDL4_TELF_PREF_COD || t7.CDL4_TELF_NUMR_COD AS t7_TEL_NUMR,
          CASE
             WHEN t7.CDL4_CELL_FLG = 'S'
             THEN
                'Mobile'
             WHEN t7.CDL4_FAX_FLG = 'S'
             THEN
                'Fax'
             WHEN     t7.CD62_TIPO_VERD_COD IS NOT NULL
                  AND t7.CD62_TIPO_VERD_COD >= 1
             THEN
                'Numero Verde'
             WHEN t7.CDL4_FISS_FLG = 'S' OR t7.CDL4_CENT_FLG = 'S'
             THEN
                'Fisso'
          END
             AS t7_TEL_TYPE,
          CASE
             WHEN t7.CDL1_SEDE_COD IS NOT NULL
             THEN
                NVL (t7.CDMC_PRIM_TELS_FLG, 'false')
             ELSE
                'false'
          END
             AS t7_PRIM_FLG,
          t8.CDL4_TELE_NUM AS t8_TEL_ID,
          t8.CDL4_TELF_PREF_COD || t8.CDL4_TELF_NUMR_COD AS t8_TEL_NUMR,
          CASE
             WHEN t8.CDL4_CELL_FLG = 'S'
             THEN
                'Mobile'
             WHEN t8.CDL4_FAX_FLG = 'S'
             THEN
                'Fax'
             WHEN     t8.CD62_TIPO_VERD_COD IS NOT NULL
                  AND t8.CD62_TIPO_VERD_COD >= 1
             THEN
                'Numero Verde'
             WHEN t8.CDL4_FISS_FLG = 'S' OR t8.CDL4_CENT_FLG = 'S'
             THEN
                'Fisso'
          END
             AS t8_TEL_TYPE,
          CASE
             WHEN t8.CDL1_SEDE_COD IS NOT NULL
             THEN
                NVL (t8.CDMC_PRIM_TELS_FLG, 'false')
             ELSE
                'false'
          END
             AS t8_PRIM_FLG
     FROM telefoni t1
          LEFT JOIN telefoni t2
             ON     t1.cd0c_raw_xid_des = t2.cd0c_raw_xid_des
                AND t1.cdl1_sede_cod = t2.cdl1_sede_cod
                AND t2.n = 2
          LEFT JOIN telefoni t3
             ON     t1.cd0c_raw_xid_des = t3.cd0c_raw_xid_des
                AND t1.cdl1_sede_cod = t3.cdl1_sede_cod
                AND t3.n = 3
          LEFT JOIN telefoni t4
             ON     t1.cd0c_raw_xid_des = t4.cd0c_raw_xid_des
                AND t1.cdl1_sede_cod = t4.cdl1_sede_cod
                AND t4.n = 4
          LEFT JOIN telefoni t5
             ON     t1.cd0c_raw_xid_des = t5.cd0c_raw_xid_des
                AND t1.cdl1_sede_cod = t5.cdl1_sede_cod
                AND t5.n = 5
          LEFT JOIN telefoni t6
             ON     t1.cd0c_raw_xid_des = t6.cd0c_raw_xid_des
                AND t1.cdl1_sede_cod = t6.cdl1_sede_cod
                AND t6.n = 6
          LEFT JOIN telefoni t7
             ON     t1.cd0c_raw_xid_des = t7.cd0c_raw_xid_des
                AND t1.cdl1_sede_cod = t7.cdl1_sede_cod
                AND t7.n = 7
          LEFT JOIN telefoni t8
             ON     t1.cd0c_raw_xid_des = t8.cd0c_raw_xid_des
                AND t1.cdl1_sede_cod = t8.cdl1_sede_cod
                AND t8.n = 8
    WHERE t1.n = 1;
 
