-- 코드를 입력하세요
-- 출력 : 자동차 종류별 몇대인지
-- 조건 : 통풍 열선 가죽 중 하나이상 옵션이 포함된 자동차
-- 정렬 : 종류기준 오름차순
SELECT C.CAR_TYPE, COUNT(C.CAR_TYPE) AS CARS
FROM CAR_RENTAL_COMPANY_CAR AS C
WHERE C.OPTIONS LIKE '%가죽%' OR C.OPTIONS LIKE '%열선%' OR C.OPTIONS LIKE '%통풍%'
GROUP BY C.CAR_TYPE
ORDER BY C.CAR_TYPE ASC