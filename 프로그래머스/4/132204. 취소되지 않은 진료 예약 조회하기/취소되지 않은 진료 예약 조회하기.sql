-- 코드를 입력하세요
-- 출력 : 진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시
-- 조건 : 2022 4월 13일, 취소x 흉부외과(cs)내역
-- 정렬 : 진료예약일시 오름

-- 예약테이블에서 취소안되고 cs코드, 날짜맞는거만 추출하고 닥터테이블이랑 의사아이디로 조인, 환자테이블과 환자아이디로 조인

WITH T AS 
(SELECT APNT_YMD, APNT_NO, PT_NO, MCDP_CD, MDDR_ID
FROM APPOINTMENT
WHERE YEAR(APNT_YMD) = '2022' AND MONTH(APNT_YMD) = '04' AND DAY(APNT_YMD) = '13' AND APNT_CNCL_YN = 'N' AND MCDP_CD  = 'CS')

SELECT T.APNT_NO, P.PT_NAME, T.PT_NO, D.MCDP_CD,D.DR_NAME,T.APNT_YMD
FROM T JOIN DOCTOR AS D ON T.MDDR_ID = D.DR_ID JOIN PATIENT AS P ON T.PT_NO = P.PT_NO
ORDER BY T.APNT_YMD

# SELECT *
# FROM APPOINTMENT 
# ORDER BY APNT_YMD

# SELECT *
# FROM T 

