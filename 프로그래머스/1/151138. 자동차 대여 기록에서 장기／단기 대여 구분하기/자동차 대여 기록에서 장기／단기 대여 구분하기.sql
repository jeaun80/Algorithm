-- 코드를 입력하세요
-- 출력 : 대여기록전체 (날짜별 컬럼 추가 렌트타입)
-- 조건 : 대여시작일 2022 9월,
-- 정렬 : id 내림차순 
SELECT C.HISTORY_ID, C.CAR_ID,DATE_FORMAT(C.START_DATE,'%Y-%m-%d') as START_DATE,DATE_FORMAT(C.END_DATE,'%Y-%m-%d') as END_DATE,
CASE 
WHEN DATEDIFF(C.END_DATE,C.START_DATE)+1 >=30 THEN '장기 대여'
WHEN DATEDIFF(C.END_DATE,C.START_DATE) <=30 THEN '단기 대여'
END AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS C
WHERE YEAR(C.START_DATE) = 2022 AND MONTH(C.START_DATE) = 09
ORDER BY C.HISTORY_ID DESC