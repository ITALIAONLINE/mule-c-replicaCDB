create or replace PACKAGE body           SF_REPLICA
IS
   -- Author  : RBona

    PROCEDURE AggiornaStatoTransazione
    (
      p_TransactionId   IN       VARCHAR2,
      p_Status          IN       VARCHAR2,
      p_result          OUT      NUMBER
       )
    IS
    
        e_data_exception EXCEPTION;
        progr char(3);
        new_tr_id char(16);
    
    BEGIN
    
        p_result := 0;

        if p_TransactionId is null or  p_Status is null then
            raise e_data_exception;
        end if;
        
        if ( length(p_TransactionId) = 16 )
        then 
            begin
                update 
                    TCD0A_RP_SF_CUSTOMER
                set 
                    cd0a_stat_recd_cod = p_Status
                where 
                    to_char(''||cd0a_raw_xid_des) = p_TransactionId;
                    
                update 
                    tcd0b_rp_sf_sede
                set 
                    cd0b_stat_recd_cod = p_Status
                where 
                    to_char(''||cd0b_raw_xid_des) = p_TransactionId;
                    
                update 
                    tcd0c_rp_sf_telefono
                set 
                    cd0c_stat_recd_cod = p_Status
                where 
                    to_char(''||cd0c_raw_xid_des) = p_TransactionId;
                
                update 
                    tcd0d_rp_sf_mail
                set 
                    cd0d_stat_recd_cod = p_Status
                where 
                    to_char(''||cd0d_raw_xid_des) = p_TransactionId;
            end;
        end if;
        if ( length(p_TransactionId) = 19 ) then
        begin
            select substr(p_TransactionId, 17, 3) into progr from dual;
            select substr(p_TransactionId, 0, 16) into new_tr_id from dual;
            
            update 
                    TCD0A_RP_SF_CUSTOMER
                set 
                    cd0a_stat_recd_cod = p_Status
                where 
                    to_char(''||cd0a_raw_xid_des) = new_tr_id
                    and cd0a_prog_trns_des = progr;
                    
                update 
                    tcd0b_rp_sf_sede
                set 
                    cd0b_stat_recd_cod = p_Status
                where 
                    to_char(''||cd0b_raw_xid_des) = new_tr_id
                    and cd0b_prog_trns_des = progr;
                    
                update 
                    tcd0c_rp_sf_telefono
                set 
                    cd0c_stat_recd_cod = p_Status
                where 
                    to_char(''||cd0c_raw_xid_des) = new_tr_id
                    and cd0c_prog_trns_des = progr;
                
                update 
                    tcd0d_rp_sf_mail
                set 
                    cd0d_stat_recd_cod = p_Status
                where 
                    to_char(''||cd0d_raw_xid_des) = new_tr_id
                    and cd0d_prog_trns_des = progr;
        end;
        end if;
        --commit;
        
        EXCEPTION
        
        when e_data_exception then p_result := 1;
            --rollback;
        
        WHEN OTHERS THEN p_result := 2;
            --ROLLBACK;

    END AggiornaStatoTransazione;

