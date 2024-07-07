-- 코드를 작성해주세요
-- 출력 : 대장균개체의 수
-- 조건 : 2번형질 없고 1번혹은3번형질 보유
-- 정렬 : x

SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA AS E
WHERE E.GENOTYPE & 7 = 5 OR E.GENOTYPE & 7 = 4 OR E.GENOTYPE & 7 = 1;