select sum(price) as TOTAL_PRICE
from item_info as ii
where ii.RARITY = "LEGEND"