PROCEDURE AggiornaStatoTransazioni 
    (
      p_Transactions    IN       ARRAY_TYPE_VARCHAR100,
      p_Status          IN       VARCHAR2,
      p_result          OUT      NUMBER
       )
    is
    
    trans_id varchar2(20);
    conta number;
   -- p_array ARRAY_TYPE_VARCHAR100;
    
    begin
    
        p_result := 0;
        conta :=0;
        
        loggamelo('sono dentro!'); 
        
        loggamelo('ho ' || p_Transactions.COUNT || ' record da elaborare!');
        
        --p_array := p_Transactions.FIRST;
        
        --loggamelo('(2) ho ' || p_array.COUNT || ' record da elaborare!');
        
        --loggamelo('p_Transactions ' || p_Transactions);
        
        for i in p_Transactions.FIRST .. p_Transactions.LAST
        loop
        loggamelo(''||conta || ': '|| p_Transactions(i));
        trans_id := p_Transactions(i);
        
        loggamelo('tr -> '|| trans_id);
        
        --INSERT INTO DBACD1CDB.SF_AAA (PIPPO) VALUES (trans_id);
        
        DBMS_OUTPUT.put_line(trans_id);
        
        update 
            TCD0A_RP_SF_CUSTOMER
        set 
            cd0a_stat_recd_cod = p_Status
        where 
            to_char(cd0a_raw_xid_des || nvl(cd0a_prog_trns_des,'000')) = trans_id;
            --or to_char('0x'||cd0a_raw_xid_des || nvl(cd0a_prog_trns_des,'000') = trans_id;
            
        update 
            tcd0b_rp_sf_sede
        set 
            cd0b_stat_recd_cod = p_Status
        where 
            to_char(cd0b_raw_xid_des || nvl(cd0b_prog_trns_des,'000')) = trans_id;
            
        update 
            tcd0c_rp_sf_telefono
        set 
            cd0c_stat_recd_cod = p_Status
        where 
            to_char(cd0c_raw_xid_des || nvl(cd0c_prog_trns_des,'000')) = trans_id;
        
        update 
            tcd0d_rp_sf_mail
        set 
            cd0d_stat_recd_cod = p_Status
        where 
            to_char(cd0d_raw_xid_des || nvl(cd0d_prog_trns_des,'000')) = trans_id;
        
        conta := conta+1;
        
        end loop;
        
        loggamelo('finito!');
        
        EXCEPTION
        
        WHEN OTHERS THEN
        loggamelo('errore '|| SQLCODE || ' ' || SQLERRM);
        p_result := 2;
        
        
        loggamelo(''||p_result);
        
    end AggiornaStatoTransazioni;
    
    PROCEDURE loggamelo 
    (
      p_message    IN       VARCHAR2
    )
    is
        PRAGMA AUTONOMOUS_TRANSACTION;
    begin
    
    INSERT INTO sf_poller_log(msg_date,msg_text)
    VALUES (sysdate, p_message);
    
    commit;
    
    end loggamelo;
    
    procedure ReadAndReserveTransactions
    (
        p_howMany   IN number,
        packets     OUT SYS_REFCURSOR
    )
    is
        arr         ARRAY_TYPE_VARCHAR100;
        arr_padri   ARRAY_TYPE_VARCHAR100;
        cnt         number;
        cnt_padri   number;
    begin
        
    arr := ARRAY_TYPE_VARCHAR100();
    cnt := 1;
    arr_padri := ARRAY_TYPE_VARCHAR100();
    cnt_padri := 1;
    
    /*
        1. seleziono i pacchetti ed i relativi padri
        2. i padri me li tengo da parte per riselezionarli alla fine (voglio uscire con un risultato di select)
        3. le transazioni (i packet spacchettati) li uso per aggiornare le tabelle di replica
    */
    
    for r in (
                /*with famiglie as
                (
                    select distinct 
                    find_child_transactions(padre) as parenti, padre, datapadre as data
                from vcd0a_rp_sf_transactions_rel --A!
                ),
                famiglie2 as
                (
                    select distinct 
                    find_child_transactions(padre) as parenti, padre, datapadre as data
                from vcd0a_rp_sf_transactions_rel --A!
                )
                select ''||sys_guid() AS guid, padre, packet, data, rank 
                from (
                select parenti AS packet, padre,
                data,
                dense_rank() over (order by data) as rank from famiglie a
                where a.data = (select min(b.data) from famiglie2 b where a.parenti = b.parenti )
                ) a
                where a.rank <= p_howMany
                order by a.rank*/
                with famiglie as
                (
                    select distinct 
                    find_child_transactions(padre) as parenti, 
                   --wm_concat(figlio) as parenti,
                    padre, datapadre as data
                from vcd0a_rp_sf_transactions_rel group by padre, datapadre --A!
                )
                select ''||sys_guid() AS guid, padre, packet, data, rank 
                from (
                select parenti AS packet, padre,
                data,
                dense_rank() over (order by a.data) as rank from famiglie a
                where a.data = (select min(b.data) from vcd0a_rp_sf_transactions_rel b where a.padre = b.padre )
                ) a
                where a.rank <= p_howMany
                order by a.rank
            )
    loop
        loggamelo('Padre: '||r.padre||', packet: '||r.packet);
        
        arr_padri.extend;
        arr_padri(cnt_padri) := r.padre;
        cnt_padri := cnt_padri+1;
        
        for t in 
        (
            select regexp_substr(r.packet,'[^,]+', 1, level) as trns from dual 
            connect by regexp_substr(r.packet, '[^,]+', 1, level) is not null
        )
        loop
            arr.extend;
            arr(cnt) := t.trns;
            cnt := cnt+1;
        end loop;
        
    end loop;
      
        update 
            TCD0A_RP_SF_CUSTOMER
        set 
            cd0a_stat_recd_cod = 'P'
        where 
            to_char(''||cd0a_raw_xid_des || nvl(CD0A_PROG_TRNS_DES,'000')) in ( select column_value from table( arr ) );
            
        update 
            tcd0b_rp_sf_sede
        set 
            cd0b_stat_recd_cod = 'P'
        where 
            to_char(''||cd0b_raw_xid_des || nvl(CD0b_PROG_TRNS_DES,'000')) in ( select column_value from table( arr ) );
            
        update 
            tcd0c_rp_sf_telefono
        set 
            cd0c_stat_recd_cod = 'P'
        where 
            to_char(''||cd0c_raw_xid_des || nvl(CD0c_PROG_TRNS_DES,'000')) in ( select column_value from table( arr ) );
        
        update 
            tcd0d_rp_sf_mail
        set 
            cd0d_stat_recd_cod = 'P'
        where 
            to_char(''||cd0d_raw_xid_des || nvl(CD0d_PROG_TRNS_DES,'000')) in ( select column_value from table( arr ) );
    
        open packets for
        with famiglie as
                (
                    select distinct 
                    find_child_transactions_p(padre) as parenti, 
                   --wm_concat(figlio) as parenti,
                    padre, datapadre as data
                from vcd0a_rp_sf_transactions_rel_p group by padre, datapadre --A!
                )
                select ''||sys_guid() AS guid, padre, packet, data, rank 
                from (
                select parenti AS packet, padre,
                data,
                dense_rank() over (order by a.data) as rank from famiglie a
                where a.data = (select min(b.data) from vcd0a_rp_sf_transactions_rel_p b where a.padre = b.padre )
                ) a
                where a.rank <= p_howMany
                order by a.rank;
        /*with famiglie as
                (
                    select distinct 
                    find_child_transactions_p(padre) as parenti, padre, datapadre as data
                from vcd0a_rp_sf_transactions_rel_p -- P! 
                ),
                famiglie2 as
                (
                    select distinct 
                    find_child_transactions_p(padre) as parenti, padre, datapadre as data
                from vcd0a_rp_sf_transactions_rel_p -- P! 
                )
                select ''||sys_guid() AS guid, padre, packet, data, rank 
                from (
                select parenti AS packet, padre,
                data,
                dense_rank() over (order by data) as rank from famiglie a
                where a.data = (select min(b.data) from famiglie2 b where a.parenti = b.parenti )
                and padre in ( select column_value from table( arr_padri ) )
                ) a
                where a.rank <= p_howMany
                order by a.rank;*/
         
        commit;
    
    end ReadAndReserveTransactions;
    
    

END SF_REPLICA;