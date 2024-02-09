
  CREATE OR REPLACE FORCE VIEW "DBACD1CDB"."VCD0D_RP_SF_MAIL" ("TRANSACTIONID", "CUSTOMER", "CODICESEDE", "AR_EML_ID", "AR_EML_TXT", "AR_PEC_FLG", "BZ_EML_ID", "BZ_EML_TXT", "BZ_PEC_FLG", "CS_EML_ID", "CS_EML_TXT", "CS_PEC_FLG", "FT_EML_ID", "FT_EML_TXT", "FT_PEC_FLG", "FE_EML_ID", "FE_EML_TXT", "FE_PEC_FLG", "PV_EML_ID", "PV_EML_TXT", "PV_PEC_FLG") AS 
  WITH mails
        AS (SELECT CDL0_CUST_COD,
                   CD0D_RAW_XID_DES || nvl(CD0d_PROG_TRNS_DES,'000') as CD0D_RAW_XID_DES,
                   CDL1_SEDE_COD,
                   CD0D_RECD_NUM,
                   CDL5_MAIL_NUM,
                   CDL5_MAIL_DES,
                   CDL5_EML_PEC_FLG,
                   CD35_UTEM_COD
              FROM TCD0D_RP_SF_MAIL)
   SELECT s.CD0B_RAW_XID_DES || nvl(s.CD0B_PROG_TRNS_DES,'000') AS TransactionId,
          s.CDL0_CUST_COD AS Customer,
          s.cdl1_sede_cod AS CodiceSede,
          m1.CDL5_MAIL_NUM AS AR_EML_ID,
          SUBSTR (m1.CDL5_MAIL_DES, 0, 80) AS AR_EML_TXT,
          DECODE (m1.CDL5_EML_PEC_FLG,  'S', 'true',  'N', 'false',  'false')
             AS AR_PEC_FLG,
          m2.CDL5_MAIL_NUM AS BZ_EML_ID,
          SUBSTR (m2.CDL5_MAIL_DES, 0, 80) AS BZ_EML_TXT,
          DECODE (m2.CDL5_EML_PEC_FLG,  'S', 'true',  'N', 'false',  'false')
             AS BZ_PEC_FLG,
          m3.CDL5_MAIL_NUM AS CS_EML_ID,
          SUBSTR (m3.CDL5_MAIL_DES, 0, 80) AS CS_EML_TXT,
          DECODE (m3.CDL5_EML_PEC_FLG,  'S', 'true',  'N', 'false',  'false')
             AS CS_PEC_FLG,
          m4.CDL5_MAIL_NUM AS FT_EML_ID,
          SUBSTR (m4.CDL5_MAIL_DES, 0, 80) AS FT_EML_TXT,
          DECODE (m4.CDL5_EML_PEC_FLG,  'S', 'true',  'N', 'false',  'false')
             AS FT_PEC_FLG,
          m5.CDL5_MAIL_NUM AS FE_EML_ID,
          SUBSTR (m5.CDL5_MAIL_DES, 0, 80) AS FE_EML_TXT,
          DECODE (m5.CDL5_EML_PEC_FLG,  'S', 'true',  'N', 'false',  'false')
             AS FE_PEC_FLG,
          m6.CDL5_MAIL_NUM AS PV_EML_ID,
          SUBSTR (m6.CDL5_MAIL_DES, 0, 80) AS PV_EML_TXT,
          DECODE (m6.CDL5_EML_PEC_FLG,  'S', 'true',  'N', 'false',  'false')
             AS PV_PEC_FLG
     FROM TCD0B_RP_SF_SEDE s
          LEFT JOIN mails m1
             ON     s.cdl1_sede_cod = m1.cdl1_sede_cod
                AND s.CD0B_RAW_XID_DES || nvl(s.CD0B_PROG_TRNS_DES,'000') = m1.cd0d_raw_xid_des
                AND m1.cd35_utem_cod = 'AR'
          LEFT JOIN mails m2
             ON     s.cdl1_sede_cod = m2.cdl1_sede_cod
                AND s.CD0B_RAW_XID_DES || nvl(s.CD0B_PROG_TRNS_DES,'000') = m2.cd0d_raw_xid_des
                AND m2.cd35_utem_cod = 'BZ'
          LEFT JOIN mails m3
             ON     s.cdl1_sede_cod = m3.cdl1_sede_cod
                AND s.CD0B_RAW_XID_DES || nvl(s.CD0B_PROG_TRNS_DES,'000') = m3.cd0d_raw_xid_des
                AND m3.cd35_utem_cod = 'CS'
          LEFT JOIN mails m4
             ON     s.cdl1_sede_cod = m4.cdl1_sede_cod
                AND s.CD0B_RAW_XID_DES || nvl(s.CD0B_PROG_TRNS_DES,'000') = m4.cd0d_raw_xid_des
                AND m4.cd35_utem_cod = 'FT'
          LEFT JOIN mails m5
             ON     s.cdl1_sede_cod = m5.cdl1_sede_cod
                AND s.CD0B_RAW_XID_DES || nvl(s.CD0B_PROG_TRNS_DES,'000') = m5.cd0d_raw_xid_des
                AND m5.cd35_utem_cod = 'FE'
          LEFT JOIN mails m6
             ON     s.cdl1_sede_cod = m6.cdl1_sede_cod
                AND s.CD0B_RAW_XID_DES || nvl(s.CD0B_PROG_TRNS_DES,'000') = m6.cd0d_raw_xid_des
                AND m6.cd35_utem_cod = 'PV';
 
