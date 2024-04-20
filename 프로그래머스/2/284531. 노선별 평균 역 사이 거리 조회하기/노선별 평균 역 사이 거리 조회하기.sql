select sd.route as ROUTE, 
    concat(round(sum(sd.D_BETWEEN_DIST),2),"km") as TOTAL_DISTANCE, 
    concat(round(avg(sd.D_BETWEEN_DIST),2),"km") as AVERAGE_DISTANCE
from subway_distance as sd
group by sd.route
order by sum(sd.D_BETWEEN_DIST) desc;