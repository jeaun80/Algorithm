-- 코드를 입력하세요
-- 출력 : 창고 id, 이름 주소 시설여부
-- 조건 : 경기도 위치, 시설여부 null이면 n출력
-- 정렬 : id기준 오름차순
SELECT F.WAREHOUSE_ID, F.WAREHOUSE_NAME,F.ADDRESS,IFNULL(F.FREEZER_YN,'N') AS FREEZER_YN
FROM FOOD_WAREHOUSE AS F
WHERE F.ADDRESS LIKE ('%경기도%')
ORDER BY F.WAREHOUSE_ID