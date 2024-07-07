-- 코드를 작성해주세요

-- 출력 : id, size분류( 100이하 로우, 100이상 1000이하 미디움, 1000초과 하이)
-- 조건 : 없음
-- 저렬 : id 오름차순

SELECT E.ID,
CASE 
    WHEN E.SIZE_OF_COLONY < 100 THEN 'LOW'
    WHEN E.SIZE_OF_COLONY BETWEEN 100 AND 1000 THEN 'MEDIUM'
    WHEN E.SIZE_OF_COLONY > 1000 THEN 'HIGH'
    END AS SIZE
FROM ECOLI_DATA AS E;