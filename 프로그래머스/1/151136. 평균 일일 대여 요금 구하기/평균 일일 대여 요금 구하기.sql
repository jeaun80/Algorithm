-- 코드를 입력하세요

-- 출력 : 평균 일일대여요금, 소수첫번째자리에서 반올림 컬러명 AVERAGE_FEE
-- 조건 : 자동차 종류가 에스유브이

SELECT ROUND(AVG(C.DAILY_FEE),0) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR AS C
WHERE C.CAR_TYPE = 'SUV'