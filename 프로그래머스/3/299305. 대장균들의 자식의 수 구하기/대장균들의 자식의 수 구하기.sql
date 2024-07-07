-- 코드를 작성해주세요
-- 출력 : 대장균id, 자식의 수 - 대장균id당 자식의 수 출력 자식이 없으면 0으로 치환
-- 조건 : 
-- 정렬 : id 오름차순 

SELECT E.ID, COUNT(C.ID) AS CHILD_COUNT
FROM ECOLI_DATA AS E LEFT JOIN ECOLI_DATA AS C ON E.ID = C.PARENT_ID
GROUP BY E.ID
ORDER BY E.ID