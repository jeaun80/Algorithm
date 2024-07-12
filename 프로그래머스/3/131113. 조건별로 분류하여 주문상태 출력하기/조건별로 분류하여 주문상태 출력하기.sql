-- 코드를 입력하세요
-- 출력 : 주문id ,제품 id , 출고일자, 출고여부
-- 조건 : 출고날짜 5.1일 이전=  출고완료 , 이후 날짜 출고 대기  null 출고미정
SELECT FO.ORDER_ID, FO.PRODUCT_ID,DATE_FORMAT(FO.OUT_DATE,'%Y-%m-%d') AS OUT_DATE
        , CASE
        WHEN FO.OUT_DATE <='2022-05-01' THEN '출고완료'
        WHEN FO.OUT_DATE > '2022-05-01' THEN '출고대기'
        WHEN ISNULL(FO.OUT_DATE) THEN '출고미정'
        END AS '출고여부'
FROM FOOD_ORDER AS FO
ORDER BY FO.ORDER_ID ASC
