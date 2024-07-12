-- 코드를 입력하세요

-- 출력 : id
-- 조건 : 자동차 종류가 세단, 10월에 대여 시작 기록 ,중복 없음
-- 정렬 : 내림차순
SELECT DISTINCT(CR.CAR_ID) as car_id
FROM CAR_RENTAL_COMPANY_CAR AS CR JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS CH
ON CR.CAR_ID = CH.CAR_ID
WHERE CR.CAR_TYPE = '세단' AND MONTH(CH.START_DATE) = '10'
order by car_id desc