CREATE OR REPLACE PACKAGE DBACD1CDB.SF_REPLICA
IS
   -- Author  : RBona

    PROCEDURE AggiornaStatoTransazione 
    (
      p_TransactionId   IN       VARCHAR2,
      p_Status          IN       VARCHAR2,
      p_result          OUT      NUMBER
       );
    
    PROCEDURE AggiornaStatoTransazioni 
    (
      p_Transactions    IN       ARRAY_TYPE_VARCHAR100,
      p_Status          IN       VARCHAR2,
      p_result          OUT      NUMBER
       );
    
    PROCEDURE loggamelo 
    (
      p_message    IN       VARCHAR2
    );
    
     procedure ReadAndReserveTransactions
    (
        p_howMany IN number,
        packets     OUT SYS_REFCURSOR
    );

END SF_REPLICA;

