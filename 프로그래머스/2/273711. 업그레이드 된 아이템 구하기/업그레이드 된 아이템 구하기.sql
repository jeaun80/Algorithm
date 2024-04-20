
select iii.ITEM_ID, iii.ITEM_NAME,iii.RARITY
from
(select it.item_id
from item_tree it join
(select *
from item_info as ii
where ii.RARITY = "RARE") as i
on i.ITEM_ID = it.PARENT_ITEM_ID) as st
join item_info as iii
on iii.ITEM_ID = st.item_id
order by iii.item_id desc;

