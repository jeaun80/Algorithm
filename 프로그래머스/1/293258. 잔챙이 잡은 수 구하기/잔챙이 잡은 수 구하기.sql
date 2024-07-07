-- 코드를 작성해주세요
-- 출력 : 물고기의 수(컬럼명 확인)
-- 조건 : 길이가 10센치 이하

SELECT COUNT(F.ID) AS FISH_COUNT
FROM FISH_INFO AS F
WHERE F.LENGTH IS NULL;