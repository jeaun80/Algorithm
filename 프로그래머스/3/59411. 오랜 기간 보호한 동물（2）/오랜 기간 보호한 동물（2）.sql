-- 코드를 입력하세요
-- 출력 : id, 이름
-- 조건 : 입양 간 동물 중 보호기간 가장긴 2명 -> (입양간 기간 - 보호시작기간) 순대로 
-- 정렬 : 보호기간이 긴순 
SELECT AO.ANIMAL_ID, AO.NAME
FROM ANIMAL_INS AS AI RIGHT JOIN ANIMAL_OUTS AS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID
ORDER BY (AO.DATETIME - AI.DATETIME) DESC
LIMIT 0,2