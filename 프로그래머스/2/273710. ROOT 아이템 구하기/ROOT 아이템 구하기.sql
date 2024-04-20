select ii.item_id,ii.item_name
from 
item_info as ii join
(select *
from ITEM_TREE as it 
where it.PARENT_ITEM_ID is null) as i
on ii.ITEM_ID = i.ITEM_ID
order by ii.item_id;
