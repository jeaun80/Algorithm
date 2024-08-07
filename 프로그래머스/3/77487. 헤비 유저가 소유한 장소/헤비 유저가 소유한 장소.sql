-- 코드를 입력하세요
-- 출력 : 전체
-- 조건 : 공간을 2개이상 소유한 호스트의 공간 전체
-- 정렬 : 아이디순 오름차순

SELECT P.ID,P.NAME,P.HOST_ID
FROM PLACES AS P JOIN (
SELECT HOST_ID,COUNT(HOST_ID) AS CNT_ID
FROM PLACES
GROUP BY HOST_ID
HAVING COUNT(HOST_ID)>1) AS F ON P.HOST_ID = F.HOST_ID
ORDER BY P.ID



