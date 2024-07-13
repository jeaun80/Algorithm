-- 코드를 작성해주세요
-- 출력 : 물고기 잡은 수 ,최대길이, 물고기 종류
-- 조건 : 평균깅이 33이상, 종류별, 10센치이하는 10센치로 취급후 평균계산
-- 정렬 : x
# D null처리한 뒤 33이상인거만 종류를 리턴한다. 이후 카운트센다
-- 일단 테이블을 하나만든다. 
# 평균길이가 33센치이상인 물고기
# 10센치이하인 물고기들 10센치로 취급하는 물고기테이블 생성
# -> 물고기테이블 이용해서 평균길이 33센치이상인 물고기의 종류만 출력하는 평종 테이블생성
# -> 평종 테이블과 같은 종류인놈들만 카운트하고 맥스길이 종류 출력
WITH FISH AS
(SELECT ID,FISH_TYPE,IFNULL(LENGTH,10) AS 'LEN'
FROM FISH_INFO),
FISH_AVG AS
(SELECT FISH_TYPE,AVG(LEN) AS LENGTH
FROM FISH
GROUP BY FISH_TYPE
HAVING AVG(LEN) >= 33) 

SELECT COUNT(FA.FISH_TYPE) AS FISH_COUNT, MAX(F.LEN) AS MAX_LENGTH, F.FISH_TYPE
FROM FISH_AVG AS FA JOIN FISH AS F ON F.FISH_TYPE = FA.FISH_TYPE
GROUP BY FA.FISH_TYPE
ORDER BY FA.FISH_TYPE