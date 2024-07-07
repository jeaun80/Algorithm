-- 코드를 작성해주세요
-- 출력 : 물고기 id,  길이(컬럼명 확인)
-- 조건 : 길이 가장큰 물고기 10마리만
-- 정렬 : 1차 길이기준 내림차순 2차 id 오름차순

SELECT F.ID AS ID, F.LENGTH AS LENGTH
FROM FISH_INFO AS F
ORDER BY F.LENGTH DESC, F.ID ASC
LIMIT 0,10;
