create or replace FUNCTION           FIND_CHILD_TRANSACTIONS ( parent_Transaction in VARCHAR2 )
RETURN Varchar2
AS 
result varchar2(4000);
BEGIN 
result := '';

for r in 
    ( 
        select 
            distinct v.figlio, v.data 
        from 
            vcd0a_rp_sf_transactions_rel v
        where 
            v.padre = parent_Transaction
            and v.figlio <> parent_Transaction
        union
            select 
                p.padre, p.datapadre
            from 
                vcd0a_rp_sf_transactions_rel p
            where 
                p.padre = parent_Transaction
        order by 
            2
    )
    loop
        result := result || r.figlio || ',';
    end loop;

if length(result) > 0  
then
    select SUBSTR(result, 0, LENGTH(result) - 1)into result from dual;
end if;
return (result); 
END;