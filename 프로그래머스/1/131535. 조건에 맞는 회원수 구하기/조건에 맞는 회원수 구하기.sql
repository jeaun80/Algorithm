-- 코드를 입력하세요
-- 출력 : 회원의 수
-- 조건 : 2021가입회원 and 나이 20살이상 29세이하
-- 정렬 : x

SELECT COUNT(U.USER_ID)
FROM USER_INFO AS U
WHERE U.AGE <=29 AND U.AGE >=20 AND YEAR(U.JOINED) = 2021; 