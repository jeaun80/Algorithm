-- 코드를 입력하세요
-- 출력 : 총 주문량 맛 ( 3개)
-- 조건 : 7월 아스크림 총주문량(맛별로) + 상반기 총주문량(맛별로) 이 큰순서 중 3개만 추출
-- july테이블은 맛별로 그루핑후 토탈오더 sum한뒤 상반기테이블과 맛으로 조인한다
-- 이후 줄라이출하량 + 상반기 출하량 으로 정렬하고 리밋3
WITH JU AS
(SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL
FROM JULY
GROUP BY FLAVOR)

SELECT FH.FLAVOR
FROM JU RIGHT JOIN FIRST_HALF AS FH ON JU.FLAVOR = FH.FLAVOR
ORDER BY (JU.TOTAL+FH.TOTAL_ORDER) DESC
LIMIT 3


# SELECT *
# FROM FIRST_HALF
