-- 코드를 입력하세요
-- 출력 : 전체 
-- 조건 : 네비게이션 옵션 포함
-- 정렬 : 자동차id 내림차순
SELECT *
FROM CAR_RENTAL_COMPANY_CAR AS C
WHERE C.OPTIONS LIKE ('%네비게이션%')
ORDER BY C.CAR_ID DESC