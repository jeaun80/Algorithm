select distinct(dp.id) as ID,dp.email as EMAIL,dp.first_name as FIRST_NAME,dp.last_name as LAST_NAME
from DEVELOPERS as dp join  SKILLCODES as sc
    on (dp.SKILL_CODE & sc.code) = sc.code
where sc.name = "Python" or sc.name = "C#"
order by dp.id;