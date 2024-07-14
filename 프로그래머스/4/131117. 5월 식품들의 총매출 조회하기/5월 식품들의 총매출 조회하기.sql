-- 코드를 입력하세요
-- 출력 : 아이디 이름, 총매출
-- 조건 : 생산일자 2022 05월
-- 정렬 : 총매출 내림차순, 아이디 오름차순
-- 총매출 = 어마운트 * 프라이스
-- 테이블 생산일자 2022 5월인 테이블 생성
-- 조인 프로덕트테이블 프로덕트id로 
-- 그룹핑 식품id (집계 어마운트) * 프라이스 

# -- 총매출도 5월동안의 총매출로 하자 
# SELECT * 
# FROM FOOD_PRODUCT
SELECT FP.PRODUCT_ID, FP.PRODUCT_NAME, (FR.AMO * FP.PRICE) AS TOTAL_SALES
FROM FOOD_PRODUCT AS FP JOIN 
(SELECT PRODUCT_ID, SUM(AMOUNT) AS AMO
FROM FOOD_ORDER 
WHERE YEAR(PRODUCE_DATE) = '2022' AND MONTH(PRODUCE_DATE) = '05'
GROUP BY PRODUCT_ID) AS FR
ON FP.PRODUCT_ID = FR.PRODUCT_ID
ORDER BY TOTAL_SALES DESC , FP.PRODUCT_ID