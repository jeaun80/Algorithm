-- 코드를 작성해주세요
-- 출력 : 가장 큰 물고기의 길이 (컬)
-- 조건 :  cm붙이기

SELECT CONCAT(MAX(F.LENGTH),'cm') AS MAX_LENGTH
FROM FISH_INFO AS F
