
  CREATE OR REPLACE FORCE VIEW "DBACD1CDB"."VCD0A_RP_SF_TRANSACTIONS_REL_P" ("PADRE", "DATA", "FIGLIO", "DATAPADRE") AS 
  WITH transactionsCustomerState
        AS (SELECT DISTINCT
                   TO_CHAR ('' || CD0A_RAW_XID_DES || cd0a_prog_trns_des) AS TransactionId,
                   CDL0_CUST_COD AS CustomerId,
                   cd0a_stat_recd_cod AS Stato,
                   CD0A_STRT_TRNS_TIM AS TransactionDate
              FROM TCD0A_RP_SF_CUSTOMER
            UNION
            SELECT DISTINCT TO_CHAR ('' || CD0B_RAW_XID_DES || cd0b_prog_trns_des),
                            CDL0_CUST_COD,
                            CD0B_STAT_RECD_COD,
                            CD0B_STRT_TRNS_TIM
              FROM TCD0B_RP_SF_SEDE)
   SELECT DISTINCT t1.transactionid AS Padre,
                   t2.transactiondate AS data,
                   t2.transactionid AS Figlio,
                   t1.transactiondate AS DATAPADRE
     FROM transactionsCustomerState t1, transactionsCustomerState t2
    WHERE --t1.CustomerId in ( select distinct CustomerId from transactionsCustomerState t2 where t2.transactionid = '0004001400E0BB28' )
         t1.customerid = t2.customerid AND t1.Stato = 'P' AND t2.stato = 'P';
 
