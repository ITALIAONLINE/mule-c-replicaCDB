
  CREATE OR REPLACE FORCE VIEW "DBACD1CDB"."VCD0A_RP_SF_TRANSACTIONS_REL" ("PADRE", "DATA", "FIGLIO", "DATAPADRE") AS 
  WITH transactionsCustomerState
        AS (SELECT DISTINCT
                   TO_CHAR ('' || a.CD0A_RAW_XID_DES || NVL(a.CD0A_PROG_TRNS_DES,'000')) AS TransactionId,
                   a.CDL0_CUST_COD AS CustomerId,
                   a.cd0a_stat_recd_cod AS Stato,
                   a.CD0A_STRT_TRNS_TIM AS TransactionDate
              FROM TCD0A_RP_SF_CUSTOMER a 
              join TCD0B_RP_SF_SEDE b 
                on a.CD0A_RAW_XID_DES = b.CD0b_RAW_XID_DES and a.CD0A_PROG_TRNS_DES = b.CD0B_PROG_TRNS_DES
                and a.CDL0_CUST_COD = b.CDL0_CUST_COD
                and b.CDL1_PRIM_SEDC_FLG = 'S'
            UNION
            SELECT DISTINCT TO_CHAR ('' || CD0B_RAW_XID_DES || NVL(CD0B_PROG_TRNS_DES,'000')),
                            CDL0_CUST_COD,
                            CD0B_STAT_RECD_COD,
                            CD0B_STRT_TRNS_TIM
            FROM TCD0B_RP_SF_SEDE
            WHERE CDL1_PRIM_SEDC_FLG = 'N'
            minus
            SELECT DISTINCT TO_CHAR ('' || CD0B_RAW_XID_DES || NVL(CD0B_PROG_TRNS_DES,'000')),
                            CDL0_CUST_COD,
                            CD0B_STAT_RECD_COD,
                            CD0B_STRT_TRNS_TIM
            FROM TCD0B_RP_SF_SEDE a
            WHERE CDL1_PRIM_SEDC_FLG = 'S' and not exists (select 1 from TCD0A_RP_SF_CUSTOMER b where CD0A_RAW_XID_DES = CD0b_RAW_XID_DES and CD0B_PROG_TRNS_DES = CD0A_PROG_TRNS_DES and a.CDL0_CUST_COD = b.CDL0_CUST_COD)
            minus
            SELECT DISTINCT
                   TO_CHAR ('' || a.CD0A_RAW_XID_DES) AS TransactionId,
                   a.CDL0_CUST_COD AS CustomerId,
                   a.cd0a_stat_recd_cod AS Stato,
                   a.CD0A_STRT_TRNS_TIM AS TransactionDate
            FROM TCD0A_RP_SF_CUSTOMER a
            WHERE NOT EXISTS (select 1 from TCD0B_RP_SF_SEDE b where CD0A_RAW_XID_DES = CD0b_RAW_XID_DES and CD0B_PROG_TRNS_DES = CD0A_PROG_TRNS_DES and a.CDL0_CUST_COD = b.CDL0_CUST_COD and b.CDL1_PRIM_SEDC_FLG = 'S')
                )
   SELECT DISTINCT t1.transactionid AS Padre,
                   t2.transactiondate AS data,
                   t2.transactionid AS Figlio,
                   t1.transactiondate AS DATAPADRE
     FROM transactionsCustomerState t1, transactionsCustomerState t2
    WHERE --t1.CustomerId in ( select distinct CustomerId from transactionsCustomerState t2 where t2.transactionid = '0004001400E0BB28' )
         t1   .customerid = t2.customerid
          AND t1.Stato = 'A'
          AND t2.stato = 'A'
          AND NOT EXISTS
                     (SELECT 1
                        FROM transactionsCustomerState t3
                       WHERE     t3.customerid = t1.customerid
                             AND t3.stato IN ('K', 'Q'));
 
